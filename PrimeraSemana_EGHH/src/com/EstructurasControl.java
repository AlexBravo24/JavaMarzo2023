package com;

public class EstructurasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estructuras Control
		//Estructuras de decisi�n IF - valores Booleanos
		
////		int x = 11;
////		
////		if (x<10) {//Abro mi condici�n, la cual estar� entre parentesis y posteriormente abro una llave para indicar que se va a ejecutar o a realizar.
////			
////			System.out.println("Es menor");
////		}
////		else {
////			System.out.println("Es mayor");
////		}
//		int x = 11;
//		String nombre = "Guadalupe";
//		System.out.println(nombre.length());// El m�todo Length me devuelve el valor num�rico de la longitud del string
////		
////		if(nombre.length()<10) {
////			System.out.println("Si es menor");
////		}else {
////			System.out.println("No es menor");
////		}
//		
//		//System.out.println(nombre.length()+x);
//		//Puedo sumar el valor devuelto por el m�todo length con otro valor num�rico.
//		
//		//Condiciones compuestas con operadores l�gicos AND, OR, NOT, DIFERENTE DE, IGUALDAD.
//		
//		//AND - && - Devuelve un valor true cuando se cumplen todas las condiciones.
//		
//		if (nombre.length()<15 && nombre.length()>9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//OR - || - Devuelven un valor True cuando se cumpla al menos una condici�n.
//		
//		if (nombre.length()<15 || nombre.length()>9) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//	
//		//NOT - ! - Niega una condici�n / cambia el valor de True a False y viceversa
//		
//		if (!(nombre.length()<15)) {
//			System.out.println("Si");
//		}else {
//			System.out.println("No");
//		}
//		
//		//IGUALDAD O COMPARACI�N - == - Comparar el valor, si es igual, manda True, si no manda false.
//		//Un solo igual significa asignaci�n.
//		
//		if (x==11) {
//			System.out.println("Si es igual");
//		}else {
//			System.out.println("No es igual");
//		}
//		
//		//DIFERENTE DE - != - Compara el valor y si es diferente manda True
//		
//		if (x!=11) {
//			System.out.println("Si es diferente");
//		}else {
//			System.out.println("No es diferente");
//		}
		
//		//Estructura if-else concatenado o if-else anidado
//		int dia = 4;
//		
//		if(dia==1) {
//			System.out.println("Lunes");
//		}else if (dia==2){
//			System.out.println("Martes");
//		}else if (dia==3){
//			System.out.println("Mi�rcoles");
//		}else {
//			System.out.println("Desconocido");
//		}
		
		//Estructura de decisi�n SWITCH-CASE
		int dia = 7;
		switch (dia){
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Mi�rcoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		default:
			System.out.println("Desconocido");
		}
		}

}
