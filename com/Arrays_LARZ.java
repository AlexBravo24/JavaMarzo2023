package com;

public class Arrays_LARZ {

	public static void main(String[] args) {
		/*
		 * Los Arrays son una estructura o coleccion de deatos de un mismo tipo
		 * Es decir, tienen un tipo de datos en común y
		 * una vez declarado su tamaño o longitud
		 * no puede cambiar. No cambia en tiempo de ejecucion
		 */
		
		//Declarando array con su tamaño
		
		int [] numeros = new int [10]; //Un array de numeros enteros con
		//un tamaño declarado
		
		//Asignar o introducir valores en cada posicion del array
		//La posicion por indice en la que inicia almacenando los valores los arrays
		//es cero
		
		numeros[0] = 1; //Indicamos con los corchetes la posicion del indice
		//en el cual se va a almacenar un valor
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		numeros[5] = 6;
		numeros[6] = 7;
		numeros[7] = 8;
		numeros[8] = 9;
		numeros[9] = 10;
		//numeros[10] = 11; si introducimos otro valor "lo acepta" pero no
		//puede hacer uso de el porque no esta declarado en el tamaño
		//Salida a un dato en consola que esta en determinada posicion del indice
		
		//System.out.println(numeros[5]);
		
		for (int i:numeros) {
			System.out.println(i);
		}
		
		//Otra manera de declarar e iniciar una array ya con  sus valores
		
		int [] num= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		//Tenemos un Array declarado con sus respectivos valores asignados
		
		//imprimir los valores de Array utilizando un ciclo
		
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		
		char [] letra = {'A','l','e','x'};
		
		for (char i: letra) { 
			System.out.println(i);
		}
		
		//System.out.println(letra[0]);
		
		
		String [] nombres = {"Luis","Emmanuel","Erick"};
		
		//System.out.println(nombres[2]);
		
		//for each
		
		for (String i: nombres) { //Para cada uno de los elementos realiza lo siguiente
			System.out.println(i);
		}
		

	}

}
