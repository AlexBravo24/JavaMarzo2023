package com;

import java.util.Scanner;

public class Ejercicio8_LFEO {
	/*
	 * 8. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de
seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado
obtenido.
Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje:
“ERROR: número incorrecto”.
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int resultado; // se crea la variable resultado
		
		System.out.println("¿CUAL FUE TU RESULTADO AL LANZAR EL DADO?");
		resultado = entrada.nextInt(); //se guarda el dato introducido por el usuario en la variable

		switch(resultado) {
		case 1: //se cran los casos (cara de los dados y se imprime en cadena de tezto el lado opuesto de la cara introducida)
			System.out.println("SEIS");
			break;
		case 2:
			System.out.println("CINCO");
			break;
		case 3:
			System.out.println("CUATRO");
			break;
		case 4:
			System.out.println("TRES");
			break;
		case 5:
			System.out.println("DOS");
			break;
		case 6:
			System.out.println("UNO");
			break;
		default: //con esto indico que si el numero introducido es diferente al valor de alguna cara del dado me imprima un mensaje de error
			System.out.println("ERROR!! NUMERO INCORRECTO!!");
			break;
		}
		
	}

}
