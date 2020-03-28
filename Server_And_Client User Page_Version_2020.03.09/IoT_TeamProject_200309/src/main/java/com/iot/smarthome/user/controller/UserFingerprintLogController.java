package com.iot.smarthome.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//UserFingerprintLogController: 지문인식기 사용자 페이지 컨트롤러
@Controller
@RequestMapping("/fingerprint/userFingerprintLog")
public class UserFingerprintLogController {

	//userFingerprintLogView 메서드: 지문인식 사용자 페이지로 이동하는 메서드
	//get방식으로 들어왔을 때 처리
	@RequestMapping(method = RequestMethod.GET)
	public String userFingerprintLogView() {
	
		return "fingerprint/userFingerprintLog";
		
	}//userFingerprintLogView 메서드 끝

	
}//UserFingerprintLogController 클래스 끝
