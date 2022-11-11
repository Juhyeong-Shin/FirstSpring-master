package com.example.myJava.mapper;

import org.apache.ibatis.annotations.
import com.example.myJava.dto.BoardDto;
import java.util.List;

@Mapper
public interface BoardMapper {
    List<BoardDto> selectBoardList() throws Exception;
}
