package com;

public class ArrayBidimensional_PRSC {

	public static void main(String[] args) {
		
		/*Array Bidimensional. Pasaríamos del concepto de
		 * una colección de datos lineal
		 * a tener elementos en otra dimensión, es decir,
		 * percibiendolo como una "tabla" [][]
		 * 
		 */
		
		//Declarando un Array de dos dimensiones
		
		int [][] numeros = new int [3][3];
		
		numeros [0][0]=1;
		numeros [0][1]=2; //Columna 0  1  2
		numeros [0][2]=3; //Fila 0 [1][2][3]
		
		
		numeros [1][0]=4;
		numeros [1][1]=5; 
		numeros [1][2]=6;
		
		numeros [2][0]=7;
		numeros [2][1]=8; 
		numeros [2][2]=9;
		
		int[][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		
		
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(matriz[i][j] + " "); //123
			}
			System.out.println();
		}
	}
}
