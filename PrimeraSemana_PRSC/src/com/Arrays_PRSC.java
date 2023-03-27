package com;

public class Arrays_PRSC {

	public static void main(String[] args) {
		
		/*
		 * Los arrays son una estructura o colecci�n de datos de un mismo tipo
		 * Es decir, tienen un tipo de datos en com�n
		 * y, una vez declarado su tama�o o longitud
		 * esto no puede cambiar. No cambia en tiempo de ejecuci�n
		 */

		//Declarando un array con su tama�o
		
		int [] n�meros = new int[10]; //Un array de n�meros enteros con
		//su tama�o declarado 
		
		//Asignar o introducir valores en cada posici�n del array
		//La possici�n por �ndice en la que inician almacenando valores
		//los arrays, es la posici�n 0
		
		n�meros[0]=1; //indicamos con los corchetes la posici�n del �ndice
		//en el cual se va a almacenar un valor
		
		n�meros[1]=1;
		n�meros[2]=1;
		n�meros[3]=1;
		n�meros[4]=1;
		n�meros[5]=1;
		n�meros[6]=1;
		n�meros[7]=1;
		n�meros[8]=1;
		n�meros[9]=1;
		//n�meros[10]=1; Si introducimos otro valor
		//en teor�a "lo acepta", pero no puede hacer uso de el, porque
		//su tama�o debe estar declarado desde un inicio
		
		//Darle salida a un dato en consola que est� en determinada posici�n
		//del �ndice
		
//		System.out.println(n�meros[9]);
		
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
