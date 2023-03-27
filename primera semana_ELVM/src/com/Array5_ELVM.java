package com;

public class Array5_ELVM {

	public static void main(String[] args) {
		/*
		 * 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
			respectivos precios. Muestra en consola la lista de productos y sus precios.
			Por lo menos 5 productos o artículos.
		 */
		String producto []={"xbox", "play","nintendo","pc"};
		 double precios[]={100,200,300,1000000};
		 System.out.println("Lista de Productos y sus precios");
		 for (int i=0;i<producto.length;i++){
		 System.out.println(producto[i]+ " "+ precios[i]); 
		} 

	}

}
