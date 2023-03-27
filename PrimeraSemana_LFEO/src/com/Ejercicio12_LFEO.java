package com;

import java.util.Scanner;

public class Ejercicio12_LFEO {
	/*
	 * 12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
       [m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
       
       Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben 
       ser introducidos por teclado por el usuario.
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("INGRESE SU PESO KG");
		peso = entrada.nextDouble();
		System.out.println("INGRESE SU ALTURA");
		altura = entrada.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.println("SU INDICE DE MASA CORPORAL ES DE: "+imc);
		
		if(imc>=16 && imc<17) {
			System.out.println("infrapeso");
		}else if(imc>=17 && imc<18) {
			System.out.println("bajo peso");
		}else if(imc>=18 && imc<25) {
			System.out.println("peso normal (saludable)");
		}else if(imc>=25 && imc<30) {
			System.out.println("sobrepeso (obesidad grado I)");
		}else if(imc>=30 && imc<35) {
			System.out.println("sobrepeso cronico (obesidad grado II)");
		}else if(imc>=35 && imc<40) {
			System.out.println("obesidad premorbida (obesidad grado III)");
		}else if(imc>=40) {
			System.out.println("obesidad morbida (obesidad grado IV)");
		}
		

	}

}
