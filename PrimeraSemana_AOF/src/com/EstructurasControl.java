package com;

public class EstructurasControl {

	public static void main(String[] args) {
	
//Estructuras control
//Estructura de decision IF - VALORES BOOLEANOS
		
//	int x = 11;
//		if (x<10){//abro mi condicion entre parentesis y habro una llave para indicar que se va a ejecutar o realizar 
//			
//			
//			System.out.println("Es menor");
//				
//		} else { //llave else inicia
//			System.out.println("Es mayor");//cierra condicion
//		}//llave del else termina
//		
//		//eje2
//		String nombre = "Ariana";
//		System.out.println(nombre.length()); //cuenta caracteres y da nuemero entero 6 letras 
		
//		if(nombre.length()<10) {
//			System.out.println("si es menor");
//		}else {
//			System.out.println("no es menor");
		
//		}//fin eje2
//		//otro jemplo
		//System.out.println(nombre.length()+x);
		
		
		//puedo sumar el valor devuelto por length por un valor numerico
		
		//CONDICIONES COMPUESTAS
		//CON OPERADORES LOGICOS AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		
		//*AND -&& - DEVUELVE UN VALOR TRUE SI SE CUMPLEN LAS CONDICIONES
		
//		if(nombre.length()<15 && nombre.length()>=7) {
//			System.out.println("si");
//		}else {
//			System.out.println("no");
//		}
//		
//		//OR - || - DEVUELVE UN VALOR TRUE CUANDO AL MENOS SE CUMPLE UNA CONDICION
//		if(nombre.length()<15 || nombre.length()<6){
//			System.out.println("si");
//			
//		}else {
//			System.out.println("no");
//		}
//		
//		//NOT - ! - NIEGA UNA CONDICION O CAMBIA 
//		
//		if(!(nombre.length()<15)){ //cumple el segundo mensaje 
//			System.out.println("si");
//			
//		}else {
//			System.out.println("no");
//		}
//		
//		//DIFERENTE DE IGUALDAD O COMPARACION -  == - COMPARA SI ES IGUAL MANDA TRUE SINO FALSE
//		
//		//UN SOLO IGUAL SIGNIFICA ASIGNACION
//		//UN DOBLE == ES IGUAL AL numero QUE COMPARO
//		
//		if(x==11) {
//			System.out.println("si es igual");
//			
//		}else {
//			System.out.println("no es igual");
//		}
//		
//		//DIFERENTE DE != COMPARA EL VALOR ESDIFERENTE MANDA TRUE O DEVUELVE TRUE
//		if(x!=10) {
//			System.out.println("si es diferente");
//		}else {
//			System.out.println("no es diferente");
//		}
		
		//ESTRUCTURA IF-ELSE CONCATENADO O IF-ELSE ANIDADO 
		
//		int dia =1;
//		if(dia==1) {
//			System.out.println("lunes");
//		}else if (dia==2) {
//			System.out.println("martes");
//			
//		}else if(dia==3) {
//			System.out.println("miercoles");
//		}else {
//			System.out.println("desconocido");
//		}
		
		//ESTRUCTURA DE DECISION SWITCH-CASE
		
		int dia=5;
		switch(dia) { //lavve switch
		
		case 1:
			System.out.println("lunes");
			break;
			
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
			default:
				System.out.println("desconocido");
		}//llave switch
		
	}//cierre
}//cierre
