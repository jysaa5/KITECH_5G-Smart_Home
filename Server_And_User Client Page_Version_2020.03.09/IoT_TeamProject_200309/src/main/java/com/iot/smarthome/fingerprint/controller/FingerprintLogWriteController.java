package com.iot.smarthome.fingerprint.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.smarthome.fingerprint.domain.FingerprintLogWriteRequestVo;
import com.iot.smarthome.fingerprint.service.FingerprintLogWriteService;



//FingerprintLogWriteController: fingerprint 로그를 저장하는 컨트롤러
@Controller
@RequestMapping("/fingerprint/writeLog")
public class FingerprintLogWriteController {
	
	//객체 주입
	@Autowired
	FingerprintLogWriteService writeLogService;
	
	//fingerprintLogWrite 메서드: fingerprint 로그를 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	//Model에 저장
	@RequestMapping(method = RequestMethod.POST)
	public String fingerprintLogWrite(FingerprintLogWriteRequestVo fingerprintLog, Model model) {
		
		System.out.println(fingerprintLog);
		
		int result = writeLogService.writeFingerprintLog(fingerprintLog);
		
		System.out.println("결과: " + result );
		model.addAttribute("rCnt",  result);
		
		return "fingerprint/writeLog";
	
	}//fingerprintLogWrite 메서드 끝
	
}//FingerprintLogWriteController 클래스 끝
