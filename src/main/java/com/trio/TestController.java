package com.trio;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/greet")
	public ResponseEntity<String> greet() throws JsonProcessingException {
		log.info("ENTERING METHOD greet in class {}", this.getClass().getName());
		return new ResponseEntity<String>("Hello from trio greet", HttpStatus.OK);
	}
	
	@GetMapping("/greet/error")
	public ResponseEntity<String> greetError() {
		log.info("ENTERING METHOD greetErrir in class {}", this.getClass().getName());
		try {
			throw new RuntimeException();
		} catch (Exception e) {
			log.error("Error occured: {}", e);
		}
		return new ResponseEntity<String>("Hello from trio greetError", HttpStatus.OK);
	}
}
