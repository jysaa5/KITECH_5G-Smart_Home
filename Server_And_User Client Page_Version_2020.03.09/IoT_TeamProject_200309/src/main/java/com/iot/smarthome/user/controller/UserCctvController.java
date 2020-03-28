package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserCctvController: 사용자 CCTV 페이지 컨트롤러
@Controller
@RequestMapping("/cctv/userCctv")
public class UserCctvController {

	//userCCTV 메서드: 사용자 CCTV 페이지를 보여주는 메서드
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String userCCTV() {
	
		return "cctv/userCctv";
		
	}//userCCTV 메서드 끝
	
}//UserCctvController 클래스 끝
