package com.example.demo.response;

import com.example.demo.BookEntity.BookEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class BookResponse extends BaseResponse {
    public BookResponse(boolean success, String message, BookEntity publishing){
        super(success, message);
        this.publishing = publishing;
    }
    public BookResponse(BookEntity publishing){ super(true, "Publishing data"); }
    private BookEntity publishing;
}
