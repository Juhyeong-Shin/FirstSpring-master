package com.example.myJava.board.biz.svc;


import com.example.myJava.board.biz.dao.BoardDao;
import com.example.myJava.board.biz.vo.model.TnBoard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BoardService {

    @Autowired
    private BoardDao boardDao;

    public List<TnBoard> selectBoardList() throws Exception {
        return boardDao.selectBoardList();
    }

//    @Override
//    public void insertBoard(BoardDao board) throws Exception {
//        boardMapper.insertBoard(board);
//    }

}