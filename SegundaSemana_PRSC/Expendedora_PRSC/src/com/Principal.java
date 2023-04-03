package com;

import java.util.HashMap;

public class Principal {

	public static void main(String[] args) {
		
		HashMap<String, Producto> productos = new HashMap<String, Producto>();
		productos.put("A01", new Producto("Cheetos",15,8));
		productos.put("A02", new Producto("Rockaleta",8,4));
		productos.put("A03", new Producto("Gansito",17,1));
		productos.put("B01", new Producto("Sabritas",20,10));
		productos.put("B02", new Producto("Sprite",17,3));
		
		Máquina dispensadora = new Máquina(1,1,productos);
		
		System.out.println(dispensadora.buscarProducto("A01"));
		System.out.println(dispensadora.Comprar("A02", 10));
		System.out.println(dispensadora.Comprar("A03", 20));
		System.out.println(dispensadora.Comprar("A03", 20));

	}

}
