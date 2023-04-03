package com;

import java.util.Scanner;

public class ArrayDimension1_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [][] paises=new String [4][4];
		Scanner entrada = new Scanner(System.in);
	for(int i=0;i<4;i++) {
		
		
		System.out.println("Ingresa el nombre del pais");
		paises[i][0]=entrada.next();
				for(int j=1;j<4;j++) {
					
					System.out.println("ingresa la ciudad del pais");
					paises[i][j]=entrada.next();
									
	}
	}
		
		for(int i=0;i<4;i++) {
			System.out.println("paises :"+paises[i][i]+"cuidades :"+paises[i][1]+" "+paises[i][2]+" "+paises[i][3]);
			
		}
		
		

	}//C

}//C
