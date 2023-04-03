package com;

public interface Metodos {
	
	// lista de metodos a implementar,repositorio de métodos
	
	// vamos atener diverosos comportamientos a la hora de
	//realizar operaciones en un cajero
	
	
	//identificar o buscar la cuenta con la cual 
	//vamos a realizar operaciones
	public Cuenta buscarCuenta(int numCuenta);
	//una vez identificada la uenta o cuentas,realizamos las sig. operaciones
    
	public Ticket depositar(int numCuenta, double monto);
	public Ticket retirar(int numCuenta, double monto);
	public Ticket transferir(int cuentaOrigen, int cuentaDestino,double monto);
}
