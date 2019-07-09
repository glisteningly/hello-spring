package com.example.hello.entity;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String userName;
    @Getter
    @Setter
    private String note;
}
