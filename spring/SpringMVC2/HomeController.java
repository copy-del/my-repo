package com.smhrd.web;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
// pojo(Plain Old Java Object) 클래스 -> 일반 자바 클래스
// : servlet이 아닌 일반 클래스로 구현된 Controller이다!
@Controller // 어노테이션! -> FC가 일을 시킬 수 있는 클래스 파일임을 나타낸다.
//Spring Container안에 내가 설계한 일반 자바 클래스들을 저장(적재)
//Spring Container란?
// -> Spring에서 사용하는 클래스 파일들이 미리 저장, 관리 되는 공간
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning 
	 * its name.
	 */
	// Request : 요청 , mapping :  연결시키다, 매칭시키다.
	//@RequestMapping :사용자가 요청한 url에 따라 하단의 메서드 실행
	// * value : 요청한 url값
	// * method : 요청 방식(get,post)
	//   -> get 방식 : url에 데이터가 노출된다, 보안 취약
	//   -> post방식 : url에 데이터가 노출 X, 보안 상대적으로 강하다.
	// @RequestMapping("/") -> get,post방식 모두 가능!!
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		// model : request의 경량화 버전!
		// model(request 경량화 버전)가져오는 방법
		// -> 매개변수로 이름을 지정! -> Spring이 알아서 객체 생성!
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
		// 메서드 실행 후, 이동하고 싶은 페이지 -> home.jsp
		// 확장자인 .jsp 제외하고 viewname만 전달!
		// * 내부적으로 prefix, suffix(접두사, 접미사)가 자동 추가\
		//    --> viewResolver(Spring에서 제공)가 한다.
		//  prefix(접두사, 실제 파일 경로) : /WEB-INF/views
		//  suffix(접미사, 확장자) : .jsp
		//  /WEB-INF/views + home + .jsp
	}
}
