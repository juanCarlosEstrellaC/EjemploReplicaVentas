package com.example.demo.ventas.repository;

import com.example.demo.ventas.modelo.Producto;

public interface IProductoRepository {

	//bbia
	public Producto buscar(String id);
	public void borrar(String id);
	public void insertar(Producto pro);
	public void actualizar(Producto pro);
	
}
