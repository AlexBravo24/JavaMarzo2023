package com;
import java.util.Scanner;

public class Ejercicio10_AKVB {

	public static void main(String[] args) {
		int mes = 0;
		int mes_dias = 0;
		String mes_text = " ";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que dice cuantos días tiene un mes.");
		System.out.println("Escriba el mes en número (1 - 12)");
		mes = entrada.nextInt();
		while(mes < 1 || mes > 12) {
			System.out.println("INGRESAR UN MES VÁLIDO (1 - 12)");
			mes = entrada.nextInt();
		}
		if(mes == 1 ||mes == 3 ||mes == 5 ||mes == 7 ||mes == 8 ||mes == 10 ||mes == 11) {
			mes_dias = 31;
		}else if(mes == 2) {
			mes_dias = 28;
		}else {
			mes_dias = 30;
		}
		switch(mes) {
		case 1:
			mes_text = "Enero";
			break;
		case 2:
			mes_text = "Febrero";
			break;
		case 3:
			mes_text = "Marzo";
			break;
		case 4:
			mes_text = "Abril";
			break;
		case 5:
			mes_text = "Mayo";
			break;
		case 6:
			mes_text = "Junio";
			break;
		case 7:
			mes_text = "Julio";
			break;
		case 8:
			mes_text = "Agosto";
			break;
		case 9:
			mes_text = "Septiembre";
			break;
		case 10:
			mes_text = "Octubre";
			break;
		case 11:
			mes_text = "Noviembre";
			break;
		case 12:
			mes_text = "Diciembre";
			break;
		}
		System.out.println(mes_text + " tiene " + mes_dias + " días.");
		
		System.out.println("\nMe despido, saludos cordiales.");
		entrada.close();
	}

}
