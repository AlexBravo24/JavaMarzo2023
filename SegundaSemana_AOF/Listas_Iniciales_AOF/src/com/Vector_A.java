package com;

import java.util.Scanner;

public class Vector_A {

	public static void main(String[] args) {
		
		int number;  
		Scanner obj=new Scanner(System.in);  
		System.out.print("Total de elementoss: ");    
		number=obj.nextInt();    
		int[] array = new int[20];  
		System.out.println("Ingresa elementos ");  
		for(int i=0; i<number; i++)  
		{     
		array[i]=obj.nextInt(); //reads elements from the user 
		}  
		System.out.println("tus elementos son: ");  
		for (int i=0; i<number; i++)   
		{  
		System.out.println(array[i]);  
		}  
		}  
		
		
		
		
		
		
		
		
		
		
		
		
	}//cierra

