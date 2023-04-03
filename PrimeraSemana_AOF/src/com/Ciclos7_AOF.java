package com;

public class Ciclos7_AOF {

	public static void main(String[] args) {
//		Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
//		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
//		dinero?
double capital= 700.00;
double intereses=0.02;
double total=0.0;
int mes=0;
while (total<1500.00){
	total=total +(capital*intereses);
	mes++;
	
}
System.out.println("El capital final es de "+total);
System.out.println("meses invertidos :" +mes);




	}

}
