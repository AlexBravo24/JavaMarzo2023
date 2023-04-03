package com;

import java.util.Scanner;

public class Ejercicio5_AOF {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//REALIZA UN PROGRAMA QUE CALCULE LA ACEPTACIÓN DE UNA SOLICITUD EN BASE A LOS SIGUIENTES PARÁMETROS
		//EDAD:NOTA:SEXO:
		Scanner entrada = new Scanner(System.in);
		int edad =18;
		System.out.println("Ingrese edad");
		edad = entrada.nextInt();
		
		if(edad==18){
			System.out.println("posible");
		}else {
			System.out.println("no aceptada");
		}
		int nota=5;
		System.out.println("Ingrese nota");
		nota = entrada.nextInt();
		if(nota==5) {
			System.out.println("posible");
		}else {
			System.out.println("no aceptada");
		}
	
		String sexo;
		System.out.println("Ingrese sexo (M o F)");
		sexo = entrada.next();
		 if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
		      System.out.println("El valor de sexo introducido es incorrecto.\n"
		          + "por favor, reenvíe el formulario.");
		      }else if(sexo.toUpperCase().equals("M")) {
		          System.out.println("POSIBLE");
		      }else if
		    	  (sexo.toUpperCase().equals("F")) {
		    	  System.out.println("ACEPTADA");
		 
		      }else {
		          System.out.println("NO ACEPTADA");
		      }
		
		
	}

}
