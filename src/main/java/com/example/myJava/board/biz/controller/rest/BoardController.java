package com.example.myJava.board.biz.controller.rest;

import com.example.myJava.board.biz.dao.BoardDao;
import com.example.myJava.board.biz.svc.BoardService;


import com.example.myJava.board.biz.vo.model.TnBoard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/api/v1/board", produces = MediaType.APPLICATION_JSON_VALUE)
public class BoardController {

    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BoardService boardService;

    @RequestMapping("/board/openBoardList.do")
    public ModelAndView openBoardList() throws Exception {
        ModelAndView mv = new ModelAndView("/board/boardList");
        List<TnBoard> list = boardService.selectBoardList();
        mv.addObject("list", list);


        log.debug("로그");

        System.out.println(list);

        return mv;
    }

//    @RequestMapping("/board/openBoardWrite.do")
//    public String openBoardWrite() throws Exception{
//        return "/board/boardWrite";
//    }
//
//    @RequestMapping("/board/insertBoard.do")
//    public String insertBoard(BoardDao board) throws Exception{
//        boardService.insertBoard(board);
//        return "redirect:/board/openBoardList.do";
//    }
//
//    @RequestMapping("/board/openBoardDetail.do")
//    public ModelAndView openBoardDetail(@RequestParam int boardIdx) throws Exception{
//        ModelAndView mv = new ModelAndView("/board/boardDetail");
//
//        BoardDao board = boardService.selectBoardDetail(boardIdx);
//        mv.addObject("board", board);
//
//        System.out.println(mv);
//
//        return mv;
//    }
//
//    @RequestMapping("/board/updateBoard.do")
//    public String updateBoard(BoardDao board) throws Exception{
//        boardService.updateBoard(board);
//        return "redirect:/board/openBoardList.do";
//    }
//
//    @RequestMapping("/board/deleteBoard.do")
//    public String deleteBoard(int boardIdx) throws Exception{
//        boardService.deleteBoard(boardIdx);
//        return "redirect:/board/openBoardList.do";
//    }

}

