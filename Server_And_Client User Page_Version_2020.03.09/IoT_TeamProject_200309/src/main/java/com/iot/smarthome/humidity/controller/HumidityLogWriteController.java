package com.iot.smarthome.humidity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.smarthome.humidity.domain.HumidityLogWriteRequestVo;
import com.iot.smarthome.humidity.service.HumidityLogWriteService;


//HumidityLogWriteController: humidity 로그를 저장하는 컨트롤러
@Controller
@RequestMapping("/humidity/writeLog")
public class HumidityLogWriteController {
	
	//객체 주입
	@Autowired
	HumidityLogWriteService writeLogService;
	
	//humidityLogWrite 메서드: humidity 로그를 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	//Model에 저장
	@RequestMapping(method = RequestMethod.POST)
	public String humidityLogWrite(HumidityLogWriteRequestVo humidityLog, Model model) {
		
		System.out.println(humidityLog);
		
		int result = writeLogService.writeHumidityLog(humidityLog);
		
		System.out.println("결과: " + result );
		model.addAttribute("rCnt",  result);
		
		return "humidity/writeLog";
	
	}//humidityLogWrite 메서드 끝
	
}//HumidityLogWriteController 클래스 끝
