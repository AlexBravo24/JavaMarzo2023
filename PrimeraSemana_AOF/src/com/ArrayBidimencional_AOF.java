package com;

import java.util.Scanner;

public class ArrayBidimencional_AOF {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
	/*Array Bidimencional. Pasariamos el concepto una coleccion de datos lineal a tener elemento en otra
	 * dimensión percibiendolo como una tabla
	 *
	 */
		
		//declarando el array de dos dimensiones
//		int [][] numeros = new int [3][3];
//		
//		numeros[0][0]=1;
//		numeros[0][1]=2;//columna 0 1 2
//		numeros[0][3]=3;//fila cero [1][2][3]
//							//fila 1 [][][]
//		
//		numeros[1][0]=4;
//		numeros[1][1]=5;
//		numeros[1][2]=6;
//		
//		numeros[2][0]=7;
//		numeros[2][1]=8;
//		numeros[2][2]=9;
		int [][] matriz = { {1,2,3},
							{4,5,6},
							{7,8,9}};
		
		
		for(int i=0; i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+ " ");//en la posision tal esta en valor tal....
				
			}
			System.out.println();//daun salto de linea
		}
		
		
		
	}//CIERRA

}//CIERRA
