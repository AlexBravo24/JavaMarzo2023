package com;

public class Arrays4_LFEO {
	/*
	 * Dado un array de n�meros de 5 posiciones con los siguientes valores:
      {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
      los valores invertidos, es decir, que el segundo array deber� tener los valores 
      {5,4,3,2,1}
	 * */

	public static void main(String[] args) {
		int [] numeros = {1,2,3,4,5};
		int [] numerosinverso = new int[numeros.length];
		
		for(int i=(numeros.length-1), j=0; i>=0; i--, j++) {
			numerosinverso[j] = numeros[i];
			System.out.println(numerosinverso[j]);
			
		}

	}

}
