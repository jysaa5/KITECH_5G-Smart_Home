package com.iot.smarthome.led.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.smarthome.led.domain.LedLogWriteRequestVo;
import com.iot.smarthome.led.service.LedLogWriteService;


//LedLogWriteController: LED 로그를 저장하는 컨트롤러
@Controller
@RequestMapping("/led/writeLog")
public class LedLogWriteController {
	
	//객체 주입
	@Autowired
	LedLogWriteService writeLogService;
	
	//ledLogWrite 메서드: LED 로그를 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	//Model에 저장
	@RequestMapping(method = RequestMethod.POST)
	public String ledLogWrite(LedLogWriteRequestVo ledLog, Model model) {
		
		System.out.println(ledLog);
		
		int result = writeLogService.writeLedLog(ledLog);
		
		System.out.println("결과: " + result );
		model.addAttribute("rCnt",  result);
		
		return "led/writeLog";
	
	}//ledLogWrite 메서드 끝
	
}//LedLogWriteController 클래스 끝
