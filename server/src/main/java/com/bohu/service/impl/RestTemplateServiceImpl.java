package com.bohu.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bohu.entity.Result;
import com.bohu.entity.StatusCode;
import com.bohu.nucleichealth.RasClientDetail;
import com.bohu.nucleichealth.RasClientDetailSoap;
import com.bohu.nucleichealth.RsaCoderUtil;
import com.bohu.pojo.Hdnucleic;
import com.bohu.pojo.HdnucleicRow;
import com.bohu.pojo.Health;
import com.bohu.pojo.User;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.joda.time.DateTime;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import com.bohu.entity.YmlConfig;

import com.bohu.service.RestTemplateService;
import lombok.Data;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


import static com.bohu.nucleichealth.Main.bytesToHex;
import static com.bohu.nucleichealth.Main.getSignParams;


/**
 * @ClassName UserServiceImpl
 * @Author shenbohu
 * @Date 2021/5/1910:20 上午
 * @Version 1.0
 **/
@Service
@Configuration
@Data
public class RestTemplateServiceImpl implements RestTemplateService {


    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private YmlConfig ymlConfig;

    private static final Log log = LogFactory.getLog(RestTemplateService.class);

    @Override
    public Result healthCodeStatusById(String id) throws Exception {

        String key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQClCIirK3sPsQuoegV1r+4qIzPUUvHjCd64LNuBK+Mac/xhnuIRP+xvs09JoS3U6+LzDhtWjltuwwr2MC0lkLm8uKB5LiQ6tpBFvcc4a4Z1IeHoYEko7M/h4nxMC6aZrukxA0paiKO7AEfsK1ZEOTO+x4Dmj667CZMUDTL/u9b/vQIDAQAB";
        String idkey = RsaCoderUtil.encryptBase64(RsaCoderUtil.encryptByPublicKey(id, key));
        String url = "https://cq.tgovcloud.com/ebus/wyj/wyj-extend/api/person/health/v9";
        //header参数
        HttpHeaders headers = new HttpHeaders();
        String paassid = "kbaf";
        String token = "ROdCFIX6YUtYUv0Dgf9BD44jY8miEQS3";
        String nonce = "123456789abcdefg";
        long now = System.currentTimeMillis();
        int timestamp = Integer.parseInt(String.valueOf(now / 1000));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String aaa = timestamp + token + nonce + timestamp;
        byte[] hash = messageDigest.digest(aaa.getBytes("UTF-8"));
        String b = bytesToHex(hash).toUpperCase();
        headers.add("x-tif-paasid", paassid);
        headers.add("x-tif-nonce", "123456789abcdefg");
        headers.add("x-tif-timestamp", String.valueOf(timestamp));
        headers.add("x-tif-signature", b);
        // headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        Date max = null;
        String type = "-1";
        Integer result = -1;
        String reason = "-1";

        //提交参数设置
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("platform", paassid);
        //map.add("data", " {\"card_no\":\"LUh7wz/bF3ZRTL4UTXnSaueQ2dQl9JWnpCHLO2MWE5ZclBRxpwySRvjIKpIq6GjoD+HvyRe8ySGAJAZNggeR6a5Gj5bxhWnh5gTLjZA+qjviuLVP0c/uR6TflE6L5pdu68NGg83WHSSuVSmgYkvoPZfPrFkYqp3IqXc3wJckmio=\"}");
        map.add("data", " {\"card_no\":\" " + idkey + "\"}");
        map.add("timestamp", String.valueOf(timestamp));
        map.add("sign", "23456789abcdefg");
        HttpEntity<MultiValueMap<String, String>> request =
                new HttpEntity<MultiValueMap<String, String>>(map, headers);
        Health health = restTemplate.postForObject(url, request, Health.class);
        if (health != null && Objects.equals("success", health.getErrmsg())) {
            LinkedHashMap data = health.getData();
            if (data != null) {
                Object oresult = data.get("result");
                reason = (String) data.get("reason");
                if (oresult != null) {
                    result = (Integer) oresult;
                }

            }
        }

        log.info(health);


        RasClientDetail rasClientDetails = new RasClientDetail();
        RasClientDetailSoap rasClientDetailSoap = rasClientDetails.getRasClientDetailSoap();
        String clientId = "中国民用航空重庆安全监督管理局（重庆航空）";
        String clientGuid = "2AA70E3447484E7AA90CBDC36A9F9BCF";
        byte bytevalue = 2;
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");//日期格式
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -14);
        Date startDate = calendar.getTime();
        //513030199201300010
        String c = rasClientDetailSoap.getDetailDataByIdNum(clientId, clientGuid, id, bytevalue, format.format(startDate), format.format(new Date()));
        if (StringUtils.isNotEmpty(c) && c.contains("完成")) {
            List<Date> dates = new ArrayList<>();
            List<String> finals = new ArrayList<>();
            Document parse = Jsoup.parse(c);
            Elements blood = parse.getElementsByTag("blood");//
            blood.forEach(bs -> {
                Elements aFinal = bs.getElementsByTag("FINAL");
                Elements collectddate = bs.getElementsByTag("COLLECTDDATE");
                String text = collectddate.text();
                String ainal = aFinal.text();
                Date date = new DateTime(text).toDate();
                dates.add(date);
                finals.add(ainal);
//                System.out.println(text);
//                System.out.println(ainal);
            });
            if (CollectionUtils.isNotEmpty(dates)) {

                max = Collections.max(dates);
                int i = dates.indexOf(max);
                type = finals.get(i);
            }
        } else {

            Map<String, Object> smap = getSignParams("bisp-test", "123456");
            String sign = (String) smap.get("sign");
            String timestamp1 = (String) smap.get("timestamp");
            //提交参数设置
            MultiValueMap<String, String> map1 = new LinkedMultiValueMap<>();
            url = "https://hbms.bgi.com/bisp-all2/intf?method=findReportSummary";
            //440883198901020015
            String idsfz = id;
            map1.add("timestamp", timestamp1);
            map1.add("sign", sign);
            map1.add("syscode", "bisp-test");
            map1.add("params", "{\"cardId\":\"" + idsfz + "\"}");
            headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
            HttpEntity<MultiValueMap<String, String>> request1 =
                    new HttpEntity<MultiValueMap<String, String>>(map1, headers);
            Hdnucleic hdnucleic = restTemplate.postForObject(url, request1, Hdnucleic.class);
            List<HdnucleicRow> rows = hdnucleic.getRows();
            List<String> dates = new ArrayList<>();
            List<String> isPositives = new ArrayList<>();
            if (CollectionUtils.isNotEmpty(rows)) {
                for (HdnucleicRow row : rows) {
                    String sampleTestDatePre = row.getSampleTestDatePre();
                    String sampleTestTimePre = row.getSampleTestTimePre();
                    String sampleTestDateSims = row.getSampleTestDateSims();
                    String sampleTestTimeSims = row.getSampleTestTimeSims();
                    String isPositive = row.getIsPositive();
                    if (!Objects.equals("00000000", sampleTestDatePre)) {
                        dates.add(sampleTestDatePre + sampleTestTimePre);
                        isPositives.add(isPositive);
                    } else if (!Objects.equals("00000000", sampleTestDateSims)) {
                        dates.add(sampleTestDateSims + sampleTestTimeSims);
                        isPositives.add(isPositive);
                    }
                }
            }
            format = new SimpleDateFormat("yyyyMMddHHmmss");//日期格式
            if (CollectionUtils.isNotEmpty(dates)) {
                String maxs = Collections.max(dates);
                max = format.parse(maxs);
                int i = dates.indexOf(maxs);
                type = isPositives.get(i);
            }
        }

