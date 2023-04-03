package com;

public class ArrayBidimensional_AKVB {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/* Array Bidimensional
		 * Matrices.
		 */
		
		//Declarando una matriz
		
		int [][] matriz = new int[3][3];
		
		matriz[0][0] =  1 ;	
		matriz[0][1] =  2 ;	
		matriz[0][2] =  3 ;
		
		matriz[1][0] =  4 ;	//	[1] [2] [3]
		matriz[1][1] =  5 ;	//  [4] [5] [6]
		matriz[1][2] =  6 ; //  [7] [8] [9]
		
		matriz[2][0] =  7 ;	
		matriz[2][1] =  8 ;	
		matriz[2][2] =  9 ;
		
		int [][] matriz_a = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i = 0 ; i < 3; i++) {
			for(int j = 0 ; j < 3 ; j++) {
				System.out.print(matriz [i][j] + " ");
			}
			System.out.println("");
			
		}

	}

}
