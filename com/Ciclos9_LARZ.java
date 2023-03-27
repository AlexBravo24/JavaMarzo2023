package com;

import java.util.Scanner;

public class Ciclos9_LARZ {

	public static void main(String[] args) {
		// 9. Programa Java que lea dos números y muestre los números pares entre ellos 
		System.out.println("Programa Java que lea dos números y muestre los números pares entre ellos");
		System.out.println();
		
		Scanner entrada = new Scanner(System.in);
        int A; 
        int B;

        do {
            System.out.print("Introduce un número entero: ");
            A = entrada.nextInt();
            System.out.print("Introduce otro número entero mayor que el anterior: ");
            B = entrada.nextInt();
            if (A >= B) {
                System.out.println("El segundo número debe ser mayor que el primero");                  
            }
        } while (A >= B);

        System.out.println("\nNúmeros pares desde " + A + " hasta " + B + " : ");
        for (int i = A; i <= B; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

	}

}
