package com;

import java.util.Scanner;

public class EjercicioCiclos4 {

	public static void main(String[] args) {
		String cadena;
		char caracter;
		int cont=0;
		Scanner entrada = new Scanner (System.in);
		System.out.println("dijite la cadena de texto:");
		cadena=entrada.nextLine();
		System.out.println("dijite la letra a buscar:");
		caracter=entrada.next().charAt(0);
		for(int i=0; i<cadena.length();i++) {
			if(cadena.charAt(i)==caracter) {
				cont++;
			}
		
			
		}
		if(cont==0) {
			System.out.println("CARACTER NO ENCONTRADO");	
		}
		else {
			System.out.println("el numero de veces que se repite son:"+cont);
		}

	}

}
