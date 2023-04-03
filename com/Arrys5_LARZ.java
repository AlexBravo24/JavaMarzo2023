package com;

public class Arrys5_LARZ {

	public static void main(String[] args) {
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		//respectivos precios. Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos. 
		
		String [] productos= {"Articulo 1","Articulo 2","Articulo 3","Articulo 4","Articulo 5"};
		double [] precio= {5,6,7,8,9};
		for (int i=0; i<productos.length; i++) {
			System.out.println("El "+productos [i]+" tiene un precio de "+precio[i]);
		}
		

	}

}
