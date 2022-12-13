package com.example.demo.ventas.service;

import com.example.demo.ventas.modelo.Producto;

public interface IProductoService {

	//bbia
	public Producto buscar(String id);
	public void borrar(String id);
	public void insertar(Producto pro);
	public void actualizar(Producto pro);
	
}
