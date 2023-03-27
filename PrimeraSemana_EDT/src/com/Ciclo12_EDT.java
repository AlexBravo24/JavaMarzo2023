package com;
import java.util.Scanner;

public class Ciclo12_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
//		cuando el promedio de las edades sea superior a 25
		
		Scanner my_scanner = new Scanner(System.in);
		
		int sumatoria = 0;
		int counter = 0;
		int promedio = 0;
		for (int i = 0; promedio < 25; i++) {
			
			System.out.println("Introduca su edad");
			int edad = my_scanner.nextInt();
			
			counter +=1;
			sumatoria += edad;
			int promedio2 = sumatoria/counter;
			if (promedio2 > 25) {
				promedio = promedio2;
			}
		}
		System.out.println("Promedio: " + promedio);
		System.out.println("El promedio ha superado a 25");

		
		
	}

}
