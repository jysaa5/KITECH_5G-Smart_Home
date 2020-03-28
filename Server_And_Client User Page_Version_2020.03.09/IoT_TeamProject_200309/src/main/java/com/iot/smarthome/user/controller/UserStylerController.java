package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserStylerController: 사용자 Styler 페이지 컨트롤러
@Controller
@RequestMapping("/styler/userStyler")
public class UserStylerController {

	//userStyler: Styler 페이지로 이동하는 메서드
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String userStyler() {
	
		return "styler/userStyler";
		
	}//userStyler 메서드 끝
	
}//UserStylerController 클래스 끝
