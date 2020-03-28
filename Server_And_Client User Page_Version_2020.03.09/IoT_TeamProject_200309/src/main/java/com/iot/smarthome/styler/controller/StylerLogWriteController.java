package com.iot.smarthome.styler.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.smarthome.styler.domain.StylerLogWriteRequestVo;
import com.iot.smarthome.styler.service.StylerLogWriteService;

//StylerLogWriteController: styler 로그를 저장하는 컨트롤러
@Controller
@RequestMapping("/styler/writeLog")
public class StylerLogWriteController {
	
	//객체 주입
	@Autowired
	StylerLogWriteService writeLogService;
	
	//humidityLogWrite 메서드: humidity 로그를 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	//Model에 저장
	@RequestMapping(method = RequestMethod.POST)
	public String stylerLogWrite(StylerLogWriteRequestVo stylerLog, Model model) {
		
		System.out.println(stylerLog);
		
		int result = writeLogService.writeStylerLog(stylerLog);
		
		System.out.println("결과: " + result );
		model.addAttribute("rCnt",  result);
		
		return "styler/writeLog";
	
	}//stylerLogWrite 메서드 끝
	
}//StylerLogWriteController 클래스 끝
