package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserTemperatureLogController: 사용자 집안의 온도 로그 컨트롤러
@Controller
@RequestMapping("/temperature/userTempLog")
public class UserTemperatureLogController {
	
	//userTemperatureLogView: 사용자 집안의 온도 로그 페이지로 이동하는 메서드
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String userTemperatureLogView() {
	
		return "temperature/userTempLog";
		
	}//userTemperatureLogView 메서드 끝

}//UserTemperatureLogController 클래스 끝
