package com.example.demo.response;

import com.example.demo.BookEntity.PublisherEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class PublisherListResponse extends BaseResponse{
    public PublisherListResponse(Iterable<PublisherEntity> data){
        super(true,"Издательства");
        this.data = data;
    }
    private Iterable<PublisherEntity> data;
}
