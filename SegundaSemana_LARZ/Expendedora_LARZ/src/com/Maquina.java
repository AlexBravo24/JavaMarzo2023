package com;

import java.util.Date;
import java.util.HashMap;

public class Maquina implements Metodos {
	
	private int folio = 1;
	
	private HashMap<String, Productos> cuentas;
	
	public Maquina () {}

	public Maquina(int folio, HashMap<String, Productos> cuentas) {
		
		this.folio = folio;
		this.cuentas = cuentas;
	}

	@Override
	public Productos buscarProducto(String clave) {
		Productos producto = cuentas.get(clave);
		
		return producto;
	}

	@Override
	public Ticket Darproducto(String clave, int monto) {
		Ticket ticket = null;
		
		if (this.buscarProducto(clave)!=null) {
			Productos producto = this.buscarProducto(clave);
			
			if (monto <= 0 ) {
				System.out.println("Ingrese el dinero");
				return ticket;
			} if ((monto-producto.getCosto())<0) {
				System.out.println("Ingrese más dinero");
				return ticket;
			}
			else {
				producto.setCosto(monto-producto.getCosto());
				ticket = new Ticket (folio++, new Date (), producto.getProducto(), producto.getClave(), producto.getCosto());
				return ticket;
			}
		} else {
			System.out.println("Clave incorrecta");
			return ticket;
		}
	}

}
