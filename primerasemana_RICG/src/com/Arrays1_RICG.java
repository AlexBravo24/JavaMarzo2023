package com;

import java.util.Scanner;

public class Arrays1_RICG {

	public static void main(String[] args) {
		
		/*Crea un array de 10 posiciones de números con valores pedidos por teclado.
		 * Muestra por consola el índice y el valor al que corresponde.
		 * 
		 */

	Scanner entrada = new Scanner(System.in);	  
	        int num[]=new int[10];
	        
	        int lista;
		
	       rellenarArray(num);
	     
	        mostrarArray(num);
	    }
	 
	    public static void rellenarArray(int lista[]){
	        for(int i=0;i<lista.length;i++){
	            System.out.println("Introduce 10 Números");
	            System.out.println(lista[i]);
	           
	    }
	    }
	 
	    public static void mostrarArray(int lista[]){
	        for(int i=0;i<lista.length;i++){
	            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
	        }
	    }
	 
		
		
	}


