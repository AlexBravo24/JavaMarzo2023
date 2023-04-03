package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		//Simulamos una pequeña base de datos con un HashMap;
		
		HashMap <Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		cuentas.put(1001,new Cuenta ("Luis", 10000.5, 500, 20000,"Débito"));
		cuentas.put(1002,new Cuenta ("Monse", 15000.90, 1000, 40000,"Débito"));
		cuentas.put(1003,new Cuenta ("Eva", 105000.5, 4000, 150000,"Débito"));
		cuentas.put(1004,new Cuenta ("Lucio", 1000, 100, 20000,"Débito"));
		cuentas.put(1005,new Cuenta ("Guillermo", 11000, 100, 50000,"Débito"));
		
		//Instanciamos un cajero para realizar las operaciones
		Cajero inbursa=new Cajero("PeriPlaza, Puebla", 1517, cuentas);
		
//		//Probamos el método de buscar cuenta, para consultar la info de esa cuenta
//		System.out.println(inbursa.buscarCuenta(1006));
//		
//		//Probamos el método de depositar en una cuenta
//		System.out.println(inbursa.depositar(1001, 8000 ));
//		System.out.println(inbursa.depositar(1001, 1000));
//		System.out.println(inbursa.depositar(1001, 1000));
//		System.out.println(inbursa.depositar(1001, 21000));
		
//		//Probar retirar dinero de una cuenta
//		System.out.println(inbursa.retirar(1004, 950));
		
		//Probar transferir
		System.out.println(inbursa.transferir(1003, 1004, 18000));
		System.out.println(inbursa.buscarCuenta(1004));
		
		/*Ejercicio: Simular una maquina expendedora de productos
		 * Buscar el producto por código
		 * Despacho de producto - retiro 
		 * Nuevo proyecto Expendedora_EVVC
		 */
		
	}

}
