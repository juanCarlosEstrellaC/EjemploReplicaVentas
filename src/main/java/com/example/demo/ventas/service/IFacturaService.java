package com.example.demo.ventas.service;

import com.example.demo.ventas.modelo.Factura;

public interface IFacturaService {

	public void generar(String cedula /*, List<ItemTO>detalles*/);
	
	//bbia
	public Factura buscar(String id);
	public void borrar(String id);
	public void insertar(Factura fac);
	public void actualizar(Factura fac);
	
}
