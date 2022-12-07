package com.sparta.hanghaeblog.entity;

import com.sparta.hanghaeblog.dto.BlogRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Entity
@NoArgsConstructor
public class Blog extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private int pw;

    @Column(nullable = false)
    private String subject;

    @Column(nullable = false)
    private String contents;

    public Blog(String username, int pw, String subject, String contents) {
        this.username = username;
        this.pw = pw;
        this.subject = subject;
        this.contents = contents;
    }

    public Blog(BlogRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.pw = requestDto.getPw();
        this.subject = requestDto.getSubject();
        this.contents = requestDto.getContents();
    }

    public void update(BlogRequestDto blogRequestDto) {
        this.subject = blogRequestDto.getSubject();
        this.contents = blogRequestDto.getContents();
    }


}