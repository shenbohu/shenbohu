package com.bohu.controller;

import com.bohu.service.SseEmitterServer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;

import javax.annotation.Resource;

/**
 * @ClassName NotifyController
 * @Author shenbohu
 * @Date 2022/9/29 10:10
 * @Version 1.0
 **/

@RestController
@RequestMapping("/sse")
public class NotifyController {

    @Resource
    private SseEmitterServer sseEmitterServer;


    @GetMapping("/connect/{userId}")
    public SseEmitter connect(@PathVariable String userId) {
        return sseEmitterServer.connect(userId);
    }

    @GetMapping("/push/{message}")
    public ResponseEntity<String> push(@PathVariable(name = "message") String message) {
        sseEmitterServer.batchSendMessage(message);
        return ResponseEntity.ok("送消息给所有人");
    }

}
