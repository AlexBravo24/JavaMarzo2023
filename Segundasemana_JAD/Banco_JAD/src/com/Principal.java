package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// simulamos una pequeña base de datos con uns HashMap
		
		HashMap<Integer,Cuenta> cuentas=new HashMap<Integer,Cuenta>();
		cuentas.put(1001, new Cuenta("luis",10000.50,500,20000,"debito"));
		cuentas.put(1002, new Cuenta("monse",15000.90,1000,4000,"debito"));
		cuentas.put(1003, new Cuenta("eva",105000.50,4000,15000,"debito"));
		cuentas.put(1004, new Cuenta("lucio",1000.50,100,20000,"debito"));
		cuentas.put(1005, new Cuenta("guillermo",11000,100,50000,"debito"));
		
		//instanciamos a un cajero´para realizar operaciones
		
		Cajero inbursa=new Cajero("periplaza,puebla",1517,cuentas);
		
		//probamos el metodo de buscar cuenta para consular
		//infp de esa cuenta
		
	System.out.println(inbursa.buscarCuenta(1003));
	
		//probamos el metodo de depositar
	//	System.out.println(inbursa.depositar(1001, 8000));
	}

}
