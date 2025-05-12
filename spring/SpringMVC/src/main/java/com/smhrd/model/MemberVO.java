package com.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor		// 모든 매개변수를 받아 필드 초기화하는 생성자
@NoArgsConstructor		// 기본 생성자
public class MemberVO {
	
	// 회원 데이터를 저장할 수 있도록 나만의 자료형 지정.
	// 1. 필드값

	private String EMAIL;
	private String PW;
	private String TEL;
	private String ADDRESS;
	
	
	
	
	
	
	
	
}
