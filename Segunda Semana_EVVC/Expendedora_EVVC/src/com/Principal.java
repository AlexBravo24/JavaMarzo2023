package com;

import java.util.HashMap;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		HashMap <String, Producto>productos = new HashMap<String,Producto>();
		
		productos.put("A01", new Producto("Doritos nacho",18,4));
		productos.put("A02", new Producto("Cheetos torciditos",16,3));
		productos.put("A03", new Producto("Sabritas limón",20,5));
		productos.put("A04", new Producto("Sabritas original",20,10));
		productos.put("A05", new Producto("Rancheritos",16,9));
		productos.put("A06", new Producto("Churrumais",14,8));
		productos.put("A07", new Producto("Doritos incognita",18, 7));
		productos.put("A08", new Producto("Doritos pizzerola",18 ,0));
		
		Maquina sabritas = new Maquina(20,productos);
		
		//System.out.println(sabritas.buscarProducto("A05"));
		
		Scanner entrada =new Scanner(System.in);
		System.out.println("Ingresa el código del producto seleccionado");
		String código = entrada.next();
		//double dinero=entrada.nextDouble();
		
		double dinero =0;
		while(dinero<Producto.getPrecio()) {
			System.out.println("Ingresa el dinero");
			dinero =entrada.nextDouble()+dinero;
		}
		
		
		System.out.println(sabritas.comprar(código, dinero));
		//System.out.println(sabritas.buscarProducto(código));
		
		

	}


}
