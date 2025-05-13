package com.smhrd.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.cj.Session;
import com.smhrd.mapper.MemberMapper;
import com.smhrd.model.MemberVO;

@Controller
public class MemberController {
	
	//MemberMapper는 인터페이스이기에 객체 생성 불가
	// @AutoWired 사용
	@Autowired
	MemberMapper mapper;
	
	@PostMapping("/join") // 자료형 통일
	public String join(MemberVO vo, Model model) {
		mapper.join(vo);
		// 페이지 이동 방법
		// 1) redirect
		// URL 변경 O, request/response 2번 사용
		// 2) forward
		// URL 변경 X, request/response 1번 사용
		// viewNmae을 리턴해서 이동하는 방식 = 포워드
		// model.addAttribute("모델에 저장되는 이름", 모델에 실제 저장되는 값)
		model.addAttribute("EMAIL",vo.getEMAIL());
		// 포워드 방식으로 이동했을 때, 새로고침하면 동일한 계정이 DB에 재등록된다.
		// > redirect 방식을 사용
		// 쿼리스트링(쿼리 파라미터) : URL에 데이터를 포함시켜서 전송하는 방법
		return "redirect:/join_success?EMAIL="+vo.getEMAIL();
	}
	
	@RequestMapping("/login")
	public String login(MemberVO vo, HttpSession session) {
		// 로그인 하고 나서 쿼리문 실행결과를 mvo에 담기
		MemberVO mvo=mapper.login(vo);
		// 로그인을 성공한 계정의 정보를 session에 저장하기 위해 매개변수에 작성.
		session.setAttribute("mvo", vo);
		return "main";
	}
	
	@GetMapping("/join_success")
	public String join_success() {
		return "join_success";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		// 로그아웃은 세션을 무효화 시키자.
		session.invalidate();
		return "main";
	}
	
	// 기능단위로 메서드 작성
	// main.jsp로 이동하는 메서드
	@RequestMapping("/")
	public String member() {
		return "main";
	}
	
	// update.jsp에서 입력 받은 정보 바탕으로
	// update기능 구현
	@GetMapping("/update")
	public String update() {
		return "update";
	}
	
	@PostMapping("/update2")
	public String update2(MemberVO vo) {
		System.out.println(vo);
		mapper.update(vo);
		return "main";
	}
	
	//회원탈퇴 메서드
	@RequestMapping("/delete")
	public String delete(@RequestParam String EMAIL, HttpSession session) {
		// 기본문법 @RequestParam ("EMAIL") String EMAIL
		// delete쿼리문 실행 후 영향 받는 행의 개수. > int 값으로 반환됨.
		int count = mapper.delete(EMAIL);
		
		if(count>0) {
			// delete 성공
			session.invalidate();
			System.out.println("성공");
		}else {
			//delete 실패
			System.out.println("실패");
		}
		return "main";
	}
	
	@RequestMapping("/select")
	public String select( Model model) {
		List<MemberVO> members = mapper.select();
		model.addAttribute("mvo",members);
		return "select";
	}
	// ResponseBody : 메서드의 리턴값을 viewname이 아니라 화면에 출력하고 싶을 때 사용.
	@ResponseBody
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
