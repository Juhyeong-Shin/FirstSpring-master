package com.example.myJava.board.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class BoardDto {
    private int boardIdx;

    private String title;

    private String contents;

    private int hitCnt;

    private String creatorId;

    private LocalDateTime createdDatetime;

    private String updaterId;

    private String updatedDatetime;
}
