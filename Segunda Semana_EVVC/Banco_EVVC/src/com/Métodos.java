package com;

public interface M�todos {

	//Lista de m�todos a implementar, como un repositorio de m�todos
	
	//Vamos a tener diversos comportamientos a la hora de realizar operaciones en un cajero
	
	//Identificar buscar la cuenta con la cual vamos a realizar operaciones
	public Cuenta buscarCuenta(int numCuenta);
	
	//Una vez identificada la cuenta o cuentas, realizamos las siguientes operaciones
	public Ticket depositar (int numCuenta, double monto);
	public Ticket retirar (int numCuenta, double monto);
	public Ticket transferir (int cuentaOrigen,int cuentaDestino, double monto);
	
	
}
