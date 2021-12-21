package com.example.zhsl_demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBoot {
    @RequestMapping("hi")
    public void hello(){
        System.out.println("hello boot~~");
    }
    @RequestMapping("hello")
    public String hello1(){
        System.out.println("hello1");
        return "abc";
    }
}
