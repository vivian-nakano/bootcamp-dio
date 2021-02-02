package com.project.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.api.model.Cliente;
import com.project.api.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	//método
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
		
	}
	
	@PostMapping
	public Cliente adicionar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

}
