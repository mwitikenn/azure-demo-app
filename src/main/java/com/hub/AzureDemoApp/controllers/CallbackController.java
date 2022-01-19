package com.hub.AzureDemoApp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/callback/")
@Slf4j
public class CallbackController {
    @PostMapping(value = "paymentResult")
    public Mono<ResponseEntity<Object>> all() {
        log.info("Incoming callback");
        return Mono.just(ResponseEntity.ok("Test"));
    }
}
