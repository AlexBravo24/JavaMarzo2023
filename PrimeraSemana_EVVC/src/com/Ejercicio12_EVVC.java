package com;

import java.util.Scanner;

public class Ejercicio12_EVVC {

	public static void main(String[] args) {
		/*onstruir un programa que calcule el índice de masa corporal de una persona 
		 * (IMC = peso [kg] / altura^2 [m]) e indique el estado en el que se encuentra esa persona 
		 * en función del valor de IMC:
		 */

		double peso;
		double altura;
		double IMC;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese su peso en kilogramos");
		peso=entrada.nextDouble();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Ingrese su altura en metros");
		altura = entrada2.nextDouble();
		
		IMC=peso/(Math.pow(altura,2));
		
		if(IMC<16) {
			System.out.println("IMC= "+IMC+ "\nCriterio de ingreso en hospital");
		}else if (IMC>=16 && IMC<17) {
			System.out.println("IMC= "+IMC+"\nInfrapeso");
		}else if (IMC>=17 && IMC<18) {
			System.out.println("IMC= "+IMC+"\nBajo peso");
		}else if (IMC>=18 && IMC<25) {
			System.out.println("IMC= "+IMC+"\nPeso nomral (Saludable)");
		}else if (IMC>=25 && IMC<30) {
			System.out.println("IMC= "+IMC+"\nSobrepeso (Obesidad grado I)");
		}else if (IMC>=30 && IMC<35) {
			System.out.println("IMC= "+IMC+"\nSobrepeso crónico (Obesidad grado II");
		}else if (IMC>=35 && IMC<40) {
			System.out.println("IMC= "+IMC+"\nObesidad premórbida (Obesidad grado III");
		}else if (IMC>=40) {
			System.out.println("IMC= "+IMC+"\nObesidad mórbida (Obesidad de grado IV");
		}
		
		
		
		
	}

}
