package com;

import java.util.Scanner;

public class Ejercicio12_RICG {

	public static void main(String[] args) {
		
		float peso;
		float altura;
		float imc;
		String d1 = "Criterio de Ingreso en hospital, <16 ";
		String d2 = "infrapeso, de 16 a 17";
		String d3 = "bajo peso, de 17 a 18";
		String d4 = "peso normal (saludable), de 18 a 25";
		String d5 = "sobrepeso (obesidad de grado I), de 25 a 30";
		String d6 = "sobrepeso cronico (obesidad de grado II), de 30 a 35";
		String d7 = "obesidad premorbida(obesidad de grado III, de 35 a 40)";
		String d8 = "obesidad premorbida(obesidad de grado IV, de >40)";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu peso actual");
		peso = entrada.nextFloat();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingresa tu altura");
		altura = entrada1.nextFloat();
		
		imc=(peso/(altura*altura));
		
		if(imc<15) {
			System.out.println("Tu masa corporal es de " +imc+ " y tu diagnostico es " +d1);
		}else if(imc >=16 && imc==17) {
			System.out.println("Tu masa corporal es de " +imc+ " y tu diagnostico es " +d2);
		}else if(imc >17 && imc==18) {
			System.out.println("Tu masa corporal es de " +imc+ " y tu diagnostico es " +d3);
		}else if(imc >18 && imc<25) {
			System.out.println("Tu masa corporal es de " +imc+ " y tu diagnostico es " +d4);
		}else if(imc ==25 && imc<=30) {
			System.out.println("Tu masa corporal es de " +imc+ " y tu diagnostico es " +d5);
		}else if(imc >30 && imc<=35) {
			System.out.println("Tu masa corporal es de " +imc+ " y tu diagnostico es " +d6);
		}else if(imc >35 && imc<=40) {
			System.out.println("Tu masa corporal es de " +imc+ " y tu diagnostico es " +d7);
		}else if(imc >40) {
			System.out.println("Tu masa corporal es de " +imc+ " y tu diagnostico es " +d8);
		}
		
	}

}
