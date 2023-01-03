package com.example.myJava.board.biz.dao;

import com.example.myJava.board.biz.vo.model.TnBoard;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BoardDao {
    abstract List<TnBoard> selectBoardList() throws Exception;


}
