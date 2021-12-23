package com.zhsl.kf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloZhsl {
@RequestMapping("/hi")
    public String hello(){
        System.out.println("hello");
        return "hello";
    }

}
