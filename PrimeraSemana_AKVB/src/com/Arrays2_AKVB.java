package com;

public class Arrays2_AKVB {

	public static void main(String[] args) {
		int [] numeros = new int [100];
		double suma = 0;
		double media = 0;
		System.out.println("Array 1-100, suma, media.");
		for (int i = 0 ; i < numeros.length ; i++) {
			numeros[i] = i + 1;
//			System.out.println(numeros[i]);
			suma = suma + numeros[i];
		}
		media = suma/100;
		System.out.printf("\n100! = " + "%.0f",suma);
		System.out.printf("\nMedia = " + media);
	}

}
