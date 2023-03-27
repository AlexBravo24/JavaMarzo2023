package com;

public class Arrays4_ELVM {

	public static void main(String[] args) {
		/*
		 * 4. Dado un array de números de 5 posiciones con los siguientes valores:
         {1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
		los valores invertidos, es decir, que el segundo array deberá tener los valores
		{5,4,3,2,1}.

		 */
		int [] numeros={1,2,3,4,5};
		int i2=0;
		//int[] invertido = new int[numeros.length];
		int [] invertido=new int[numeros.length];
		for (int i = numeros.length - 1; i >= 0; i--) {
			invertido[i2]=numeros[i];
			System.out.println("invertido "+invertido[i2]);
			i2++;
			
		}
	}

}
