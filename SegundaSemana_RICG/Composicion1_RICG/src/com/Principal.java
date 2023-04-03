package com;

public class Principal {
	
	public static void main(String[] args) {
		
	

	Accesorios producto = new Accesorios("SA98","rosa","doble","inalambricos",750.00);
	Conectividad conecxion = new Conectividad("internet","8.0","66w");
	Elementos funcion = new Elementos("13 pixeles","si");
	
	Tablet cuadrada = new Tablet("Samsung","2023 G",8500,9,producto,conecxion,funcion);
	
	
	System.out.println(cuadrada);
	
	
	}
	
}
