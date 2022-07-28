package org.zerock.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zerock.domain.SampleDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping("")
	public void basic() {
		
		log.info("basic....~~..");
		
	}
	
	@RequestMapping(value="/basic", method= {RequestMethod.GET, RequestMethod.POST})
	
	public void basicGet() {
		
		log.info("basic get kkk");
		
	}
	
	
	//http://localhost:9090/sample/ex01?name=korea&age=30
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		
		log.info("" + dto);
		
		return "ex01";

	}
	
	
	
	//http://localhost:9090/sample/ex02?name=kim&age=11
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name,
						@RequestParam("age") int age) {
		
		log.info("name : " + name);
		log.info("age : " + age);
		
		return "ex02";
		
	}


	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids")ArrayList<String> ids) {
		
		log.info("ids : " + ids);
		
		return "ex02List";
		
	}
	
	
	
	//http://localhost:9090/sample/ex04?name=korea&age=25&page=9
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto, @ModelAttribute("page") int page) {
		
		log.info("dto : " + dto);
		log.info("page : " + page);
		
		return "/sample/ex04";
		
	}
	
	
	@GetMapping("/ex05")
	public void ex05() {
		
		log.info("/ex05......");
		
	}
	
	
	@GetMapping("/ex06")
	public @ResponseBody SampleDTO ex06() {
		
		log.info("/ex06~~~");
		SampleDTO dto = new SampleDTO();
		dto.setName("korea");
		dto.setAge(50);
		
		return dto;
		
	}
	
	
}
