package com.example.demo.ventas.service;

import com.example.demo.ventas.modelo.Cliente;

public interface IClienteService {

	//bbia
	public Cliente buscar(String id);
	public void borrar(String id);
	public void insertar(Cliente cli);
	public void actualizar(Cliente cli);
	
}
