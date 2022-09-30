package com.bohu.service;

import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

public interface SseEmitterServer {


    SseEmitter connect(String userId);

    void batchSendMessage(String message);
}
