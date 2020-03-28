package com.iot.smarthome.styler.service;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iot.smarthome.styler.dao.StylerDao;
import com.iot.smarthome.styler.domain.StylerVo;
import com.iot.smarthome.styler.domain.StylerWriteRequestVo;

//서비스 bean으로 등록하기 
//StylerWriteService: 사진을 저장하는 sql을 실행하는 서비스 클래스
@Service("StylerWriteService")
public class StylerWriteService {

	//객체 주입
	@Inject
	private SqlSessionTemplate template;
	
	//인터페이스
	private StylerDao dao;
	
	//writeStyler 메서드: 사진을 저장하고 사진 인덱스 번호를 반환하는 메서드
	public int writeStylerPhoto(HttpServletRequest request, StylerWriteRequestVo write) {
	
		dao = template.getMapper(StylerDao.class);
		
		// 서버 경로
		String path = "/uploadfile/userphoto"; // 리소스 매핑 필요
		
		// 절대 경로
		String dir = request.getSession().getServletContext().getRealPath(path);

		StylerVo styler = write.toStyler();
		
		
		int resultCnt = 0;

		String newFileName = "";

		MultipartFile file = write.getPhoto();
		
		try {
			if (file != null && !file.isEmpty() && file.getSize() > 0) {
				// 새로운 파일 이름 생성
				// String newFileName = memberInfo.getuId()+System.nanoTime();
				newFileName = styler.getStylerUser() + "_" + file.getOriginalFilename();
				// 파일을 서버의 지정 경로에 저장
				file.transferTo(new File(dir, newFileName));
				// 데이터베이스 저장을 하기위한 파일 이름 set
				styler.setStylerPhoto(newFileName);
				
			} else {
				
				styler.setStylerPhoto("default.png");
			}
		
		resultCnt = dao.insertStyler(styler);
		
		} catch (IllegalStateException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("오류");
			if (file != null) {
				
				new File(dir, newFileName).delete();
				
			}
		}

		return resultCnt;
		
	}//writeStylerPhoto메서드 끝
	
}//StylerWriteService 클래스 끝
