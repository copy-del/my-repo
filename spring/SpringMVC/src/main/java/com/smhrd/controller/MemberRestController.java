package com.smhrd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.smhrd.mapper.MemberMapper;
import com.smhrd.model.MemberVO;
//@Controller + @ResponseBody를 포함하는 어노테이션
@RestController
public class MemberRestController {

	// Spring에서 비동기 통신으로 요청이 들어오면
	// 순수하게 데이터만 돌려주는 controller의 메서드를 분리해서 사용
	// Rest
	// Represent State Transfer의 약자
	// 데이터만 되돌려주면 요청을 한 주체에서 해당하는 데이터를 활용하는 방식 결정
	
	@Autowired
	MemberMapper mapper;
	
	@RequestMapping("/searchMember")
	public List<MemberVO> searchMember(@RequestParam String search) {
		// 1. Member테이블에서 이메일, search정보가 포함된 모든 행 가져오는 sql구문 작성
		List<MemberVO> result = mapper.searchMember(search);
		// 2. eclipse콘솔에 조회한 데이터 출력
		System.out.println(result);
		// 3. result 데이터를 전송
		return result;
	}
	
	// ResponseBody : 메서드의 리턴값을 viewname이 아니라 화면에 출력하고 싶을 때 사용.
	@RequestMapping("/EMAILCheck")
	public Map<String, Boolean> EMAILCheck(@RequestParam String EMAIL) {
		int result = mapper.EMAILCheck(EMAIL);
		boolean available = false;
		if(result==0) {
			//같은 이메일 존재 X
			System.out.println("중복 없음");
			available = true;
		}
		// hash map (자료구조)
		Map<String, Boolean> response = new HashMap<>();
		response.put("available", available);
		return response;
	}
}
