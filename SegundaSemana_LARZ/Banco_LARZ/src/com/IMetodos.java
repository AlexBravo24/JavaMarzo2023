package com;

public interface IMetodos {
	
	//Lista de metodos a implementar
	//Repositorio de metodos
	
	//Vamos a tener diversos comportamientos a la hora
	//de realizar operaciones en un cajero
	
	//Identificar o buscar la cuenta con la cual vamos a realizar 
	//operaciones
	public Cuenta buscarcuenta (int numCuenta);
	
	//Identificada la cuenta, realizamos las siguientes operaciones
	public Ticket depositar (int numCuenta, double monto);
	public Ticket retirar (int numCuenta, double monto);
	public Ticket transferir (int numCuenta, int cuentaDestino, double monto);
	

}
