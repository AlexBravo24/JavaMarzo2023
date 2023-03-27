package com;

public class EjercicioArrays2 {

	public static void main(String[] args) {
		int numeros[]= new int [100];
		int suma=0,j=0;
		double media;
        for(int i=0;i<numeros.length;i++) {
        	numeros[i]=i+1;
        	suma+=numeros[i];
        
        	
        }
        media=(double)suma/numeros.length;
        System.out.println("la suma total es:"+suma);
        System.out.println("la media es:"+media);
       
	}

}
