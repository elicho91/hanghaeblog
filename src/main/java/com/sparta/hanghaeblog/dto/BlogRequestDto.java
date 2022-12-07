package com.sparta.hanghaeblog.dto;

import lombok.Getter;

@Getter
public class BlogRequestDto {

    private String username;
    private int pw;
    private String subject;
    private String contents;
}