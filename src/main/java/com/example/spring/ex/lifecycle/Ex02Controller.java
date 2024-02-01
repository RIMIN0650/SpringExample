package com.example.spring.ex.lifecycle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Ex02Controller {
	
	@RequestMapping("/lifecycle/ex02")
	public String ex02View() {
		return "/WEB-INF/jsp/lifecycle/ex02.jsp";
	}
	
	
}
