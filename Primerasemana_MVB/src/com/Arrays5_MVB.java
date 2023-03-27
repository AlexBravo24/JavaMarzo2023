package com;

public class Arrays5_MVB {

	public static void main(String[] args) {
	// EJERJCICIO 5 Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
	//respectivos precios. Muestra en consola la lista de productos y sus precios.
	//Por lo menos 5 productos o artículos.
		
	String [] productos = {"Goma","Regla","Lápiz","Pluma","Colores"};
	
	double[]precios = {15.00,20.00,8.00,10.00,25.00};
	
	System.out.println("Lista de productos y precios: ");
	for (int i = 0; i<productos.length; i++) {
		System.out.println(productos[i]+": $" + precios[i]);
	}
		
	
	
	
	
		
	}//CIERREDELMAIN

}//CIERREDELACLASE
