package com;
import java.util.Scanner;


public class Ciclos6_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner my_scanner = new Scanner(System.in);
		
//		6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
//		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
//		todo el dinero lo reinvierte?
		
		double money = 1000;
		System.out.println("Mes número 1 = " + money);
		for (int i = 2; i <= 12; i++) {
			money += (money * 0.02); 
			System.out.println("Mes número " + i + " = " + money);
			
		}
		
		

		
	}
}
