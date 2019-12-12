package com.heroxu.zipkindemo.serverb.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class ServiceBController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "/serviceb")
    public String serviceb() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("This is service b!");
        return restTemplate.getForObject("http://localhost:8083/servicec", String.class);
    }
}