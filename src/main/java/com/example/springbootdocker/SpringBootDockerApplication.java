package com.example.springbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

	private Boolean status;
	private String message;
	private List data;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerApplication.class, args);
	}

	public SpringBootDockerApplication(){
	}

	@GetMapping
	public HashMap<String, String> sayHello() {
		HashMap<String, String> map = new HashMap<>();
		map.put("name", "apple");
		map.put("vegetable", "carrot");
		map.put("hotel", "trivago");
		return map;
	}

	@GetMapping("/city")
	public HashMap<String, String> getCity() {
		HashMap<String, String> map = new HashMap<>();
		map.put("city", "Toronto");
		map.put("state", "Ontario");
		return map;
	}

//	@GetMapping
//	public List <String> hello(){
//		return List.of("Hello", "Apples");
//	}

}