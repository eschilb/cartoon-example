package com.tts.Cartoon.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tts.Cartoon.entities.Cartoon;
import com.tts.Cartoon.repositories.CartoonRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CartoonController {
	
	
	private final CartoonRepository cartoonRepository;
	
	public CartoonController(CartoonRepository cartoonRepository) {
		this.cartoonRepository = cartoonRepository;
	}
	
	@GetMapping("/cartoons")
	public List<Cartoon> getCartoons() {
		return (List<Cartoon>) cartoonRepository.findAll();
	}
	
	@PostMapping("/cartoons")
	void addCartoon(@RequestBody Cartoon cartoon) {
		cartoonRepository.save(cartoon);
	}
	

}
