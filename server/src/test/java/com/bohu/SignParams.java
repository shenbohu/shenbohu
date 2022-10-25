package com.bohu;


import lombok.SneakyThrows;
import org.assertj.core.util.DateUtil;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @ClassName SignParams
 * @Author shenbohu
 * @Date 2022/6/2415:32
 * @Version 1.0
 **/
public class SignParams {
    private static final String[] HEX_DIGITS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
    private static final String AES_PKCS5P = "AES/ECB/PKCS5Padding";


    @SneakyThrows
    public static void main(String[] args) {

        long a = System.currentTimeMillis();
        Timestamp ts = new Timestamp(a);
        //System.out.println(a);
        java.sql.Date date = new java.sql.Date(ts.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = sdf.format(date);
        //System.out.println(time);
        Map<String, Object> signParams = new HashMap<>(16);
        signParams.put("syscode", "bisp-test");
        signParams.put("timestamp", time);
        String unencryptedStr = getUnencryptedStr(signParams);

        String sign = md5Encode("123456" + unencryptedStr + "123456", null);
        signParams.put("sign", sign.toUpperCase(Locale.ROOT));
        System.out.println(signParams);

        String d = "2018-05-14T03:51:50Z";
        Date date1 = DateUtil.parse(d);


        System.out.println(date1);


        //获取一个密钥生成器实例
        String key = "2222222222222222";
        String str = "12123123";
        byte[] raw = key.getBytes("UTF-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        // "算法/模式/补码方式"
        Cipher cipher = Cipher.getInstance(AES_PKCS5P);
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
        byte[] encrypted = cipher.doFinal(str.getBytes("UTF-8"));
        // 此处使用BASE64做转码功能，同时能起到2次加密的作用。
        String encode = new BASE64Encoder().encode(encrypted);
        System.out.println(encode);


    }

    public static String md5Encode(String origin, String charsets) {
        String resultString = origin;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (null == charsets || "".equals(charsets)) {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes()));
            } else {
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsets)));
            }
        } catch (Exception e) {
        }
        return resultString;
    }

    public static String byteArrayToHexString(byte[] b) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    public static String byteToHexString(byte b) {
        int n = b;
        if (n < 0) {
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return HEX_DIGITS[d1] + HEX_DIGITS[d2];
    }


    public static String getUnencryptedStr(Map<String, Object> signParams) {
        List<String> paramsList = new ArrayList<>();
        for (String key : signParams.keySet()) {
            if ("sign".equals(key)) {
                continue;
            }
            String value = (String) signParams.get(key);
            paramsList.add(key + value);
        }
        Object[] paramsArray = (Object[]) paramsList.toArray();
        Arrays.sort(paramsArray);
        String unencryptedStr = "";
        for (Object paramStr : paramsArray) {
            unencryptedStr += paramStr;
        }

        return unencryptedStr;
    }

}
