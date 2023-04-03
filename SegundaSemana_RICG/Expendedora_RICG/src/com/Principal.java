package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("Producto: Doritos, Clave: A15, Costo: 5 pesos"
				+ "\nProducto: Sabritas, Clave: C35, Costo: 10 pesos"
				+ "\nProducto: Coca-Cola, Clave: E78, Costo: 9 pesos"
				+ "\nProducto: Pepsi, Clave: E78, Costo: 7 pesos"
				+ "\nProducto: Pingüinos, Clave: F99, Costo: 13 pesos");
		
		String Cla;
		int Pe;
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Dijita el codigo: ");
		Cla=sc.next();
		System.out.println("Con cuanto va a pagar: ");
		System.out.println("Nota: La maquina solo acepta monedas de 1, 2, 5, 10");
		Pe=sc.nextInt();
		
		HashMap<String, Productos> producto = new HashMap <String, Productos>();
		
		producto.put("A15", new Productos("Doritos","A15",5));
		producto.put("C35", new Productos("Sabritas","C35",10));
		producto.put("D45", new Productos("Coca-Cola","D45",9));
		producto.put("E78", new Productos("Pepsi","E78",7));
		producto.put("F99", new Productos("Pingüinos","F99",13));
		
		Maquina M1 = new Maquina (1,producto);
		
		System.out.println(M1.Darproducto(Cla, Pe));

	}

}
