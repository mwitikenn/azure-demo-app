package com.hub.AzureDemoApp.utils;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@EnableScheduling
@Slf4j
public class TokenUtil {
    @Value("${app.daraja.consumerKey}")
    private String darajaConsumerKey;

    @Value("${app.daraja.consumerSecret}")
    private String darajaConsumerSecret;

    @Value("${app.daraja.authUrl}")
    private String darajaAuthUrl;

    private String darajaToken;

    @Scheduled(fixedDelayString = "${app.daraja.tokenRefreshPeriod}")
    public void generateToken() {
        log.info("Gen");
    }

    public String getDarajaToken() {
        return this.darajaToken;
    }
}
