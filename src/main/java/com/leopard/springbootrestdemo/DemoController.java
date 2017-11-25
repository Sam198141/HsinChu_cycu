package com.leopard.springbootrestdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */

@RestController
public class DemoController {
    @RequestMapping("/")
    String home(){
        return "hello root ";
    }

    @RequestMapping("/test")
    public String test(){
        return "my first springboot test";
    }
}
