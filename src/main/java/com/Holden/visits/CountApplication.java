package com.Holden.visits;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@SpringBootApplication
public class CountApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountApplication.class, args);
	}
	// 1. Annotation
//    @RequestMapping("/")
//    // 3. Method that maps to the request route above
//    public String index() { // 3
//            return "index.jsp";
//    }
    


}
