package com;

import java.util.Scanner;

public class ArrayBidimensional1_EVVC {

	public static void main(String[] args) {
		/*. Crea un programa que pida por pantalla cuatro países y a continuación tres 
		 * ciudades de cada uno de estos países. Los nombres de ciudades deben 
		 * almacenarse en un array multidimensional cuyo primer índice sea el 
		 * número asignado a cada país y el segundo índice el número asignado a cada ciudad.
		 */
		
		String [][] matriz = new String [4][4];
		
		String país;
		String ciudades;
		
		Scanner entrada = new Scanner (System.in);
		Scanner entrada2 = new Scanner (System.in);
		
		for (int i=0 ; i<matriz.length;i++) {
			System.out.println("Ingresa el país");
			país=entrada.nextLine();
			matriz[i][0]=país;	
			System.out.println("Ingresa las 3 ciudades correspondientes para el país");
			
			for (int j=1; j<matriz.length; j++) {
				ciudades=entrada2.nextLine();
				matriz [i][j]=ciudades;	
			}
		}	
			for (int k=0 ; k<matriz.length ; k++) {
				System.out.print("País: " + matriz[k][0] +"   Ciudades: ");
				for (int l=1 ; l<matriz.length ; l++) {
					System.out.print(matriz[k][l]+"   ");
				}
				System.out.println();
			}
		
		
		
		
		
		


	}

}
