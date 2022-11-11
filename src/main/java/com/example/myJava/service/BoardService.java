package com.example.myJava.service;

import com.example.myJava.dto.BoardDto;
import java.util.List;

public interface BoardService {

    List<BoardDto> selectBoardList() throws Exception;
}
