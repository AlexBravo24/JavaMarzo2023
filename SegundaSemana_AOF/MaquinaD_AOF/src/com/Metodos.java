package com;

public interface Metodos {
	public Compra buscarCompra (int numCompra);	
	public Ticket llenar (int numCompra, double monto);
	public Ticket venta  (int numCompra, double monto);
	

}
