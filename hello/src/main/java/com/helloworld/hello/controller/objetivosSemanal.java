package com.helloworld.hello.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/objetivos")
public class objetivosSemanal {

	
	@GetMapping
	public ResponseEntity<ArrayList<String>> getobjetivosSemanal() {
		
		ArrayList<String> objetivosSemanal  = new ArrayList<>();
		
		objetivosSemanal.add("Aprimorar meus aprendizados de mySql (tabelas, endpoint, etc);");
		objetivosSemanal.add("Conseguir pegar os conteúdos de Spring de maneira eficiente;");
		objetivosSemanal.add("Contruir meu primeiro Blog pessoal com mySql e Spring (DER);");
		objetivosSemanal.add("Iniciar a produção do Blog do Projeto integrador junto com meu grupo.");
		
		return ResponseEntity.ok().body(objetivosSemanal);
		
	}

	

}
