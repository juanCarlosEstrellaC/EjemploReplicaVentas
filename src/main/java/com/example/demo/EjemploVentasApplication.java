package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.ventas.modelo.Cliente;
import com.example.demo.ventas.service.IClienteService;
import com.example.demo.ventas.service.IFacturaService;

@SpringBootApplication
public class EjemploVentasApplication implements CommandLineRunner{

	@Autowired
	private IClienteService iClienteService;
	
	@Autowired
	private IFacturaService iFacturaService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjemploVentasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente1 = new Cliente();
		cliente1.setCedula("12345678");
		cliente1.setNombre("Juanito Perez");
		cliente1.setTipo("Tipo1");
		
		this.iClienteService.insertar(cliente1);
		
		this.iFacturaService.generar(cliente1.getCedula());
		

		
	}

}
