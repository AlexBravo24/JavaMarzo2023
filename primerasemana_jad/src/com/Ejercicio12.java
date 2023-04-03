package com;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		float peso,altura,imc;
		Scanner entrada =new Scanner (System.in);
		System.out.println("introduzca su peso en kg:");
		peso=entrada.nextFloat();
		System.out.println("introduzca su altura en mts:");
		altura=entrada.nextFloat();
		imc=peso/((float) Math.pow(altura, 2));
		if(imc<16) {
			System.out.println("usted tiene CRITERIO DE INGRESO AL HOSPITAL");
		}
		else if(imc>=16 && imc<=17) {
			System.out.println("usted tiene INFRAPESO");
		}
		else if(imc>=17 && imc <=18) {
			System.out.println("usted tiene BAJO PESO");
		}
		else if(imc>=18 && imc <=25) {
			System.out.println("usted tiene PESO NORMAL (SALUDABLE)");

	}
		else if(imc>=25 && imc <=30) {
			System.out.println("usted tiene SOBREPESO (OBESIDAD GRADO 1)");
		}
		else if(imc>=30 && imc <=35) {
			System.out.println("usted tiene SOBREPESO CRÓNICO ( OBESIDAD GRADO 2)");
		}
		else if(imc>=35 && imc <=40) {
			System.out.println("usted tiene OBESIDAD PREMÓRBIDA ( OBESIDAD GRADO 3)");
		}
		else {
			System.out.println("usted tiene OBESIDAD MÓRBIDA ( OBESIDAD DE GRADO 4)");
		}
	}	

}
