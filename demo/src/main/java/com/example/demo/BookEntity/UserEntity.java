package com.example.demo.BookEntity;


import lombok.Data;

@Data
public class UserEntity {

    private Long id;

    private String name;

    private String password;

    private Boolean role;

}
