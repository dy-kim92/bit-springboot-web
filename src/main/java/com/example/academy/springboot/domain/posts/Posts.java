package com.example.academy.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor  //  기본생성자 자동생성
@Entity     //  테이블과 연결
@Getter     //  Getter 자동생성
public class Posts extends BaseTimeEntity{

    @Id     //  Primary key field
    @GeneratedValue(strategy = GenerationType.IDENTITY)     //  auto_increament
    private Long id;

    @Column(length = 500, nullable = false)     //  제목의 길이 500, null 불가능
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

}
