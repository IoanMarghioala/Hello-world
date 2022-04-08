package com.example.capgemini.helloheroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class HelloherokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloherokuApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	String helloWorld() {
		return "Hello World!";
	}
}
