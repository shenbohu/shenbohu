package com.bohu.Controller.utils;

import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * @ClassName HttpUtils
 * @Author shenbohu
 * @Date 2022/6/2502:52
 * @Version 1.0
 **/



public class HttpUtils {
    public static void copyImageStream(InputStream inputStream,OutputStream outputStream){
        try {
            IOUtils.copy(inputStream,outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
