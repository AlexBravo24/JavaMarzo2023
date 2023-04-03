package com;

public interface Metodos {
	//Lista de metodos a implementar
	//Repositorios  de metodos 
	
	
	//Vamos a tener dioversos comportamientos a la hr de realizar operaciones
	
	
	//identificar buscar la cta con la cual se haran las operaciones
	public Cuenta buscarCuenta (int numCuenta);
	//una vez identificada cta hacemos las siguientes operaciones
	public Ticket depositar (int numCuenta, double monto);
	public Ticket retirar  (int numCuenta, double monto);
	public Ticket trasferir (int cuentaOrigen,int cuentaDestino, double monto);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}//cierra
