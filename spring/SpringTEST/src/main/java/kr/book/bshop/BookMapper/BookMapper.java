package kr.book.bshop.BookMapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import kr.book.bshop.BookVO.BookVO;
@Mapper
public interface BookMapper {

	public List<BookVO> bookList();

	public void bookInsert(BookVO vo);

}
