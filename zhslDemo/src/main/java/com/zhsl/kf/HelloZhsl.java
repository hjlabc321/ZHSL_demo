package com.zhsl.kf;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloZhsl {
    public void hello(){
        System.out.println("hello");
    }

}
