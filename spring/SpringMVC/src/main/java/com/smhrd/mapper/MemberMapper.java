package com.smhrd.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.smhrd.model.MemberVO;

@Mapper
public interface MemberMapper {
	
	public void join(MemberVO vo);
	public MemberVO login(MemberVO vo);
	public void logout(MemberVO vo);
	public void update(MemberVO vo);
	
	// MySql 쿼리문 작성 규칙
	// like 특정문자열 %% : 특정 문자열 %% 로 시작 or 끝나는 데이터 검색.
	@Select("select * from MEMBER where EMAIL not like '%admin%'")
	public List<MemberVO> select();
	
	@Delete("delete from MEMBER where EMAIL = #{EMAIL}") // MemberMapper.xml에 작성하지 않고 쿼리문 만들기
	public int delete(String EMAIL);
	
	// EMAIL 체크하는 Sql 쿼리문
	public int EMAILCheck(String EMAIL);
	
	
	
	
	
	
}
