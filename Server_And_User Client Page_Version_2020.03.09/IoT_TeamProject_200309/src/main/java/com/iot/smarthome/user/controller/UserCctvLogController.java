package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserCctvLogController: CCTV 로그 화면 보여주는 페이지 컨트롤러
@Controller
@RequestMapping("/cctv/userCctvLog")
public class UserCctvLogController {
	
	//userCctvLogView: CCTV 로그를 보여주는 페이지로 이동하는 메서드
	@RequestMapping(method = RequestMethod.GET)
	public String userCctvLogView() {
	
		return "cctv/userCctvLog";
		
	}//userCctvLogView 메서드 끝

	
}//UserCctvLogController 클래스 끝
