package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// Simulamos una peque;a base de datos con un  HashMap
		
		HashMap<Integer, Cuenta> cuentas = new HashMap<Integer, Cuenta>();
		
		cuentas.put(1001, new Cuenta("Luis",10000.50,500,20000,"Debito"));
		cuentas.put(1002, new Cuenta("Monse",15000.90,1000,40000,"Debito"));
		cuentas.put(1003, new Cuenta("Eva",105000.50,4000,150000,"Debito"));
		cuentas.put(1004, new Cuenta("Lucio",1000.50,100,20000,"Debito"));
		cuentas.put(1005, new Cuenta("Guillermo",11000,100,50000,"Debito"));
		
		//INSTANCIAMOS UN CAJERO PARA REALIZAR OPERACIONES
		Cajero inbursa = new Cajero("PeriPlaza, Puebla", 1517,cuentas);
		
		//Probamos el metodo de buscar cuenta, para consultar la info de esa cuenta
		
		//System.out.println(inbursa.buscarCuenta(1003));
		
		//PROBAMOS EL METODO DEPOSITAR CUENTA
		//System.out.println(inbursa.depositar(1001, 8000));
		//System.out.println(inbursa.depositar(1001, 1000));
		//System.out.println(inbursa.depositar(1001, 8000));
		//System.out.println(inbursa.depositar(1001, 21000));
		
		//PROBAR EL METODO RETIRAR CUENTA
		//System.out.println(inbursa.retirar(1004, 1000));
		
		//PROBAR EL METODO DE TRANSFERENCIA
		System.out.println(inbursa.transferir(1003, 1004, 19000));
		System.out.println(inbursa.buscarCuenta(1004));
		

	}
	
	//EJERCICIO SIMULAR UNA MAQUINA EXPENDEDORA DE PRODUCTOS
	//1 BUSCAR EL PRODUCTO POR CODIGO
	//2 DESPACHO DE PRODUCTO - RETIRO
	
	//NUEVO PROYECTO Expendedora_INICIALES

}
