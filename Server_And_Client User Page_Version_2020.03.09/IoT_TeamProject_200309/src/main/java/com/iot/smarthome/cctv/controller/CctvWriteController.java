package com.iot.smarthome.cctv.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iot.smarthome.cctv.domain.CctvWriteRequestVo;
import com.iot.smarthome.cctv.service.CctvWriteService;

//CctvWriteController: CCTV 사진, 영상 저장하는 컨트롤러
@Controller
@RequestMapping("/cctv/write")
public class CctvWriteController {
	
	//객체 주입
	@Autowired
	CctvWriteService writeService;
	
	//cctvWrite 메서드: CCTV 사진, 영상을 DB에 저장하도록 서비스 클래스에게 전달하는 메서드
	//커맨드형식 
	//Model에 저장
	@RequestMapping(method = RequestMethod.POST)
	public String cctvWrite(CctvWriteRequestVo write, HttpServletRequest request, Model model) {
		
		System.out.println(write);
		
		int result = writeService.writeCctv(request, write);
		
		System.out.println("결과: " + result );
		model.addAttribute("rCnt",  result);
		
		return "cctv/write";
	
	}//cctvWrite 메서드 끝
	
}//CctvWriteController 클래스 끝
