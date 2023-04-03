package com;
import java.util.Date;
import java.util.HashMap;

public class Maquina implements Metodos{
	private String lugar;
	private int idMaquina=1;
	private int folio=1;

	private HashMap<Integer, Compra> compras;
	public Maquina () {}
	
	
	
	public Maquina(String lugar, int idMaquina, HashMap<Integer, Compra> compras) {
		super();
		this.lugar = lugar;
		this.idMaquina = idMaquina;
		this.compras = compras;
	}
	
	
	@Override
	public Compra buscarCompra(int numCompra) {
		Compra compra = compras.get(numCompra);
		return compra;
	}
	

	@Override
	public Ticket llenar(int numCompra, double monto) {
		Ticket ticket= null;
		if(this.buscarCompra(numCompra)!=null) {
			Compra compra =this.buscarCompra(numCompra);
			
			if(monto>compra.getProductoMax()) {
				System.out.println("Los productos rebasan el limite de la maquina");
				return ticket;
				//si el monto que tiene mi cta mas el monto que se deposita sumas y exede al limite max 
			}else if (compra.getProductoReal()+monto>compra.getProductoMax()) {
				System.out.println("El monto excederia el maximo de productos que soporta la maquina");
				return ticket;
				//si el deposito puede hacerse
			}else {
				compra.setPago(compra.getPago()+monto);
				
				//generamos un tiket
				ticket = new Ticket (folio++,new Date(),compra.getNombre(),compra.getProductoReal(),this.lugar,idMaquina);
			
				return ticket;
			}
			}else {
				System.out.println("El producto por el momento no esta disponible");
				return ticket;
			}
						
			}
			
			
			
			
		
		
		
		
	

	@Override
	public Ticket venta(int numCompra, double monto) {
		Ticket ticket= null;
		if(this.buscarCompra(numCompra)!=null) {
			Compra compra =this.buscarCompra(numCompra);
			
			if(monto>10) {
				System.out.println("La cantidad no permitida por la maquina");
				return ticket;
			}else if(compra.getProductoReal()<monto) {
				System.out.println("No se tiene la cantidad de producto suficiente que requieres");
				return ticket;
			}else {
				compra.setProductoReal(compra.getProductoReal()-monto);
				ticket = new Ticket (folio++,new Date(),compra.getNombre(),compra.getProductoReal(),this.lugar,idMaquina);
				
				return ticket;
			}
			
			
		}else {
			System.out.println("No has elegido tu compra ni producto");
			return ticket;
		}
		
	}

	
	
	
	
	

}
