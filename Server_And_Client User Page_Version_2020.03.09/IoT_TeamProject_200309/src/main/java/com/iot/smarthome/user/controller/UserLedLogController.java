package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserLedLogController: 사용자 LED 로그를 보여주는 컨트롤러
@Controller
@RequestMapping("/led/userLedLog")
public class UserLedLogController {

	//userLedLogView: LED 로그 페이지로 이동하는 메서드
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String userLedLogView() {
	
		return "led/userLedLog";
		
	}//userLedLogView 메서드 끝
	
}//UserLedLogController 클래스 끝
