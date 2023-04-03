package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		// simulamos una peque{a base de datos con un hashmap
		
		HashMap<Integer,Cuenta> cuentas=new HashMap<Integer, Cuenta>();
		
		cuentas.put(1001,  new Cuenta("luis",10000.50,500,20000,"Debito"));
		cuentas.put(1002,  new Cuenta("monse",15000.90,1000,400000,"Debito"));
		cuentas.put(1003,  new Cuenta("eva",105000.50,4000,150000,"Debito"));
		cuentas.put(1004,  new Cuenta("lucio",1000.50,100,20000,"Debito"));
		cuentas.put(1005,  new Cuenta("gullermo",11000.50,100,50000,"Debito"));
		
		//instanciamos a un cajero, para realizar operaciones
		
		Cajero inbursa=new Cajero("PeriPlaza,puebla",1517,cuentas);
		
		//probamos el metodo de buscar cuenta,para consultar la info
		//de esa cuenta
		
		//System.out.println(inbursa.buscarCuenta(1006));
		//probamos el metodo de depositar en una cuenta
//		System.out.println(inbursa.depositar(1001, 8000));
//		System.out.println(inbursa.depositar(1001, 1000));
//		System.out.println(inbursa.depositar(1001, 1000));
//		
		System.out.println(inbursa.depositar(1001, 21000));
		
		//ahora probaremos retir dinero de una cuuenta
		System.out.println(inbursa.retirar(1004, 1));
		//ahora probaremos el metodo de transferencia
		System.out.println(inbursa.transferir(1003, 1004, 19000));
		System.out.println(inbursa.buscarCuenta(1004));
	}
	//realizar un ejercicio que seria simular una maquina expendedora de productos
	//cajero-maquina,cliente,producto,saldo-precio.
	//buscar el producto por codigo
	//despacho de producto-retiro de producto
	//nuevo proyecto expendedora_ELVM
	//clases prinicipal. cuenta-producto.
	

}
