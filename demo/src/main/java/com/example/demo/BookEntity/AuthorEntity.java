package com.example.demo.BookEntity;


import lombok.Data;
import java.util.List;

@Data
public class AuthorEntity {

    private Long id;

    private String name;

    private String lastName;
    private String surName;

    private List<BookEntity> book;

    @Override
    public String toString(){
        return  "Фамилия автора: " + name + '\n' +
                "Имя автора: " + lastName + '\n' +
                "Отчество автора: " + surName + '\n' +
                '\n';
    }
}
