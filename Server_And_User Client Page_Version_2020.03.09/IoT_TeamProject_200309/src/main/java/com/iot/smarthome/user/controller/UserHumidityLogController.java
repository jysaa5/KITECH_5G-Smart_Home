package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserHumidityLogController: 습도를 보여주는 사용자 페이지 컨트롤러
@Controller
@RequestMapping("/humidity/userHumLog")
public class UserHumidityLogController {
	
	//userHumidityLogView: 사용자 방안의 습도를 보여주는 페이지로 이동하는 메서드
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String userHumidityLogView() {
	
		return "humidity/userHumLog";
		
	}//userHumidityLogView 메서드 끝

}//UserHumidityLogController 클래스 끝
