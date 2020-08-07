package com.tts.Cartoon;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tts.Cartoon.entities.Cartoon;
import com.tts.Cartoon.repositories.CartoonRepository;

@SpringBootApplication
public class CartoonApplication {

	public static void main(String[] args) {
		SpringApplication.run(CartoonApplication.class, args);
	}
	

}
