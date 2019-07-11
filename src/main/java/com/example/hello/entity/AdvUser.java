package com.example.hello.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AdvUser {
    @Value("2")
    @Getter
    @Setter
    private Long id;
    @Value("adv_user_name")
    @Getter
    @Setter
    private String userName;
    @Value("note_2")
    @Getter
    @Setter
    private String note;
}
