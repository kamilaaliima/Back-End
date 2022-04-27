package com.helloworld.hello.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/listaBsm")
public class listaBsm {
	
	
	@GetMapping
	public ResponseEntity<ArrayList<String>> getListaBsm() {
		
		ArrayList<String> listaBsm  = new ArrayList<>();
		
		listaBsm.add("Persistência");
		listaBsm.add("Proatividade");
		listaBsm.add("Responsabilidade Pessoal");
		listaBsm.add("Orientação ao futuro");
		listaBsm.add("Trabalho em Equipe");
		listaBsm.add("Mentalidade de crescimento");
		listaBsm.add("Orientação aos detalhes");
		listaBsm.add("Comunicação");
		
		return ResponseEntity.ok().body(listaBsm);
	}

	

}
