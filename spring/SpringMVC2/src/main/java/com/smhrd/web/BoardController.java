package com.smhrd.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.smhrd.database.Boardmapper;
import com.smhrd.model.BoardVO;


@Controller //일반 java클래스가 아닌 컨트롤러임을 명시!
public class BoardController {
	
	//jsp/servlet에서 DB실습 프로세스
	// .jsp > Controller(servlet) > DAO > Mapper > DB 
	@Autowired // 자동으로 연결 요청.
	Boardmapper mapper;
	
	@RequestMapping("/BoardList")
	public String BoardList(Model model) {
		// 전체 게시글 조회 하는 기능 > BoardMapper.java(인터페이스)의 Boardlist메서드 실행
//		Boardmapper b1 = new BoardMapper();  '인터페이스'는 객체 생성 불가.
		List<BoardVO> list = mapper.BoardList();
		model.addAttribute("list",list);
		return "Board";
		
	}

	// Board.jsp를 실행하게끔 코드 작성!!
	// Board.jsp로 이동하면 캡쳐해서 카톡방에 올려주세용
	@RequestMapping("/Board")
	public String board() {
		
		return "Board";
		
	}
	
	
	
}
