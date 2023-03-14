package com.example.demo.BookEntity;


import lombok.Data;
@Data
public class BookEntity {
    private Long id;
    private String title;
    private AuthorEntity author;
    private PublisherEntity publishing;
    private int year;
    private String kind;

    @Override
    public String toString(){
        return "\nНазвание: " + title + '\n' +
                "Автор: \n" + author + '\n' +
                "Издательство: " + publishing + '\n' +
                "Год издания: " + year + '\n' +
                "Жанр: " + kind + '\n' +
                '\n';
    }
}
