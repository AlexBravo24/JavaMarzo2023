package com;

public class ArrayBidimencional_ELVM {

	public static void main(String[] args) {
		/*Array bidimencional
		 * pasariamos del concepto de na coleccion de datos lineal
		 * a tener elementos en otra dimension, es decir,
		 * percibiendoo como una "tabla" [] []
		 * 
		 */
		
		//declarando un array de dos dimensiones
		int[][] numeros=new int[3][3];
		numeros[0][0]=1;
		numeros[0][1]=2;//                 columna  0  1  2
		numeros[0][2]=3; //     pocicion es fila 0 [1][2][3]
		                 //                 Fila 1 [ ][ ][ ]
		numeros[1][0]=4;
		numeros[1][1]=5;
		numeros[1][2]=6;
		
		numeros[2][0]=7;
		numeros[2][1]=8;
		numeros[2][2]=9;
		int[][] matriz= {{1,2,3},
				         {4,5,6},
				         {7,8,9}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(matriz[i][j]+" ");//123
			}
			System.out.println();
		}
	}

}
