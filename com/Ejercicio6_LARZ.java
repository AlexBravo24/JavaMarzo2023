package com;

import java.util.Scanner;

public class Ejercicio6_LARZ {

	public static void main(String[] args) {
		// 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva 
		//la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). 
		//Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar 
		//cuánto recibirá un productor por la uva que entrega en un embarque considerando lo siguiente:
		//Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si es de tamaño 2.
		//Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
		//Precio inicial se recibe desde teclado

		
		System.out.println("Programa que clasifica el tipo y tamaño de uva.");
		System.out.println();
		
		double precio;
		Scanner entrada0 = new Scanner(System.in);
		System.out.println("Introduce el precio inicial por kilo de uva: ");
		precio = entrada0.nextDouble();
		
		String tipo;		
		Scanner entrada1 = new Scanner (System.in);
		System.out.println("Introduce si el tipo de uva es A o B: ");
		tipo = entrada1.next();
		
		int tamano;		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce si el tamaño es 1 o 2: ");
		tamano = entrada2.nextInt();
		
		if (tipo.equals("A") && tamano==1) {
			System.out.println("El precio es de: "+ (precio + 0.20)  );
		}else if (tipo.equals("A") && tamano==2) {
			System.out.println("El precio es de: "+ (precio + 0.30)  );
		}else if (tipo.equals("B") && tamano==1) {
			System.out.println("El precio es de: "+ (precio - 0.30)  );
		}else if (tipo.equals("B") && tamano==2) {
			System.out.println("El precio es de: "+ (precio - 0.50)  );
		}else {
			System.out.println("Error");
		}

	}

}
