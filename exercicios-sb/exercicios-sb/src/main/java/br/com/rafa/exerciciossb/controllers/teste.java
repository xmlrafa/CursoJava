package br.com.rafa.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rafa.exerciciossb.model.entities.Cliente;

@RestController
public class teste {
	@GetMapping(path = "/teste")
	public Cliente obtercliente() {
		return new Cliente(15, "rafa", "15");
	}
}
