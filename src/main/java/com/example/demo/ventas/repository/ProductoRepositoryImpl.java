package com.example.demo.ventas.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.ventas.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository{

	private static List<Producto> baseDatos= new ArrayList<>();
	
	
	@Override
	public Producto buscar(String id) {
		Producto miProducto = null;
		for (Producto producto : baseDatos) {
			if (producto.getCodigoBarras().equals(id)) {
				miProducto = producto;
			}
		}
		return miProducto;
	}

	
	@Override
	public void borrar(String id) {
		Producto miProducto = buscar(id);
		baseDatos.remove(miProducto);
	}

	
	@Override
	public void insertar(Producto pro) {
		baseDatos.add(pro);
	}

	
	@Override
	public void actualizar(Producto pro) {
		Producto miProducto = null;
		for (Producto producto : baseDatos) {
			if (producto.getCodigoBarras().equals(pro.getCodigoBarras())) {
				miProducto = producto;
			}
		}
		baseDatos.remove(miProducto);
		baseDatos.add(pro);
	}

}
