package com.heroxu.zipkindemo.servera.controller;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class ServiceAController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/servicea")
    public String servicea() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("This is service a!");
        return restTemplate.getForObject("http://localhost:8082/serviceb", String.class);
    }
}