package com;

import java.util.Scanner;

public class ArrayBidimensional1 {

	public static void main(String[] args) {
		String[][] paises =new String[4][4];
		Scanner entrada = new Scanner (System.in);
		for(int i=0;i<4;i++) {
			System.out.println("ingrese el nombre del pais");
			paises[i][0]=entrada.next();
			for(int j=1;j<4;j++) {
				System.out.println("ingrese la ciudad del pais:");
				paises[i][j]=entrada.next();
			}
		}
		for( int i=0;i<4;i++) {
			System.out.println("paises : "+paises[i][i]+" ciudades : "+paises[i][1]+" "+paises[i][2]+" "+paises[i][3]);
		//	for(int j=0;j<4;j++) {
			//	System.out.print(paises[i][j]);
				
			}
			
		}

	}


