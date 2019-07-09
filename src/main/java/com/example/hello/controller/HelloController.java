package com.example.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Map<String, String> index() {
        Map<String, String> map = new HashMap<>();
        map.put("hello", "world");
        System.out.println("hello world!");
        return map;
    }

    @RequestMapping("/test")
    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>();
        map.put("My", "test");
        System.out.println("my test");
        return map;
    }
}