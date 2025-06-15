package com.example.demo;

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@CrossOrigin(origins = "*")
	@GetMapping("/hello")
	public HashMap<String, String> hello(@RequestParam(value = "fname", defaultValue = "") String fname,
			@RequestParam(value = "lname", defaultValue = "World") String lname) {
		String r = new String("Hello " + fname + " " + lname + "!");
		HashMap<String, String> map = new HashMap<>();
		map.put("message", r);
		return map;

	}

}
