package com.heroxu.zipkin.serverc.controller;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class ServiceCController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/servicec")
    public String servicec() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("This is service c!");
        return "hello,this is server c!";
    }
}