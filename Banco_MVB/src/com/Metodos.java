package com;

public interface Metodos {

	//Lista de métodos a implementar
	//Repositorio de métodos 
	
	//Vamos a tener diversos comportamientos
	//a la hora de realizar operaciones un cajero 
	
	//	Identificar o buscar la cuenta con la cual vamos a
	//realizar operaciones
	public Cuenta buscarCuenta (int numCuenta);
	
	
	
	//Una vez identificada la cuenta o cuentas, realizamos las 
	//siguientes operaciones 
	public Ticket depositar(int numCuenta, double monto);
	public Ticket retirar (int numCuenta,double monto);
	public Ticket transferir (int cuentaOrigen, int cuentaDestino,double monto);
	
	
	
	
	
	
}
