package com;

public interface Metodos {
	//lisa de metodos a implementar o es como un repositorio de metodos
	
	//vamos a tener diversos comportamiento
	//a la hora de realizar operaciones en un cajero
	
	//identificar o buscar la cuenta con la cual
	//vamos a realizar operaciones
	
	public Cuenta buscarCuenta (int numCuenta);
	
	//una vez idetificada la cuenta o cuentas,realizamos las siguientes
	//operaciones
	public Ticket depositar(int numCuenta, double monto);
	public Ticket retirar(int numCuenta, double monto);
	public Ticket transferir(int cuentaOrigen,int cuentaDestino, double monto);
	
	

}
