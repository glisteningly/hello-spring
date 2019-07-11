package com.example.hello.aop;

import com.example.hello.aop.intercept.MyInterceptor;
import com.example.hello.aop.proxy.ProxyBean;
import com.example.hello.aop.service.HelloService;
import com.example.hello.aop.service.impl.HelloServiceImpl;

public class Test {
    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        // 按约定获取proxy
        HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
        proxy.sayHello("胖喵");
        System.out.println("\n############## name is null ##############");
        proxy.sayHello(null);
    }
}
