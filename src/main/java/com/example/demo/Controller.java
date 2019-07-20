package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/")
    public String index() {
        System.out.println("Hello Users");
        return "Hello Users";
    }

}
