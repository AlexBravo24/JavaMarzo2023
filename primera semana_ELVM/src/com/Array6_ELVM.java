package com;

import java.util.Scanner;

public class Array6_ELVM {

	public static void main(String[] args) {
		/*
		 * 1. Crea un programa que pida por pantalla cuatro pa�ses y a continuaci�n tres
				ciudades de cada uno de estos pa�ses. Los nombres de ciudades deben
				almacenarse en un array multidimensional cuyo primer �ndice sea el
				n�mero asignado a cada pa�s y el segundo �ndice el n�mero asignado a
				cada ciudad.
		 */


		String[][] ciudades=new String[4][3];
		String[] pais=new String [4];
		Scanner entrada=new Scanner(System.in);
		//String imprimir="";
		
		for(int i=0;i<4;i++) {
			System.out.println("dame el pais: ");
			pais[i]=entrada.nextLine();
			
		}
		for(int i=0;i<4;i++) {
			for(int j=0;j<3;j++) {
			System.out.println("dame la ciudad del pais"+i);
			ciudades[i][j]=entrada.nextLine();
			
		
			}
			
		}
		
        for(int i=0;i<4;i++){
            System.out.print("\n"+pais[i]+" ");
            for(int j=0;j<3;j++){
                System.out.print(ciudades[i][j]+"\t\t\t");
            }
        }
		
	}

}
