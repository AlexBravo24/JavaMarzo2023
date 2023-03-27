package com;

import java.util.Scanner;

public class Ciclos12_EVVC {

	public static void main(String[] args) {
		/*Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		 * cuando el promedio de las edades sea superior a 25
		 */

		double edad;
		double edad1;
		double contador=1;
		
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("Ingresa la primera edad");
		edad1=entrada.nextDouble();
		
		Scanner entrada2= new Scanner(System.in);
		System.out.println("Ingresa las siguientes edades");
		
		double promedio=edad1/contador;
		
		while (promedio <= 25) {
			contador++;
			edad=entrada2.nextDouble();
				edad1=edad+edad1;
				promedio=edad1/contador;
			//System.out.println(promedio + " "+ contador+ " " + edad1);
		}
		System.out.println("El promedio de las edades es de: "+promedio);
	}

}
