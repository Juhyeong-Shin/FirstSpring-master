package com.example.myJava.board.service;


import com.example.myJava.board.dto.BoardDto;

import java.util.List;

public interface BoardService {

    List<BoardDto> selectBoardList() throws Exception;
}
