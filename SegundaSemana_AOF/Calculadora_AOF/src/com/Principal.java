package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
	Cientifica calculadora1 = new Cientifica ("casio","negro");
	System.out.println(calculadora1);
	
	System.out.println("Elige la operación que quieres hacer en tu calculadora  \n1.- SUMA  \n2.- RESTA \n3.- MULTIPLICACIÓN  " );
	int opc= entrada.nextInt();
	
	if(opc==1) {
	calculadora1.suma();
}else if (opc==2){
	calculadora1.resta();
}else if (opc==3) {
	calculadora1.multiplicacion();
	
	
}else {System.out.println("No valida la opción");}

	
	
	
	
	
	
	
}
	
	
	
	
	
}
