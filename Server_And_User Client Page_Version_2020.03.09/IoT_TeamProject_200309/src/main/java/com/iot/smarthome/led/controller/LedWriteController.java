package com.iot.smarthome.led.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.smarthome.led.domain.LedWriteRequestVo;
import com.iot.smarthome.led.service.LedWriteService;

//LedWriteController:LED On/Off 데이터를 보내는 컨트롤러
@Controller
@RequestMapping("/led/write")
public class LedWriteController {
	
	//객체 주입
	@Autowired
	LedWriteService writeService;
	
	//writeLed 메서드: LED On/Off 데이터를 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	@RequestMapping(method = RequestMethod.POST)
	public String writeLed(LedWriteRequestVo write, HttpServletRequest request, Model model) {
		
		System.out.println(write);
		
		int result = writeService.writeLed(request, write);
		
		System.out.println("결과: " + result );
		
		model.addAttribute("rCnt",  result);
		
		return "led/write";
	
	}//writeLed 메서드 끝
	
}//LedWriteController 클래스 끝
