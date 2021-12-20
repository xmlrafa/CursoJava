package com.rafa.praticaaulas.praticaaulas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/index")
public class TesteUm {
	@GetMapping("/{Id}")
	public String retorno(@PathVariable int Id) {
		return "este é o exemplo de retorno " + Id;
	}
}
