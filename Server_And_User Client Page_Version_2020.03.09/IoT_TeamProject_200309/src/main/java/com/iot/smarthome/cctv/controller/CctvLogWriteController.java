package com.iot.smarthome.cctv.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.smarthome.cctv.domain.CctvLogWriteRequestVo;
import com.iot.smarthome.cctv.service.CctvLogWriteService;

//CctvLogWriteController: CCTV 로그를 저장하는 컨트롤러
@Controller
@RequestMapping("/cctv/writeLog")
public class CctvLogWriteController {
	
	//객체 주입
	@Autowired
	CctvLogWriteService writeLogService;
	
	//cctvWrite 메서드: CCTV 사진, 영상을 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	//Model에 저장
	@RequestMapping(method = RequestMethod.POST)
	public String cctvLogWrite(CctvLogWriteRequestVo cctvLog, Model model) {
		
		System.out.println(cctvLog);
		
		int result = writeLogService.writeCctvLog(cctvLog);
		
		System.out.println("결과: " + result );
		model.addAttribute("rCnt",  result);
		
		return "cctv/writeLog";
	
	}//cctvWrite 메서드 끝
	
}//CctvWriteController 클래스 끝
