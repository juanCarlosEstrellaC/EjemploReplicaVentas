package com.example.demo.ventas.repository;

import com.example.demo.ventas.modelo.Factura;

public interface IFacturaRepository {

	//bbia
	public Factura buscar(String id);
	public void borrar(String id);
	public void insertar(Factura fac);
	public void actualizar(Factura fac);
	
}
