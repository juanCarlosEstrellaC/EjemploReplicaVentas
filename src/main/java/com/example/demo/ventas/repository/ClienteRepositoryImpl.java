package com.example.demo.ventas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.modelo.Cliente;

@Repository
public class ClienteRepositoryImpl implements IClienteRepository{

	private static List<Cliente> baseDatos= new ArrayList<>();
	
	
	@Override
	public Cliente buscar(String id) {
		Cliente miCliente = null;
		for (Cliente cliente : baseDatos) {
			if (cliente.getCedula().equals(id)) {
				miCliente = cliente;
			}
		}
		return miCliente;
	}

	
	@Override
	public void borrar(String id) {
		Cliente miCliente = buscar(id);
		baseDatos.remove(miCliente);
	}

	
	@Override
	public void insertar(Cliente cli) {
		baseDatos.add(cli);
	}

	
	@Override
	public void actualizar(Cliente cli) {
		Cliente miCliente = null;
		for (Cliente cliente : baseDatos) {
			if (cliente.getCedula().equals(cli.getCedula())) {
				miCliente = cliente;
			}
		}
		baseDatos.remove(miCliente);
		baseDatos.add(cli);
	}

}
