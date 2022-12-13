package com.example.demo.ventas.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ventas.modelo.Cliente;
import com.example.demo.ventas.modelo.Factura;
import com.example.demo.ventas.repository.IFacturaRepository;

@Service
public class FacturaServiceImpl implements IFacturaService {

	//bypass de bbia; podría cambiar de nombres los métodos por unos más empresariales
	@Autowired
	private IFacturaRepository iFacturaRepository;
	
	@Autowired
	private IClienteService iClienteService;
	
	@Override
	public void generar(String cedula) {
		//pasos para generar factura
		// Creo un cliente:
		Cliente miCli = iClienteService.buscar(cedula);
		
		Factura miFac = new Factura();
		miFac.setCliente(miCli);
		miFac.setFecha(LocalDateTime.now());
		miFac.setIva(new BigDecimal(0.12));
		miFac.setNumero("123");
		
		this.iFacturaRepository.insertar(miFac);
		System.out.println("Se insertó la factura.");
		
	}
	
	
	//bypass crud
	@Override
	public Factura buscar(String id) {
		return this.iFacturaRepository.buscar(id);
	}

	@Override
	public void borrar(String id) {
		this.iFacturaRepository.borrar(id);
	}

	@Override
	public void insertar(Factura fac) {
		this.iFacturaRepository.insertar(fac);
	}

	@Override
	public void actualizar(Factura fac) {
		this.iFacturaRepository.actualizar(fac);
	}

	
	
}
