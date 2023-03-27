package com;

public class Arrays_PRSC {

	public static void main(String[] args) {
		
		/*
		 * Los arrays son una estructura o colección de datos de un mismo tipo
		 * Es decir, tienen un tipo de datos en común
		 * y, una vez declarado su tamaño o longitud
		 * esto no puede cambiar. No cambia en tiempo de ejecución
		 */

		//Declarando un array con su tamaño
		
		int [] números = new int[10]; //Un array de números enteros con
		//su tamaño declarado 
		
		//Asignar o introducir valores en cada posición del array
		//La possición por índice en la que inician almacenando valores
		//los arrays, es la posición 0
		
		números[0]=1; //indicamos con los corchetes la posición del índice
		//en el cual se va a almacenar un valor
		
		números[1]=1;
		números[2]=1;
		números[3]=1;
		números[4]=1;
		números[5]=1;
		números[6]=1;
		números[7]=1;
		números[8]=1;
		números[9]=1;
		//números[10]=1; Si introducimos otro valor
		//en teoría "lo acepta", pero no puede hacer uso de el, porque
		//su tamaño debe estar declarado desde un inicio
		
		//Darle salida a un dato en consola que está en determinada posición
		//del índice
		
//		System.out.println(números[9]);
		
		//Otra manera de declarar e iniciar un array ya son sus valores
		
		int [] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		//Tenemos un array declarado con sus respectivos valores
		//asignados
		
		//Imprimir en pantalla los valores del array utilizando un ciclo
		
		for (int i = 0; i <num.length; i++) {
	//	System.out.println(num[i]);
		}
		
		char [] letra = {'A','l','e','x'};
		
		String [] nombre = {"Luis","Emmanuel","Meli","Erick"};
		//System.out.println(nombre[3]);
//		System.out.println(nombre);
		
		//for each
		
		for (String i: nombre) { //Para cada uno de los elementos realiza lo siguiente
			//System.out.println(i);
		}
		
	}

}
