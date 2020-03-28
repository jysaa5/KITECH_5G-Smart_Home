package com.iot.smarthome.fingerprint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.iot.smarthome.fingerprint.domain.FingerprintLogListViewVo;
import com.iot.smarthome.fingerprint.service.FingerprintLogListService;



//FingerprintLogListController: fingerprint 로그가 저장된 리스트
@Controller
public class FingerprintLogListController {

	//객체 주입
	@Autowired
	FingerprintLogListService listService;
	
	//cctvList 메서드: 사용자가 페이지 번호를 눌렀을 때, 해당 페이지의 데이터가 보이게 하는 메서드
	//Model에 저장
	@RequestMapping("/fingerprint/fingerprintLogList")
	public String fingerprintLogList(@RequestParam(value="page", defaultValue = "1") int page, Model model) {
		
		//페이지 번호를 받아서 처리
		FingerprintLogListViewVo view = listService.getFingerprintLogListCount(page); 
		
		System.out.println(view);
		
		//모델에게 전달해서 view에서 볼수 있도록 한다.
		model.addAttribute("fingerprintLogListView",view);
		
		return "fingerprint/fingerprintLogList";
		
	}//fingerprintLogList 메서드 끝
	
}//FingerprintLogListController 클래스 끝
