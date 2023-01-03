package com.example.myJava.mapper;


import com.example.myJava.board.biz.dao.BoardDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDao> selectBoardList() throws Exception;
}
