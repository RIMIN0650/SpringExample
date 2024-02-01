package com.example.spring.ex.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller + @ResponseBody
@RequestMapping("lifecycle/ex01")
public class Ex01RestController {

	// 직접 만든 클래스 객체 리턴
	@RequestMapping("/3")
	public Person objectResponse() {
		Person me = new Person("권민석", 25);
		
		return me;
	}
	
	@RequestMapping("/4")
	public ResponseEntity<Person> entityResponse(){
		Person me = new Person("권민석", 25);
		// HTTP Status Code
		// 200 은 정상적인 코드 OK 
		// 404 Not Found 에러 코드 : 페이지가 없음(주소확인)
		// 405 Method Not Allow : 메소드가 일치하지 않음 (Get, Post)
		// 400 Bad Request : 요청 잘못됨 (파라미터 일치 확인)
		// 500 Internal Server Error : 서버 에러 (클래스 자바 코드 확인)
		
		ResponseEntity<Person> entity = new ResponseEntity(me,HttpStatus.INTERNAL_SERVER_ERROR);
				
		return entity;		
				
	}
	
}