        Map<String, Object> mapvalue = new HashMap();
        switch (type) {
            case "阴性":
                type = "1";
                break;
            case "阳性":
                type = "2";
                break;
            case "Y":
                type = "2";
                break;
            case "N":
                type = "1";
                break;
            case "F":
                type = "0";
                break;
            default:
        }
        mapvalue.put("max", max);
        mapvalue.put("type", type);
        mapvalue.put("result", result);
        mapvalue.put("reason", reason);

        log.info(max + "--------" + type);
        return new Result(true, StatusCode.OK, mapvalue);
    }

    /**
     * 以get方式请求第三方http接口 getForEntity
     *
     * @param url
     * @return
     */
    public String doGetWith1(String url) {
        url = "https://cover.yixinda.com/cover-device?companyId=111";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        String body = responseEntity.getBody();
        return body;
    }

    /**
     * 以get方式请求第三方http接口 getForObject
     * 返回值返回的是响应体，省去了我们再去getBody()
     *
     * @param url
     * @return
     */
    public User doGetWith2(String url) {
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }

    /**
     * 以post方式请求第三方http接口 postForEntity
     *
     * @param url
     * @return
     */
    public String doPostWith1(String url) {
        User user = new User();
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, user, String.class);
        String body = responseEntity.getBody();
        return body;
    }

    /**
     * 以post方式请求第三方http接口 postForEntity
     *
     * @param url
     * @return
     */
    public String doPostWith2(String url) {
        User user = new User();
        String body = restTemplate.postForObject(url, user, String.class);
        return body;
    }

    /**
     * exchange
     *
     * @return
     */
    public String doExchange(String url, Integer age, String name) {
        //header参数
        HttpHeaders headers = new HttpHeaders();
        String token = "asdfaf2322";
        headers.add("authorization", token);
        headers.setContentType(MediaType.APPLICATION_JSON);

        //放入body中的json参数
        JSONObject obj = new JSONObject();
        obj.put("age", age);
        obj.put("name", name);

        //组装
        HttpEntity<JSONObject> request = new HttpEntity<>(obj, headers);
        String s = request.toString();
        return s;
    }


}
