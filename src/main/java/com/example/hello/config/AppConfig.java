package com.example.hello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.example.hello.entity.User;

@Configuration
@ComponentScan(value = "com.example.hello.*", lazyInit = true)
public class AppConfig {
    @Bean(name = "user")
    public User initUser() {
        User user = new User();
        user.setId(1L);
        user.setUserName("user_name");
        user.setNote("note_1");
        return user;
    }
}
