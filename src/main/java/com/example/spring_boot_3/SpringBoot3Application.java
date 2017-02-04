package com.example.spring_boot_3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wisely.spring_boot_starter_hello.HelloService;

@RestController
@SpringBootApplication
public class SpringBoot3Application {
	
	@Autowired
	HelloService helloService;
	
	@RequestMapping("/")
	public String index(){
		return helloService.sayHello();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot3Application.class, args);
	}
}
