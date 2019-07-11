package com.example.hello.aop.service.impl;

import com.example.hello.aop.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        if (name == null || name.trim().equals("")) {
            throw new RuntimeException("Parameter is null!!");
        }
        System.out.println("hello " + name);
    }
}
