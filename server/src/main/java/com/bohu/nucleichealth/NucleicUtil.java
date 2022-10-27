package com.bohu.nucleichealth;

import cn.hutool.core.lang.UUID;
import cn.hutool.crypto.Mode;
import cn.hutool.crypto.Padding;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.symmetric.AES;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Random;


/**
 * @ClassName NucleicUtil
 * @Author shenbohu
 * @Date 2022/7/2509:46
 * @Version 1.0
 **/
public class NucleicUtil {

    private static final String SIGN_PATTERN = "appCode=%s,body=%s,interfaceCode=%s,nonceStr=%s,timestamp=%s";

    private static String sign(String appCode, String body, String interfaceCode, String nonceStr, Long timestamp) {
        String str = String.format(SIGN_PATTERN, appCode, body, interfaceCode, nonceStr, timestamp);
        //System.out.println(str);
        return SecureUtil.md5(str);
    }

    public static void main(String[] args) throws Exception {
        Integer lastRNAResult = null;
        String lastRNATime = null ;
        // 向数字重庆申请获取的appCode
        String appCode = "6855CB4F025D3CA81F4BAC268645A67C";
        // 向数字重庆申请获取6的appKey
        String dataKey = "0722F1AC0A3AACD3";
        // 向数字重庆申请获取的iv
        final String iv = "28f1f2c86896d845";
        Long timestamp = System.currentTimeMillis();
        // 接口代码
        String interfaceCode = "A17_000004";
        String nonceStr = UUID.fastUUID().toString(true);
        JSONObject bodyJson = new JSONObject();
        // 业务参数
        bodyJson.put("idCardNo", "510122200012272864");
        String body = bodyJson.toJSONString();
        ApiRequestDataDto dataDto = new ApiRequestDataDto();
        dataDto.setBody(body);
        dataDto.setInterfaceCode(interfaceCode);
        dataDto.setNonceStr(nonceStr);
        dataDto.setTimestamp(timestamp);
        AES aes = new AES(Mode.CBC, Padding.PKCS5Padding, dataKey.getBytes(StandardCharsets.UTF_8), iv.getBytes());
        String data = aes.encryptBase64(JSON.toJSONString(dataDto));
        String signature = sign(appCode, body, interfaceCode, nonceStr, timestamp);
//        System.out.println(data);
//        System.out.println(signature);
        // 接口地址
        final String url = "https://ykm.bigdatacq.com:10218/v1/open-api";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        // 32位随机字符串
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 32; i++) {
            int number = random.nextInt(62);
            stringBuffer.append(str.charAt(number));
        }
        headers.set("request-id", stringBuffer.toString());
        JSONObject json = new JSONObject();
        json.put("appCode", appCode);
        json.put("data", data);
        json.put("signature", signature);
        HttpEntity<JSONObject> param = new HttpEntity<>(json, headers);
        NucleicPojo n = new NucleicPojo();
        String result = restTemplate.postForObject(url, param, String.class);
        if (result != null) {
            HashMap hashMap = JSON.parseObject(result, HashMap.class);
            String cdata = (String) hashMap.get("data");
            if (StringUtils.isNotEmpty(cdata)) {
                HashMap dhashMap = JSON.parseObject(cdata, HashMap.class);
                lastRNAResult = (Integer) dhashMap.get("lastRNAResult");
                lastRNATime = (String) dhashMap.get("lastRNATime");
            }
        }

        System.out.println(lastRNAResult);
        System.out.println(lastRNATime);
        System.out.println(result);
    }


}
