package com.smhrd.database;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.smhrd.model.BoardVO;

@Mapper // 이 인터페이스는 Mapper 역할을 할 것이다.
public interface Boardmapper {
	// Spring과 myBatis를 연결 해주는 interface
	// > myBatis에 요청하고 싶은 SQL문방과 데이터 타입을 기술

	// 기능별로 메서드 생성
	
	//1. 전체 게시글 조회
	// 중괄호가 없는 메서드 = 추상 메서드
	// 추상메서드를 포함할 수 있는 인터페이스로 변경
	public List<BoardVO> BoardList();
}