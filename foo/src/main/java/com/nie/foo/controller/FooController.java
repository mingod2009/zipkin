package com.nie.foo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Random;

/**
 * Created by sam on 2017/11/3.
 */
@RestController
public class FooController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/foo")
    public String foo() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return restTemplate.getForObject("http://localhost:8882/bar", String.class);
    }
}
