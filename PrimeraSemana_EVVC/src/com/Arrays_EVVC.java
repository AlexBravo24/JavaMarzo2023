package com;

public class Arrays_EVVC {

	public static void main(String[] args) {
		/*Los arrays son una estructura de colecci�n de datos de un mismo tipo, es decir tienen un 
		 * mismo tipo de datos en com�n y una vez declarado SU TAMA�O este NO SE PUEDE CAMBIAR
		 * No cambia en tiempo de ejecuci�n
		 */
		
		//Declarando un array con su tama�o
//		
//		int [] numeros = new int [10]; //Un array de numeros enteros con su tama�o declarado
//										// pero son valores asignados
//		
//		// Para asignar o introducir valores en cada posici�n de array
//		// La posici�n por indice en la que inician almacenando los valores los arrays es la posicion 0
//		
//		numeros [0]=1; //Mi primera posici�n (dentrode los corchetes) de mi array tiene como valor 1 
//		numeros [1]=2;
//		numeros [2]=3;
//		numeros [3]=4;
//		numeros [4]=5;
//		numeros [5]=6;
//		numeros [6]=7;
//		numeros [7]=8;
//		numeros [8]=9;
//		numeros [9]=10;
//		
//		// Darle salida a un dato de consola que esta en determinada posici�n del indice
//		
//		System.out.println(numeros[5]); //No puede crecerse en tama�o sin declararlo antes, por
//										// ejemplo si se pone 10 en los corchetes aunque lo acepta
//										//no es v�lido al correrlo.
//		
//		// Otra manera de declarar e iniciar un array ya con sus valores 
		
		int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}; //Tenmos un array declarado con sus 
															//respectivos valores asignados
		//Para imprimir en pantalla los valores del array utilizando un ciclo
		 
//		for (int i=0 ; i< num.length; i++) {
//			System.out.print(" " +num[i]);
//		}
//		
//		char [] letra = {'a','l', 'e', 'x'};
//		
//		String [] nombres = {"Luis","Emmanuel","Meli","Erick"};
//		System.out.println("\n"+nombres[1]);
//		
//		//for each - Para cada uno de los elementos realiza lo siguiente
//		
//		for (String i:nombres) {
//			System.out.println(i);
//		}
		
		for (int i: num) {
			System.out.println(i);
		}
				
				
		
		
		
		

		
	}

}
