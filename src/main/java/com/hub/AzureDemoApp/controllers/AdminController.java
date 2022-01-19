package com.hub.AzureDemoApp.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/admin/")
@Slf4j
public class AdminController {
    @GetMapping(value = "allPayments")
    public Mono<ResponseEntity<Object>> all() {
        log.info("Request to get all payments");

        return Mono.just(ResponseEntity.ok("Test"));
    }
}
