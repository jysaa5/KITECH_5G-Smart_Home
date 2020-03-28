package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserLedController: LED 사용자 페이지 컨트롤러
@Controller
@RequestMapping("/led/userLed")
public class UserLedController {
	
	//userLed: 사용자 LED 페이지로 이동하는 메서드
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String userLed() {
	
		return "led/userLed";
		
	}//userLed 메서드 끝
	
}//UserLedController 클래스 끝
