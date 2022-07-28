package org.zerock.controller;



import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.zerock.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/board/*")
@AllArgsConstructor//이 생성자메소드를 쓸때는 Setter 불필요
public class BoardController {
	
	@Inject
    BoardService service;
	
	@GetMapping("/main")
	public void main() {
		
		log.info("organic...");
		
	}
	
	@GetMapping("/vegetable")
	public void vegetable() {
		
		log.info("organic...");
		
	}
	
	@GetMapping("/fruits")
	public void fruits() {
		
		log.info("organic...");
		
	}
	
	@GetMapping("/meat")
	public void meat() {
		
		log.info("organic...");
		
	}
	
	@GetMapping("/fish")
	public void fish() {
		
		log.info("organic...");
		
	}
	
	@GetMapping("/liquor")
	public void liquor() {
		
		log.info("organic...");
		
	}
	
	@GetMapping("/cart")
	public void cart() {
		
		log.info("cart...");
		
	}
	
}
