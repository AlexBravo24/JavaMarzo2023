package com;

public class ArrayBidemensional_EVVC {

	public static void main(String[] args) {
		/*Array de dos dimensiones
		 * Pasariamos del concepto de una colección de datos lineal a tener elementos en otra
		 * dimension, es decir percibiendolo como una tabla [] [] se indica así y se leen como
		 * unas coordenadas (uno se refiere a filas y el otro a columnas)
		 */

		//Declarando un array de dos dimensiones
		int [][] matriz = new int [3][3]; //se declara de cuanto x cuanto va a ser ese array
											//el primero indica fila y el segundo columna
		
		matriz [0][0]= 1;				// se veria similar a esto
		matriz [0][1]= 2;				// 1  2  3
		matriz [0][2]= 3;				// 4  5  6
		matriz [1][0]= 4;				// 7  8  9
		matriz [1][1]= 5;				//así sucesivamente
		matriz [1][2]= 6;
		matriz [2][0]= 7;
		matriz [2][1]= 8;
		matriz [2][2]= 9;
		
		int [] [] matriz2 = {{1,2,3}, {4,5,6},{7,8,9}};
		
		for (int i=0; i<3 ; i++) {
			for (int j=0 ; j<3; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
