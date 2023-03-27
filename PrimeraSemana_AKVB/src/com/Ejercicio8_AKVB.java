package com;
import java.util.Scanner;

public class Ejercicio8_AKVB {
	public static void main(String[] args)
	{
		int dado;
		String opuesta= "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que indica la cara opuesta del dado.");
		System.out.println("Ingrese el numero obtenido al lanzar el dado...");
		dado = entrada.nextInt();
		while(dado > 6 || dado < 1)
		{
			System.out.println("ERROR: Número Incorrecto.");
			dado = entrada.nextInt();
		}
		switch(dado) {
		case 1:
			opuesta = "Seis (6)";
			break;
		case 2:
			opuesta = "Cinco (5)";
			break;
		case 3:
			opuesta = "Cuatro (4)";
			break;
		case 4:
			opuesta = "Tres (3)";
			break;
		case 5:
			opuesta = "Dos (2)";
			break;
		case 6:
			opuesta = "Uno (1)";
			break;
		default:
			System.out.println("ERROR: Número Incorrecto.");
			break;		
		}
		System.out.println("La cara opuesta es: " + opuesta);
		System.out.println("\nMe despido, saludos cordiales.");
		entrada.close();
	}

}
