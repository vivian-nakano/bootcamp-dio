package com.project.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	//método
	@GetMapping
	public List<Cliente> listar() {
		
	}

}
