package com;

import java.util.Scanner;

public class Ejercicio12_ELVM {

	public static void main(String[] args) {
		/*
		 * 12.Construir un programa que calcule el índice de masa corporal de una persona (IMC = peso [kg] / altura2 
			[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
			Nota 1: se recomienda el empleo de sentencias if–else anidadas. Nota 2: Los operandos (peso y altura) deben 
			ser introducidos por teclado por el usuario.
		 */

		int Altura=0;
		int Peso=0;
		int IMC=0;
		Scanner entrada =new Scanner(System.in);
		System.out.println("Proporcione la Altura: ");
		Altura=entrada.nextInt();
		System.out.println("Proporcione Su Peso: ");
		Peso=entrada.nextInt();
		
		IMC=Peso/(Altura*Altura);
		if(IMC<16) {
			
			System.out.println("Criterio de ingreso en hospital, IMC: "+IMC);
					
		}else if(IMC>=16 && IMC<=17) {
				
			System.out.println("Infrapeso, IMC: "+IMC);
					
		}else if(IMC>17 && IMC<=18) {
			System.out.println("Bajo Peso, IMC: "+IMC);
			
		}else if(IMC>18 && IMC<=25) {
			System.out.println("Peso Normal(saludable), IMC: "+IMC);
			
		}else if(IMC>25 && IMC<=30) {
			System.out.println("Sobrepeso (obesidad de grado 1), IMC: "+IMC);
			
		}else if(IMC>30 && IMC<=35) {
			System.out.println("Sobrepeso Crónico (obesidad de grado 2), IMC: "+IMC);
			
		}else if(IMC>35 && IMC<=40) {
			System.out.println("Obesidad Premórbida (obesidad de grado 3), IMC: "+IMC);
			
		}else if(IMC>40) {
			System.out.println("Obesidad Morbida (obesidad de grado 4), IMC: "+IMC);
			
		}
		else {
			System.out.println("Error");
		}
	}

}
