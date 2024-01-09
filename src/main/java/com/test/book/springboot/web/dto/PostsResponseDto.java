package com.test.book.springboot.web.dto;

import com.test.book.springboot.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {

    //commmit 123
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity){
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
