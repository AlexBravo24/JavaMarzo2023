package com;

import java.util.Scanner;

public class Ejercicio6_LFEO {
	
	/*6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se
clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta
es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que
entrega en un embarque considerando lo siguiente:
* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si
es de tamaño 2.
* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de
tamaño 2.
Precio inicial se recibe desde teclado
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int kilo, tamano; // SE CREA LA VARIALE KILO Y TAMA;O DE TIPO ENTERO
		char tipo;       //SE CREA LA VARIA tipo de tipo char
		double total, precio;  // se crean las variables total y precio de tipo double
		
		System.out.println("INGRESE LOS KILOS DE UVA : ");  // SE PIDE CADA UNO DE LOS DATOS Y SE GUARDA EN SU RESPECTIVA VARIABLE
		kilo = entrada.nextInt();
		
		System.out.println("INGRESA EL PRECIO DEL KILO DE UVA : ");
		precio = entrada.nextDouble();
		
		System.out.println("INGRESA EL TIPO DE UVA : A O B");
		tipo = entrada.next().charAt(0);
		
		System.out.println("INGRESA EL TAMAÑO DE LA UVA : 1 O 2");
		tamano = entrada.nextInt();
		
		if(tipo == 'A') { // si la uva es de tipo A
			if(tamano == 1) { // y de tama;o 1
				precio = precio + .20; //al precio se le aumenta .20
				System.out.println("EL KILO DE LA UVA SE LE SUMARA .20");
			}else { //si no es de tama;o uno quiere decir que es de tama;o 2
				precio = precio + .30; //entonces se le suma .3o
				System.out.println("EL KILO DE LA UVA SE LE SUMARA .30");
			}
			
		}else { //si la uva no es de tipo A quiere decir que es de tipo B
			if(tamano == 1) { //si es de tama;o 1 
				precio = precio - .20;  //se le resta al precio .20
				System.out.println("EL KILO DE LA UVA SE LE RESTARA .20");
			}else { // si no es de tama;a 1 es de tama;o 2
				precio = precio - .50; //se le resta .50 al precio
				System.out.println("EL KILO DE LA UVA SE LE RESTARA .50");
			}
		}
		
		total = precio * kilo; //se calcula el totl multiplicando precio por kilo
		
		System.out.println("EL PRODUCTOR RECIBIRA : "+total+ " POR EL EMBRAQUE"); //se imprime el resutado

	}

}
