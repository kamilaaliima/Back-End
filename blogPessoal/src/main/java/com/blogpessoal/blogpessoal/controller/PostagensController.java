package com.blogpessoal.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogpessoal.blogpessoal.model.Postagens;
import com.blogpessoal.blogpessoal.reporitory.PostagemRepository;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/Postagens")
@CrossOrigin("*")
public class PostagensController {

	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Postagens>> GetAll(){
		return
	ResponseEntity.ok(repository.findAll());
	}
	
}
