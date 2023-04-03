package com;

import java.util.Date;
import java.util.HashMap;

public class M�quina implements M�todos {
	
	private int folio=1;
	private int idM�quina=1;
	
	private HashMap<String, Producto> productos;
	
	public M�quina () {}

	public M�quina(int folio, int idM�quina, HashMap<String, Producto> productos) {
		this.folio = folio;
		this.idM�quina = idM�quina;
		this.productos = productos;
	}

	@Override
	public Producto buscarProducto(String Product) {
		Producto producto = productos.get(Product);
		return producto;
	}

	@Override
	public Ticket Comprar(String Product, double monto) {
		Ticket ticket = new Ticket();
		double falta, cambio;
		if(this.buscarProducto(Product)!=null) {
			Producto producto = this.buscarProducto(Product);
			if (producto.getInventario()==0) {
				System.out.println("Producto no disponible.");
				return ticket;
			} else if(producto.getPrecio()>monto) {
				falta = producto.getPrecio()-monto;
				System.out.println("Dinero insuficiente, por favor ingrese: $"+falta);
				return ticket;
			} else if(producto.getPrecio()<monto) {
				cambio = monto - producto.getPrecio();
				ticket.setPago(monto);
				ticket.setCambio(monto-producto.getPrecio());
				System.out.println("\nDespachando su producto... \nSu cambio es: $"+cambio);
				ticket = new Ticket(folio++,idM�quina,new Date(),producto.getProd(),producto.getPrecio(),ticket.getPago(),ticket.getCambio());
				return ticket;
			} else if (producto.getPrecio()==monto) {
				System.out.println("\nDespachando su producto... \nSu cambio es: $0.00");
				ticket = new Ticket(folio++,idM�quina,new Date(),producto.getProd(),producto.getPrecio(),ticket.getPago(),ticket.getCambio());
				return ticket;
			}
		}else {
			System.out.println("No se tiene este producto.");
			return ticket;
		} return ticket;
	}
	
	
	
}
