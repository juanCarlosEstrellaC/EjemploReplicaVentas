package com.example.demo.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.modelo.Cliente;
import com.example.demo.ventas.repository.IClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {

	//bypass de bbia; podría cambiar de nombres los métodos por unos más empresariales
	@Autowired
	private IClienteRepository iClienteRepository;
	
	
	
	@Override
	public Cliente buscar(String id) {
		return this.iClienteRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		this.iClienteRepository.borrar(id);
	}

	@Override
	public void insertar(Cliente cli) {
		this.iClienteRepository.insertar(cli);
	}

	@Override
	public void actualizar(Cliente cli) {
		this.iClienteRepository.actualizar(cli);
	}
	
	
	
	
}
