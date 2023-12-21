package com.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*******************************
 * 
 * 메인화면으로 가는 Controller localhost:8090/shop/main
 *
 *******************************/
@Controller
public class MainController {

	@RequestMapping("/main")
	public String main(String[] args) {

		return "main";
		
	}//end main

}//end class
