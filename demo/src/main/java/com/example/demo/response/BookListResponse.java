package com.example.demo.response;

import com.example.demo.BookEntity.BookEntity;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class BookListResponse extends BaseResponse {

    public BookListResponse(Iterable<BookEntity> data) {
        super(true, "Список книг");
        this.data = data;
    }

    private Iterable<BookEntity> data;

    @Override
    public String toString(){
        return "Книги из библиотеки\n" + data;
    }
}
