package com.example.demo.ventas.repository;

import com.example.demo.ventas.modelo.Detalle;

public interface IDetalleRepository {

	//bbia
	public Detalle buscar(String id);
	public void borrar(String id);
	public void insertar(Detalle det);
	public void actualizar(Detalle det);
	
}
