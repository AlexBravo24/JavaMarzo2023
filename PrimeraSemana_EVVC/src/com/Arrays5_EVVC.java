package com;

public class Arrays5_EVVC {

	public static void main(String[] args) {
		/*Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		 * respectivos precios. Muestra en consola la lista de productos y sus precios. 
		 * Por lo menos 5 productos o art�culos
		 */

		String [] productos = {"Papel","L�piz","Lapicero", "Borrador","Plum�n"};
		double [] precios = {1, 4.5, 14, 3, 17 };
		
		for (int i=0 ; i< precios.length ; i++) {
			System.out.println("El precio de un " + productos[i] + " es de: $"+ precios[i]);
		}
		
	}

}
