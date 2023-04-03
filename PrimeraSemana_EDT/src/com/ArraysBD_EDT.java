package com;
import java.util.Scanner;
public class ArraysBD_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner my_scanner = new Scanner(System.in);
		
		String[][] ciudades = new String[4][4];
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Introduzca el " + (i+1) + " país");
			String pais = my_scanner.nextLine();
			ciudades[i][0] = pais; 
			for (int j = 1; j<= 3; j++) {
				System.out.println("Introduzca la " + (j) + " ciudad");
				String ciudad = my_scanner.nextLine();
				ciudades[i][j] = ciudad;
			}
		}
		
		for (int i = 0; i <= 3; i++) {
			System.out.print("País: " + ciudades[i][0]+ " Ciudades: ");
			for(int j = 1; j<= 3; j++) {
				
				System.out.print(ciudades[i][j] + " ");
			}
			System.out.println();
			System.out.println();
		}

	}

}
