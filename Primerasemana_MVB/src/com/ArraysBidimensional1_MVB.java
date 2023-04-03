package com;
import java.util.Scanner;
public class ArraysBidimensional1_MVB {

	public static void main(String[] args) {
	// Ejercicio 1 : Crea un programa que pida por pantalla cuatro países y a continuación tres
	//ciudades de cada uno de estos países. Los nombres de ciudades deben
	//almacenarse en un array multidimensional cuyo primer índice sea el
	//número asignado a cada país y el segundo índice el número asignado a
	//cada ciudad.
		
		String [][] paises = new String [4][4]; //tamaño del array
		

		
		for (int i = 0; i<4; i++) { //obtener paises
			System.out.println("Ingresa un país: ");
			Scanner entrada1 = new Scanner(System.in);
			paises[i][0] = entrada1.nextLine();
		}
		for (int j = 0; j<4; j++) { //obtener ciudades
			System.out.println("Ingresa una ciudad: ");
			Scanner entrada2 = new Scanner(System.in);
			paises[i][j] = entrada2.nextLine();
		}
		
		for (int i = 0; i<4; i++) {
			System.out.println("País: "+paises[i][0]+"Ciudades: ");
		for (int j = 0;j<3;j++) {
			System.out.println(paises[i][j]+" ");
		}
		if(j==3); {
	System.out.println(" ");
		}
			
	
		
		
		
		}
		
		
	}//cierre del main

}//cierre de la clase 
