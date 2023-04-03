package com;

public class ArrayBidimensional2_EVVC {

	public static void main(String[] args) {
		/*Crea las siguientes matrices. Ejemplo: String matrizA [] [] = new String [3][5];
		 * Para que muestre los siguientes valores: (Valores en el pdf de ejercios)
		 */

		String matrizA [][]= {{"5","x","9","4","t"},{"3","z","P","c","6"},{"8","3","f","i","7"}};
		String matrizB [][]= {{"7","P","4","g","8"},{"5","w","Y","10","2"},{"4","7","v","o","6"}};
		int matrizC[][] = new int [3][5];
		
		
		for(int i=0; i<3; i++) {
			for (int j=0; j<5; j++) {
				try {
						int numA=Integer.parseInt(matrizA[i][j]);
						int numB=Integer.parseInt(matrizB[i][j]);
						
								matrizC [i][j]=numA+numB;
			
				}catch (Exception ex){
					matrizC[i][j]=0;
					
				}
			}
			
		}
		
		for (int k=0 ; k<3 ; k++) {
			for (int l=0 ; l<5 ; l++) {
				System.out.print(matrizC[k][l]+"   ");
			}
			System.out.println();
		}
	
		
	}

}
