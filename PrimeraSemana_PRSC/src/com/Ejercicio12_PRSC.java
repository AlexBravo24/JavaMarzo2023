package com;

import java.util.Scanner;

public class Ejercicio12_PRSC {

	public static void main(String[] args) {
		/*
		 * 12.Construir un programa que calcule el �ndice de masa corporal de una persona (IMC = peso [kg] / altura2 
		 * [m]) e indique el estado en el que se encuentra esa persona en funci�n del valor de IMC:
		 */

		double peso;
		double altura;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu peso (kg):");
		peso = entrada.nextDouble();
	
		System.out.println("Ingresa tu altura(m)");
		altura = entrada.nextDouble();
		
		double imc = peso/Math.pow(altura,2);
		
		if (imc<16) {
			System.out.println("Su IMC es: " + imc + " y es criterio de ingreso en hospital");
		} else if (imc==16 || imc<17) {
			System.out.println("Su IMC es: " + imc + " y es infrapeso");
		} else if (imc==17 || imc<18) {
			System.out.println("Su IMC es: " + imc + " y es bajo peso");
		} else if (imc==18 || imc<25) {
			System.out.println("Su IMC es: " + imc + " y es saludable");
		} else if (imc==25 || imc<30) {
			System.out.println("Su IMC es: " + imc + " y tiene sobrepeso (Obesidad grado I)");
		} else if (imc==30 || imc <35) {
			System.out.println("Su IMC es: " + imc + " y tiene sobrepeso cr�nico (Obesidad grado II)");
		} else if (imc==35 || imc <40) { 
			System.out.println("Su IMC es: " + imc + " y tiene obesidad prem�rbida (Obesidad grado III)");
		} else if (imc>=40) {
			System.out.println("Su IMC es: " + imc + " y tiene obesidad m�rbida (Obesidad grado IV)");
		}
				
	}

}