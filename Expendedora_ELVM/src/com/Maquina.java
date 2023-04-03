package com;

import java.util.Date;
import java.util.HashMap;

public class Maquina implements Metodos {
	
	
	private int folio = 1;
	
	private HashMap<String, Producto> cuentas;
	
	public Maquina () {}

	public Maquina(int folio, HashMap<String, Producto> cuentas) {
		
		this.folio = folio;
		this.cuentas = cuentas;
	}
	
	
	
	
	

	@Override
	public Producto buscarProducto(String clave) {
		/*
		 * instanciamos un objeto producto para pasarle el valor 
		 * de ese objeto o contenido en el hashmap
		 * 
		 */
		//primer metodo para identificar el producto
		Producto producto = cuentas.get(clave);
		
		return producto;
	}
	
	@Override
	public Ticket Darproducto(String clave, int monto) {
		/*
		 * instanciamos un objeto ticket, que de momento esta vacio
		 */
		Ticket ticket = null;
		
		if (this.buscarProducto(clave)!=null) {
			Producto producto = this.buscarProducto(clave);
			
			if (monto <= 0 ) {
				System.out.println("POR FAVOR, ingrese su dinero");
				return ticket;
			} if ((monto-producto.getPrecio())<0) {//desde producto elproducto.getPrecio()
				System.out.println("INSUFICIENTE,ingrese mas dinero por favor");
				return ticket;
			}
			else {
				producto.setPrecio/*desde producto producto.setPrecio*/(monto-producto.getPrecio()/*desde producto elproducto.getPrecio()*/);
				ticket = new Ticket (folio++, new Date (), producto.getNombreProducto()/*desde producto el producto.getNombreProducto*/, producto.getClave(), producto.getPrecio());
				return ticket;
			}
		} else {
			System.out.println("Clave incorrecta");
			return ticket;
		}
	}
	
		
		
		
	
		
		
		
		
		
		
	
		

		
				
			
		
			
		
		

	
		





}
