package com;

public class Arrays2_MVB {

	public static void main(String[] args) {
	//Ejercicio 2:. Crea un array de números de 100 posiciones, que contendrá los números del
	//1 al 100. Obtén la suma de todos ellos y la media.
		
		int[] numeros = new int [100];
		 for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = i + 1;
	        }
		 int suma = 0;
	        for (int i = 0; i < numeros.length; i++) {
	        	suma += numeros[i];
	            double media = (double) suma / numeros.length;
	            System.out.println("La suma de los números es: " + suma);
	            System.out.println("La media de los números es: " + media);
	        }
		
//	//// Explicación del profe ----
//	        int[] numeros = new int [100];
//	        int suma = 0;
//	        double media;
//	        for (int i = 0; i<numeros.length; i++) {
//	            numeros[i] = i+1;
//	            suma += numeros[i];
//	        }
//	        System.out.println("La suma es "+suma);
//	        media=(double)suma/numeros.length;
//	        System.out.println("La media es "+media);

	        
	        
	        

	}//cierre del main

}//cierre de la clase
