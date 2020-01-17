package com.jojoldu.book.springboot.web.dto;


import com.jojoldu.book.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter //get 메소드 생성
@NoArgsConstructor //기본 생성자 자동 추가
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;


    @Builder
    public PostsSaveRequestDto(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;

    }

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }

}
