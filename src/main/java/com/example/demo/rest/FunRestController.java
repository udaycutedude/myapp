package com.example.demo.rest;
import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "hello world" + LocalDateTime.now();
	}
	@GetMapping("/githublessons")
	public String githubstatus()
	{
		return "github concept is done" + LocalDateTime.now();
	}

}
