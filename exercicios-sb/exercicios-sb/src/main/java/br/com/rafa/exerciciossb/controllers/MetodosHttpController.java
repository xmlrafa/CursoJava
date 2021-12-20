package br.com.rafa.exerciciossb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class MetodosHttpController {
	
	@GetMapping
	public String Get() {
		return "requisição get";
	}
	
	@PostMapping
	public String Post() {
		return "requisição Post";
	}
	
	@PutMapping
	public String Put() {
		return "requisição Put";
	}
	
	@PatchMapping
	public String Patch() {
		return "requisição Patch";
	}
	
	@DeleteMapping
	public String Delete() {
		return "requisição Delete";
	}

}
