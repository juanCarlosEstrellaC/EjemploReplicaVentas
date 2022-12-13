package com.example.demo.ventas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.modelo.Detalle;

@Repository
public class DetalleRepositoryImpl implements IDetalleRepository{

	private static List<Detalle> baseDatos= new ArrayList<>();
	
	
	@Override
	public Detalle buscar(String id) {
		Detalle miDetalle = null;
		for (Detalle detalle : baseDatos) {
			if (detalle.getNumero().equals(id)) {
				miDetalle = detalle;
			}
		}
		return miDetalle;
	}

	
	@Override
	public void borrar(String id) {
		Detalle miDetalle = buscar(id);
		baseDatos.remove(miDetalle);
	}

	
	@Override
	public void insertar(Detalle det) {
		baseDatos.add(det);
	}

	
	@Override
	public void actualizar(Detalle det) {
		Detalle miDetalle = null;
		for (Detalle detalle : baseDatos) {
			if (detalle.getNumero().equals(det.getNumero())) {
				miDetalle = detalle;
			}
		}
		baseDatos.remove(miDetalle);
		baseDatos.add(det);
	}

}
