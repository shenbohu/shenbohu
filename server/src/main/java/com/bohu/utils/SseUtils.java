package com.bohu.utils;

import com.bohu.service.SseEmitterServer;
import com.spire.doc.FileFormat;
import com.spire.doc.Section;
import com.spire.doc.TextWatermark;
import com.spire.doc.documents.WatermarkLayout;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/**
 * @ClassName SseUtils
 * @Author shenbohu
 * @Date 2022/9/29 10:34
 * @Version 1.0
 **/
public class SseUtils {

    private static final Logger logger = LoggerFactory.getLogger(SseEmitterServer.class);

    /**
     * 当前连接数
     */
    private static AtomicInteger count = new AtomicInteger(0);

    /**
     * 使用map对象，便于根据userId来获取对应的SseEmitter，或者放redis里面
     */
    private static Map<String, SseEmitter> sseEmitterMap = new ConcurrentHashMap<>();

    /**
     * 创建用户连接并返回 SseEmitter
     * @param employeeCode 用户ID
     * @return SseEmitter
     */
    public static SseEmitter connect(String employeeCode) {
        // 设置超时时间，0表示不过期。默认30秒，超过时间未完成会抛出异常：AsyncRequestTimeoutException
        SseEmitter sseEmitter = new SseEmitter(0L);
        // 注册回调
        sseEmitter.onCompletion(completionCallBack(employeeCode));
        sseEmitter.onError(errorCallBack(employeeCode));
        sseEmitter.onTimeout(timeoutCallBack(employeeCode));
        sseEmitterMap.put(employeeCode, sseEmitter);
        // 数量+1
        count.getAndIncrement();
        logger.warn("创建新的sse连接，当前用户：{}", employeeCode);
        return sseEmitter;
    }

    /**
     * 给指定用户发送信息
     * @param employeeCode
     * @param jsonMsg
     */
    public static void sendMessage(String employeeCode, String jsonMsg) {
        try {
            SseEmitter emitter = sseEmitterMap.get(employeeCode);
            if (emitter == null) {
                logger.warn("sse用户[{}]不在注册表，消息推送失败", employeeCode);
                return;
            }
            emitter.send(jsonMsg, MediaType.APPLICATION_JSON);
        } catch (IOException e) {
            logger.error("sse用户[{}]推送异常:{}", employeeCode, e.getMessage());
            removeUser(employeeCode);
        }
    }

    /**
     * 群发消息
     * @param jsonMsg
     * @param employeeCodes
     */
    public static void batchSendMessage(String jsonMsg, List<String> employeeCodes) {
        employeeCodes.forEach(employeeCode -> sendMessage(jsonMsg, employeeCode));
    }

    /**
     * 群发所有人
     * @param jsonMsg
     */
    public static void batchSendMessage(String jsonMsg) {
        sseEmitterMap.forEach((k, v) -> {
            try {
                v.send(jsonMsg, MediaType.APPLICATION_JSON);
            } catch (IOException e) {
                logger.error("用户[{}]推送异常:{}", k, e.getMessage());
                removeUser(k);
            }
        });
    }

    /**
     * 移除用户连接
     */
    public static void removeUser(String employeeCode) {
        SseEmitter emitter = sseEmitterMap.get(employeeCode);
        if(emitter != null){
            emitter.complete();
        }
        sseEmitterMap.remove(employeeCode);
        // 数量-1
        count.getAndDecrement();
        logger.warn("移除sse用户：{}", employeeCode);
    }

    /**
     * 获取当前连接信息
     */
    public static List<String> getIds() {
        return new ArrayList<>(sseEmitterMap.keySet());
    }

    /**
     * 获取当前连接数量
     */
    public static int getUserCount() {
        return count.intValue();
    }

    private static Runnable completionCallBack(String employeeCode) {
        return () -> {
            logger.warn("结束sse用户连接：{}", employeeCode);
            removeUser(employeeCode);
        };
    }

    private static Runnable timeoutCallBack(String employeeCode) {
        return () -> {
            logger.warn("连接sse用户超时：{}", employeeCode);
            removeUser(employeeCode);
        };
    }

    private static Consumer<Throwable> errorCallBack(String employeeCode) {
        return throwable -> {
            logger.warn("sse用户连接异常：{}", employeeCode);
            removeUser(employeeCode);
        };
    }



}
