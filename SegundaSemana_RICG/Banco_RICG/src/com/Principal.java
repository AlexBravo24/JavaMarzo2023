package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		HashMap<Integer, Cuenta> cuentas =new HashMap<Integer,Cuenta>();
		cuentas.put(1001,new Cuenta("Luis",10000.50,500,20000,"Debito"));
		cuentas.put(1002,new Cuenta("Monse",15000.90,1000,40000,"Debito"));
		cuentas.put(1003,new Cuenta("Eva",105000.50,4000,150000,"Debito"));
		cuentas.put(1004,new Cuenta("Luis",1000.50,100,20000,"Debito"));
		cuentas.put(1005,new Cuenta("Luis",11000,100,50000,"Debito"));
		
		//Instanciamos a un cajero, para realizar operaciones
		
		Cajero inbursa= new Cajero("Peri Plaza, Puebla",1517,cuentas);
		//Probamos el metodo de buscar cuenta, para consultar la info de esa cuenta
		//System.out.println(inbursa.buscarCuenta(1006));
		
		//Probamos depositar a la cuenta
//		System.out.println(inbursa.depositar(1001, 8000));
//		System.out.println(inbursa.depositar(1001, 1000));
//		System.out.println(inbursa.depositar(1001, 1000));
//		System.out.println(inbursa.depositar(1001, 21000));
//		
		//Probar retirar dinero de una cuenta
		//System.out.println(inbursa.depositar(1003, 8000));
		
		//Probar que no permite retirar dinero de una cuenta
		//System.out.println(inbursa.retirar(1004, 1000));
		
		//Pñrobando el metodo de transferencia
		System.out.println(inbursa.tranferir(1003, 1004, 18000));
		System.out.println(inbursa.buscarCuenta(1004));
		
	}
	
	//Ejercicio simular una maquina expendedora
	//Producto, Precio, 
	//Buscar producto por codigo
	//Despacho de producto (retiro)
}
