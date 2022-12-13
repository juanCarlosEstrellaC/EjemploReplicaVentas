package com.example.demo.ventas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.modelo.Producto;
import com.example.demo.ventas.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

	//bypass de bbia; podría cambiar de nombres los métodos por unos más empresariales
	@Autowired
	private IProductoRepository iProductoRepository;
	
	
	
	@Override
	public Producto buscar(String id) {
		return this.iProductoRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		this.iProductoRepository.borrar(id);
	}

	@Override
	public void insertar(Producto pro) {
		this.iProductoRepository.insertar(pro);
	}

	@Override
	public void actualizar(Producto pro) {
		this.iProductoRepository.actualizar(pro);
	}
	
	
	
	
}
