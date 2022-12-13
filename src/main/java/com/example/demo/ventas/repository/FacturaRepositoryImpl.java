package com.example.demo.ventas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.modelo.Factura;

@Repository
public class FacturaRepositoryImpl implements IFacturaRepository{

	private static List<Factura> baseDatos= new ArrayList<>();
	
	
	@Override
	public Factura buscar(String id) {
		Factura miFactura = null;
		for (Factura factura : baseDatos) {
			if (factura.getNumero().equals(id)) {
				miFactura = factura;
			}
		}
		return miFactura;
	}

	
	@Override
	public void borrar(String id) {
		Factura miFactura = buscar(id);
		baseDatos.remove(miFactura);
	}

	
	@Override
	public void insertar(Factura fac) {
		baseDatos.add(fac);
	}

	
	@Override
	public void actualizar(Factura fac) {
		Factura miFactura = null;
		for (Factura factura : baseDatos) {
			if (factura.getNumero().equals(fac.getNumero())) {
				miFactura = factura;
			}
		}
		baseDatos.remove(miFactura);
		baseDatos.add(fac);
	}

}
