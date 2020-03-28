package com.iot.smarthome.styler.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.smarthome.styler.domain.StylerWriteRequestVo;
import com.iot.smarthome.styler.service.StylerWriteService;

//StylerWriteController: 사진을 저장할때 입력할 때 데이터를 보내는 컨트롤러
@Controller
@RequestMapping("/styler/write")
public class StylerWriteController {
	
	//객체 주입
	@Autowired
	StylerWriteService writeService;
	
	//writeStyler 메서드: 사진을 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	@RequestMapping(method = RequestMethod.POST)
	public String writeStyler(StylerWriteRequestVo write, HttpServletRequest request, Model model) {
		
		System.out.println(write);
		
		int result = writeService.writeStylerPhoto(request, write);
		
		System.out.println("결과: " + result );

		model.addAttribute("rCnt",  result);
		
		return "styler/write";
	
	}//writeStyler 메서드 끝
	
}//StylerWriteController 클래스 끝
