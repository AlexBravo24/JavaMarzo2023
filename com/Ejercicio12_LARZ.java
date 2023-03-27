package com;

import java.util.Scanner;

public class Ejercicio12_LARZ {

	public static void main(String[] args) {
		// 12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / (altura*altura)
		//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC
		System.out.println("Programa que determina el IMC de una persona.");
		System.out.println();
		
		double peso;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba el peso de la persona (en Kg): ");
		peso = entrada.nextDouble();
		
		double altura;
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Escriba la altura de la persona (en m): ");
		altura = entrada2.nextDouble();
		
		double IMC = (peso/(altura*altura));
		
		if (IMC<16) {
			System.out.println("Criterio de ingreso al hospital");
		}else if (IMC<=17) {
			System.out.println("Infrapeso");
		}else if (IMC<=18) {
			System.out.println("Bajo peso");
		}else if (IMC<=25) {
			System.out.println("Peso normal (Saludable)");
		}else if (IMC<=30){
			System.out.println("Sobrepeso (Obesidad grado I)");
		}else if (IMC<=35){
			System.out.println("Sobrepeso crónico (Obesidad grado II)");
		}else if (IMC<=40){
			System.out.println("Obesidad premórbida (Obesidad grado III)");
		}else if (IMC>40){
			System.out.println("Obesidad mórbida (Obesidad grado IV)");
		}
	}
}
