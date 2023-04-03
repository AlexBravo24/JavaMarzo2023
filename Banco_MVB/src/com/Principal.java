package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {

		//Simulamos una pequeña base de datos con un HashMap
		
		HashMap<Integer,Cuenta> cuentas = new HashMap<Integer,Cuenta>();
		
		cuentas.put(1001, new Cuenta("Luis",10000.50,500,20000,"Debito"));
		cuentas.put(1002, new Cuenta("Monse",15000.50,1000,40000,"Debito"));
		cuentas.put(1003, new Cuenta("Eva",105000.50,4000,150000,"Debito"));
		cuentas.put(1004, new Cuenta("Lucio",1000.50,100,20000,"Debito"));
		cuentas.put(1005, new Cuenta("Guillermo",11000,100,50000,"Debito"));
		
//Instanciamos a un cajero para realizar operaciones
		Cajero inbursa = new Cajero("Periplaza,Puebla",1517,cuentas);

	//Probamos el método de buscar cuenta para consultar la infor de esa cuenta 
System.out.println(inbursa.buscarCuenta(1006));
		
//Probamos el método de depósitar en una cuenta
//System.out.println(inbursa.depositar(1001, 8000));
//System.out.println(inbursa.depositar(1001, 1000));
//System.out.println(inbursa.depositar(1001, 8000));	
//System.out.println(inbursa.depositar(1001, 21000));

//Probamos retirar dinero de una cuenta 
//System.out.println(inbursa.retirar(1004,1000));

//Probamos transferencia de dinero 
System.out.println(inbursa.transferir(1003,1004,18000));
System.out.println(inbursa.buscarCuenta(1004));

//EJERCICIO -SIMULAR UNA MÁQUINA EXPENDEDORA DE PRODUCTOS
//BUSCAR EL PRODUCTO POR CÓDIGO 
//DESPACHO DE PRODUCTO (RETIRO DE PRODUCTO)
//NUEVO PROYECTO- Expendedora_MVB


	}

}
