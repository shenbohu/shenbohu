package com.bohu.service.impl;

import com.bohu.service.RestTemplateService;
import com.bohu.service.SseEmitterServer;
import com.bohu.utils.SseUtils;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName SseEmitterServerImpl
 * @Author shenbohu
 * @Date 2022/9/29 10:15
 * @Version 1.0
 **/
@Service
public class SseEmitterServerImpl  implements SseEmitterServer {

    private static final Logger logger = LoggerFactory.getLogger(SseEmitterServer.class);

    /**
     * 当前连接数
     */
    private static AtomicInteger count = new AtomicInteger(0);

    /**
     * 使用map对象，便于根据userId来获取对应的SseEmitter，或者放redis里面
     */
    private static Map<String, SseEmitter> sseEmitterMap = new ConcurrentHashMap<>();


    private static final Log log = LogFactory.getLog(RestTemplateService.class);


    @Override
    public SseEmitter connect(String employeeCode) {
        SseEmitter connect = SseUtils.connect(employeeCode);
        return connect;
    }

    @Override
    public void batchSendMessage(String message) {
        SseUtils.batchSendMessage(message);
    }




}
