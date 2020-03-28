package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserMyHomeHistoryController: 사용자 주거의 로그 페이지 컨트롤러
@Controller
@RequestMapping("/history/userSelectLog")
public class UserMyHomeHistoryController {


	//userHomeHistory: 사용자 주거 로그 페이지로 이동하는 메서드
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String userHomeHistory() {
	
		return "history/userSelectLog";
		
	}//userHomeHistory 메서드 끝
	
}//UserMyHomeHistoryController 클래스 끝
