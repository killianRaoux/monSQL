package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.entities.Voiture;
import com.example.demo.repositories.VoitureRepository;

@RestController
@RequestMapping("voitures")
@CrossOrigin
public class VoitureController {

	@Autowired
	private VoitureRepository repository;
	
	@GetMapping("")
	public List<Voiture> findAll(){
		return this.repository.findAll();
	}
	
	@PostMapping("")
	public Voiture save(@RequestBody Voiture entity) {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND,"blabla");
		//return this.repository.save(entity);
	}
	
}
