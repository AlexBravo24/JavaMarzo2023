package com;

public class Arrays4_MVB {

	public static void main(String[] args) {
	// Ejercicio 4. Dado un array de números de 5 posiciones con los siguientes valores:
	//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
	//los valores invertidos, es decir, que el segundo array deberá tener los valores
	//{5,4,3,2,1}.
		
		int [] numeros = {1,2,3,4,5};
		int [] numerosInvertidos = new int [numeros.length];
		 for (int i = 0; i <numeros.length; i++) {
			 numerosInvertidos [i] = numeros [numeros.length - i - 1];
		 }
		for (int i = 0; i<numeros.length;i++) {
			System.out.println("El valor en la posición"+i+" es: "+numerosInvertidos[i]);
		}
		
		
		
		
	}//cierredelmain

}//cierredelaclase
