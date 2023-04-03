package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		//Simulamos una pequeña base de datos con un HashMap
		
		HashMap<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		cuentas.put(1001, new Cuenta("Luis",10000.50,500,20000,"Debito"));
		cuentas.put(1002, new Cuenta("Monse",15000.90,1000,40000,"Debito"));
		cuentas.put(1003, new Cuenta("Eva",105000.50,4000,150000,"Debito"));
		cuentas.put(1004, new Cuenta("Lucio",1000.50,100,20000,"Debito"));
		cuentas.put(1005, new Cuenta("Guillermo",11000.50,100,50000,"Debito"));
		
		//instanciamos a un cajero para realizar operaciones
		
		Cajero inbursa = new Cajero("PeriPlaza, Puebla", 1517,cuentas);
		
		//probamos elmetodo de buscar cta
		//para consultar la inf de esa cta
		
		//System.out.println(inbursa.buscarCuenta(1003));
		
		//PROBAMOS EL METODO DE DEPOSITAR EN UNA CTA
		
//		System.out.println(inbursa.depositar(1001,8000));
//		System.out.println(inbursa.depositar(1001,1000));
//		System.out.println(inbursa.depositar(1001,1000));
		
	
		//retirar dinero
		//System.out.println(inbursa.retirar(1004, 1000));
		
		//probando el metodo de transferencia
		System.out.println(inbursa.trasferir(1003, 1004, 18000));
		System.out.println(inbursa.buscarCuenta(1004));
		
		
		
	}//cierra

}//cierra
