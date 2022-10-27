package com.bohu.nucleichealth;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        try {
            String key = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQClCIirK3sPsQuoegV1r+4qIzPUUvHjCd64LNuBK+Mac/xhnuIRP+xvs09JoS3U6+LzDhtWjltuwwr2MC0lkLm8uKB5LiQ6tpBFvcc4a4Z1IeHoYEko7M/h4nxMC6aZrukxA0paiKO7AEfsK1ZEOTO+x4Dmj667CZMUDTL/u9b/vQIDAQAB";
            String a = RsaCoderUtil.encryptBase64(RsaCoderUtil.encryptByPublicKey("440883198901020015", key));
            System.out.println( a);
        } catch (Exception e) {
            e.printStackTrace();
        }



        Map<String,Object> map = getSignParams("bisp-test","123456");
        System.out.println("s" + map.get("sign"));
    }

    public static String bytesToHex(byte[] bytes)
    {
        StringBuffer sb = new StringBuffer();
        if (bytes != null && bytes.length > 0)
        {
            for (int i = 0; i < bytes.length; i++) {
                String hex = byteToHex(bytes[i]);
                sb.append(hex);
            }
        }
        return sb.toString();
    }

    public static String byteToHex(byte b)
    {
        String hexString = Integer.toHexString(b & 0xFF);
        if (hexString.length() < 2)
        {
            hexString = new StringBuilder(String.valueOf(0)).append(hexString).toString();
        }
        return hexString.toUpperCase();
    }


    public static Map<String, Object> getSignParams(String sysCode, String secret) {
        long a = System.currentTimeMillis();
        Timestamp ts = new Timestamp(a);
        //System.out.println(a);
        java.sql.Date date = new java.sql.Date(ts.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        //System.out.println(time);
        Map<String, Object> signParams = new HashMap<>(16);
        signParams.put("syscode", sysCode);
        signParams.put("timestamp", time);
        String unencryptedStr = getUnencryptedStr(signParams);
        String sign = Md5Util.md5Encode(secret + unencryptedStr + secret, null);
        signParams.put("sign", sign.toUpperCase(Locale.ROOT));
        return signParams;
    }

    public static String getUnencryptedStr(Map<String, Object> signParams){
        List<String> paramsList=new ArrayList<>();
        for(String key:signParams.keySet()){
            if("sign".equals(key)){
                continue;
            }
            String value=(String) signParams.get(key);
            paramsList.add(key+value);
        }
        Object[] paramsArray=(Object[]) paramsList.toArray();
        Arrays.sort(paramsArray);
        String unencryptedStr="";
        for(Object paramStr: paramsArray){
            unencryptedStr+=paramStr;
        }

        return unencryptedStr;
    }


}
