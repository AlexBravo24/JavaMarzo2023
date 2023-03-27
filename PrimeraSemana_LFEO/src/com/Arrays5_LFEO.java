package com;

public class Arrays5_LFEO {
/*
 * 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
   respectivos precios. Muestra en consola la lista de productos y sus precios. 
   Por lo menos 5 productos o artículos
 * */
	public static void main(String[] args) {
		String productos []= {"PC","MAUSE","PANTALA","MOCHILA","SILLA"};
		double precios [] = {450.50,250.60,300.0,420,210.34};
		
		System.out.println("ESTA ES LA LISTA DE LOS PRODUCTOS Y SUS RESPECTIVOS PRECIOS");
		
		for(int i=0; i<productos.length; i++) {
			System.out.println(productos[i]+ " : " +precios[i]);
		}
		

	}

}
