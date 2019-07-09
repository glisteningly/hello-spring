package com.example.hello.config;

import com.example.hello.entity.User;
import com.example.hello.config.AdvUser;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTest {
    private static Logger log = LogManager.getLogger(User.class);

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = ctx.getBean(User.class);
        AdvUser advUser = (AdvUser) ctx.getBean("advUser");
        log.info(user.getUserName());
        log.info(advUser.getUserName());
    }
}
