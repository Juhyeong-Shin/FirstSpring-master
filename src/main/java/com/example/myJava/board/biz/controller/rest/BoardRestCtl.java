package com.example.myJava.board.biz.controller.rest;

import com.example.myJava.board.biz.dao.BoardDao;


import com.example.myJava.board.biz.svc.BoardSvc;
import com.example.myJava.board.biz.vo.model.TnBoard;
import com.example.myJava.board.biz.vo.model.TnWorld;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/board", produces = MediaType.APPLICATION_JSON_VALUE)
public class BoardRestCtl {

    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BoardSvc boardSvc;

    @PostMapping("/openBoardList.do")
    public ModelAndView openBoardList() throws Exception {
        ModelAndView mv = new ModelAndView("/board/boardList");
        List<TnBoard> list = boardSvc.selectBoardList();
        mv.addObject("list", list);

        log.debug("로그");

        System.out.println(list);

        return mv;
    }

    @RequestMapping("/worldList")
    public ResponseEntity<?> worldList(@ModelAttribute TnWorld tnWorld){
        String result = boardSvc.worldList(tnWorld);
        return worldList(tnWorld);
    }

//    @RequestMapping("/board/insertBoard.do")
//    public String insertBoard(BoardDao board) throws Exception{
//        boardService.insertBoard(board);
//        return "redirect:/board/openBoardList.do";
//    }

}

