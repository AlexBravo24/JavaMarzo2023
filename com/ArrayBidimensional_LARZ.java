package com;

public class ArrayBidimensional_LARZ {

	public static void main(String[] args) {
		// 
		
		/*
		 * En el Array bidimencional pasariamos del concepto de una coleccion
		 * de datos lineal a tener elementos en otra dimencion, es decir
		 * percibiendolo como una tabla [][]
		 * 
		 */
		//Declarando una array de dos dimensiones
//		int [] [] numeros = new int [3] [3]; //El primero es fila y el segundo la columna
//		
//		numeros [0] [0] = 1;
//		numeros [0] [1] = 2;
//		numeros [0] [2] = 3; //fila 0 [1,2,3]
//		
//		numeros [1] [0] = 4;
//		numeros [1] [1] = 5;
//		numeros [1] [2] = 6;
//		
//		numeros [2] [0] = 7;
//		numeros [2] [1] = 8;
//		numeros [2] [2] = 9;
		
		int [] [] num = {{1,2,3,},{4,5,6},{7,8,9}};
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(num [i][j]);
			}   System.out.println();
		}
		
	}

}
