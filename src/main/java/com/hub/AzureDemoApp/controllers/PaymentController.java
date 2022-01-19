package com.hub.AzureDemoApp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/api/payments/")
@Slf4j
public class PaymentController {
    @PostMapping(value = "makePayment")
    public Mono<ResponseEntity<Object>> all() {
        String paymentIdStr = UUID.randomUUID().toString();

        log.info("Incoming payment for processing ");
        return Mono.just(ResponseEntity.ok("Test"));
    }
}
