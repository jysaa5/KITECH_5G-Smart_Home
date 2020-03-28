package com.iot.smarthome.temperature.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.smarthome.temperature.domain.TemperatureLogWriteRequestVo;
import com.iot.smarthome.temperature.service.TemperatureLogWriteService;

//TemperatureLogWriteController: temperature 로그를 저장하는 컨트롤러
@Controller
@RequestMapping("/temperature/writeLog")
public class TemperatureLogWriteController {
	
	//객체 주입
	@Autowired
	TemperatureLogWriteService writeLogService;
	
	//humidityLogWrite 메서드: humidity 로그를 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	//Model에 저장
	@RequestMapping(method = RequestMethod.POST)
	public String temperatureLogWrite(TemperatureLogWriteRequestVo temperatureLog, Model model) {
		
		System.out.println(temperatureLog);
		
		int result = writeLogService.writeTemperatureLog(temperatureLog);
		
		System.out.println("결과: " + result );
		model.addAttribute("rCnt",  result);
		
		return "temperature/writeLog";
	
	}//temperatureLogWrite 메서드 끝
	
}//TemperatureLogWriteController 클래스 끝
