package com.smhrd.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok : 어노테이션을 이용하여 사용한다.

@Data	// getter,setter 자동 생성
@AllArgsConstructor // 모든 생성자 생성
@NoArgsConstructor
public class BoardVO {

	// 게시글 데이터 1개(1행)를 표현할 수 있는 나만의 자료형(객체)
	// String,int, 날짜 데이터를 한꺼번에 묶어서 표현가능한 자료형
	
		// 1. 필드
		private int IDX;
		private String TITLE;
		private String CONTENTES;
		private String WIRTER;
		private Date INDATE;
}
