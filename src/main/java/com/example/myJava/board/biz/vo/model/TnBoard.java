package com.example.myJava.board.biz.vo.model;

import lombok.Data;
import org.apache.ibatis.type.Alias;

import java.time.LocalDateTime;

@Alias("TnBoard")
@Data
public class TnBoard {
    private int boardIdx;

    private String title;

    private String contents;

    private int hitCnt;

    private String creatorId;

    private LocalDateTime createdDatetime;

    private String updaterId;

    private String updatedDatetime;
}

