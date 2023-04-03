package com;

public interface Metodos {
	
	//Lista de m�todos a implementar
	//Repositorio de M�todos
	
	//Vamos a tener diversos comportamientos
	//a la hora de realizar operaciones en un cajero
	
	//Identificar o buscar la cuenta con la cual
	//vamos a realizar operaciones
	public Cuenta buscarCuenta (int numCuenta);
	
	//una vez identificada la cuenta o cuentas, realizamos las
	//operaciones
	public Ticket depositar(int numCuenta, double monto);
	public Ticket retirar(int numCuenta, double monto);
	public Ticket transferir(int cuentaOrigen, int cuentaDestino, double monto);
		
	
}
