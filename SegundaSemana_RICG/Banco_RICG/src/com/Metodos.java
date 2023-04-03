package com;

public interface Metodos {
	///Lista de metodos a implementar 
		//Repositorio de metodos 
		
		//Vamos a tener diversos comportamientos a la hora de 
		//realizar operaciones en un cajero
		
		//identifivar o buscar la cuenta con la cual vamos a realizar
		//operaciones
		public Cuenta buscarCuenta (int numCuenta);
		
		//Una vez identificada la cuenta o cuentas, realizamos las 
		//siguientes operaciones
		public Ticket depositar(int numCuenta, double monto);
		public Ticket retirar (int numCuenta, double monto);
		public Ticket tranferir (int cuentaOrigen, int cuentaDestino, double monto);


}
