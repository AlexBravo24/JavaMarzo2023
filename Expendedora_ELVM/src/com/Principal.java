package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
			String Codigo;
		int DineroIn=0;
		HashMap<String, Producto> producto = new HashMap <String, Producto>();
		System.out.println("\tProducto: \nCoca 600ml--Clave: C101\t\t$18 pesos\nAgua 600ml--Clave:A102\t\t$12 pesos\nValle frut 250ml--Clave:V103\t$9 pesos\nMamut--Clave:M104\t\t$10 pesos\nChips--Clave:C105\t\t$17 pesos\n");
		
		
		producto.put("C101", new Producto("Coca 600ml","C101",18));
		producto.put("A102", new Producto("Agua","A102",12));
		producto.put("V103", new Producto("Valle frut 250ml","V103",9));
		producto.put("M104", new Producto("Mamut","M104",10));
		producto.put("C105", new Producto("Chips","C105",17));
		Maquina Maqui = new Maquina (1,producto);
		Scanner entrada = new Scanner (System.in);
		
		
		do {
		System.out.println("Dijita la clave del producto: ");
		Codigo=entrada.next();
		if(Maqui.buscarProducto(Codigo)==null) {
			System.out.println("Clave incorrecta-- :(");
		}else {
			System.out.println("Excelente....siguiente");
		}
		}while(Maqui.buscarProducto(Codigo)==null);
		
		
		
		
		
		do {
			System.out.println("Inserte la moneda: ");
			DineroIn=entrada.nextInt()+DineroIn;
			System.out.println(Maqui.Darproducto(Codigo, DineroIn));
			
		}while(DineroIn<=Producto.getPrecio()); 
		
		
	
		
		
		
		
		
		
	
	}

}
