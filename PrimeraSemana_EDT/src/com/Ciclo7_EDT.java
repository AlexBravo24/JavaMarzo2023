package com;

public class Ciclo7_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
//		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
//		dinero?
		
		double money = 700;
		int counter = 0;
		for (int i = 2; money <= 1500; i++) {
			money += (money*0.02); 
			counter += 1;
			System.out.printf("%.2f",money);
			System.out.println();
		}
		System.out.println("Juntaste los $1,500 en " + counter + " meses");
	}

}
