package com;

public class Arrays_JAD {

	public static void main(String[] args) {
		// los arrays son estructuras o coleccion de datos de un mismo tipo
		// es decir tienen un tipo de dato en común y una ves declarado su longitud
		// este no cambia en tiempo de ejecucion
		
		// declarando un array con su tamaño
		int[] numeros = new int[10]; // un array de numeros enteros con su tamaño declarado
		
		// asignar o introducir valores a cada posicion de array
		// la posicion con la que empiezan los arrays es 0
		numeros[0]=1; //indicamos con los corchetes la posicion del indice en la cual se va
		//a almacenar el valor
		numeros[1]=2;
		numeros[2]=3;
		numeros[3]=4;
		numeros[4]=5;
		numeros[5]=6;
		numeros[6]=7;
		numeros[7]=8;
		numeros[8]=9;
		numeros[9]=10;
		//numeros[10]=11; no lo puede imprimir por que supera la longitud del array declarado desde 
		//el inicio
		
		//darle salida a un dato en consola que esta en determinada posicion del indice
		
		System.out.println(numeros[3]);
		
		//otra manera de declarar un array ya con sus valores
		
		int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		// tenemos un array delcrado con sus valores ya asignados desde el inicio
		System.out.println(num[6]);
	// imprimir todos los valores del array usando un ciclo
	for(int i=0;i<num.length;i++) {
		System.out.print(num[i]+",");
	}
			
			char [] letra= {'a','b','c','o'};
			for(char i:letra) {
				System.out.println(i);
				
			}
			
			String [] nombres = {"luis","alex","chuy","richar"};
			for(String i:nombres) {
				System.out.print(i);
			}
		}
		

	}


