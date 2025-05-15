package kr.book.bshop.BookController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.book.bshop.BookMapper.BookMapper;
import kr.book.bshop.BookVO.BookVO;

@RestController
public class BookController {

	@Autowired
	BookMapper mapper;
	
	@RequestMapping("/bookList.do")
	public void bookList(Model model) {
		List<BookVO> list=mapper.bookList();
		model.addAttribute("list",list);
		
	}
	
	@RequestMapping("/bookInsert.do")
	public String bookInsert(BookVO vo) {
		mapper.bookInsert(vo);
		return "bookList";
	}
	
	
	
	
	
}
