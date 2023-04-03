package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// Simulamos una pequeña base de datos con un HashMap
		
		HashMap<Integer, Cuenta> cuentas = new HashMap <Integer, Cuenta>();
		
		cuentas.put(1001, new Cuenta("Luis",10000.50,500,20000,"Debito"));
		cuentas.put(1002, new Cuenta("Monse",15000.90,1000,40000,"Debito"));
		cuentas.put(1003, new Cuenta("Eva",105000.50,4000,150000,"Debito"));
		cuentas.put(1004, new Cuenta("Lucio",1000.50,100,20000,"Debito"));
		cuentas.put(1005, new Cuenta("Guillermo",11000,100,50000,"Debito"));
		
		//Instanciamos a un cajero para realizar operaciones
		
		Cajero inbursa = new Cajero ("PeriPlaza, Puebla", 1517, cuentas);
		
		//Probamos el metodo de buscar cuenta, para consultar la info de esa cuenta
		//System.out.println(inbursa.buscarcuenta(1003));
		
		//Probamos el metodo de depositar en una cuenta
		System.out.println(inbursa.depositar(1001, 8000));
		System.out.println(inbursa.depositar(1001, 1000));
		System.out.println(inbursa.depositar(1001, 8000));
		
		//probrar retirar dinero de una cuenta
		//System.out.println(inbursa.retirar(1003, 8000));
//		System.out.println(inbursa.retirar(1004, 500));
//		System.out.println(inbursa.retirar(1004, 450));
		
		//probar metodo transferencia
		//System.out.println(inbursa.transferir(1000, 1004, 19000));
		//System.out.println(inbursa.buscarcuenta(1004));
	}

	//Ejercicio - simular una maquina expendedora de productos
	//Buscar el producto por codigo
	//Despacho de producto - retiro
	
	//Nuevo proyecto Expendedora_LARZ
	
}
