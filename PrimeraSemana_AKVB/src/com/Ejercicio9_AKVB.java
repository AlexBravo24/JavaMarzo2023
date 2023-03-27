package com;
import java.util.Scanner;
public class Ejercicio9_AKVB {

	public static void main(String[] args) {
		int dia=0;
		String dia_text ="";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que indica el día de la semana.");
		System.out.println("Ingrese un número (1-7)");
		dia = entrada.nextInt();
		while(dia>7||dia<1){
			System.out.println("FAVOR DE INGRESAR UN DÍA VÁLIDO");
			dia = entrada.nextInt();
		}
		
		switch(dia){
		case 1:
			dia_text = "Lunes";
			break;
		case 2:
			dia_text = "Martes";
			break;
		case 3:
			dia_text = "Miércoles";
			break;
		case 4:
			dia_text = "Jueves";
			break;
		case 5:
			dia_text = "Viernes";
			break;
		case 6:
			dia_text = "Sábado";
			break;
		case 7:
			dia_text = "Domingo";
			break;
		default:
			dia_text = "UNKNOWN";
			break;
		}
		System.out.println("Hoy es " + dia_text);
		
		entrada.close();
		System.out.println("\nMe despido, saludos cordiales.");
	}

}
