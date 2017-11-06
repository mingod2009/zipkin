package com.nie.bar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

/**
 * Created by sam on 2017/11/3.
 */
@RestController
public class BarController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/bar")
    public String bar() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return restTemplate.getForObject("http://localhost:8883/hello", String.class);
    }
}
