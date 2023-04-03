package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Simulamos una peque�a base de datos con un HashMAp
		
		HashMap<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		cuentas.put(1001, new Cuenta("Luis",10000.50,500,20000,"D�bito"));
		cuentas.put(1002, new Cuenta("Monse",15000.90,100,40000,"D�bito"));
		cuentas.put(1003, new Cuenta("Eva",105000.50,4000,150000,"D�bito"));
		cuentas.put(1004, new Cuenta("Lucio",1000.50,100,20000,"D�bito"));
		cuentas.put(1005, new Cuenta("Guillermo",11000,100,50000,"D�bito"));
		
		//Instanciamos a un cajero, para realizar operaciones
		
		Cajero inbursa = new Cajero("PeriPlaza, Puebla",1517,cuentas);
		
		//Probamos el m�todo de buscar cuenta, para consultar la info
		//de esa cuenta
		//System.out.println(inbursa.buscarCuenta(1006));
		
		//Probamos el m�todo de depositar en una cuenta
//		System.out.println(inbursa.depositar(1001, 8000));
//		System.out.println(inbursa.depositar(1001, 1000));
//		System.out.println(inbursa.depositar(1001, 1000));
		
		//Probar retirar dinero de una cuenta
//		System.out.println(inbursa.retirar(1003, 8000));
//		System.out.println(inbursa.retirar(1004, 1000));
		
		//Probar el m�todo de transferencia
		System.out.println(inbursa.transferir(1003, 1004, 18999.5));
		System.out.println(inbursa.buscarCuenta(1004));
		
		
	}
	
	//Ejercicio - Simular una m�quina expendedora de productos
	//Buscar el productopor c�digo
	//Despacho de producto - retiro
	
	
	//Nuevo Proyecto Expendedora_PRSC

}
