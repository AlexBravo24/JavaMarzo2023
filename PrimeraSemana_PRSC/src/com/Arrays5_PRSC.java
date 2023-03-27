package com;

public class Arrays5_PRSC {

	public static void main(String[] args) {
		/*
		 * . Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		 * respectivos precios. Muestra en consola la lista de productos y sus precios. 
		 * Por lo menos 5 productos o artículos
		 */

		String [] productos = {"Aceite", "Arroz", "Papel", "Huevo", "Jabón"};
		double [] precios = {30,25,20,70,18};
		
		for (int i = 0; i <precios.length; i++) {
		System.out.println(productos[i] + " $ " +precios[i]);		
		}
		
	}

}
