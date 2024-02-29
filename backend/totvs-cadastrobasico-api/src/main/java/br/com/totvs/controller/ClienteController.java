package br.com.totvs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1")
public class ClienteController {
	
	@GetMapping("/cliente")
	public ResponseEntity<String> teste(){
		log.info("ClienteController.teste");
		return ResponseEntity.status(HttpStatus.OK).body("TESTE");
	}
	

}
