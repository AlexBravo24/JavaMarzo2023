package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
		//ESTRUCTURAS CONTROL
		//Estructuras de Desici�n IF - Valores Booleanos
		
		int x = 11;
//		
//		if (x<10)
//		{
//			System.out.println("Es menor");
//		}
//		else
//		{
//			System.out.println("Es mayor");
//		}

		String nombre = "Kevin";
		System.out.println(nombre.length());	//lenght devuelve el largo de una cadena
	
//		if(nombre.length()<10)
//		{
//			System.out.println("Es menor");
//		}
//		else
//		{
//			System.out.println("No es menor");
//		}
		
//		System.out.println(nombre.length()+x);	//Sumar length y un valor num�rico
		
		//CONDICIONES COMPUESTAS
		//Con operadores l�gicos AND, OR, NOT, Diferente de, Igualdad.
	
			//AND - && - Devuelve un valor TRUE cuando se cumplen todas
			//las condiciones
		
		if(nombre.length()<15 && nombre.length()>5)
		{
			System.out.println("AND SI");
		}
		else
		{
			System.out.println("AND NO");
		}
		
		//OR - || - Devuelve un valor TRUE cuando se cumple al menos una condici�n
		
		if(nombre.length()<15 || nombre.length()>5)
		{
			System.out.println("OR SI");
		}
		else
		{
			System.out.println("OR NO");
		}
		
		//NOT - ! - Niega una condici�n || cambia el valor de TRUE a FALSE y viceversa
		
		if(!(nombre.length()<15))
		{
			System.out.println("NEGACI�N SI");
		}
		else
		{
			System.out.println("NEGACI�N NO");
		}
		
		//IGUALDAD o COMPARACI�N - == - Comparar el valor, si es igual, devuelve TRUE
		//Un solo igual significa asignaci�n.
		
		if(x==11)
		{
			System.out.println("IGUALDAD SI");
		}
		else
		{
			System.out.println("IGUALDAD NO");
		}
		
		//DIFERENTE DE - != - Compara el valor y si es diferente devuelve TRUE
		
		if(x != 10)
		{
			System.out.println("NOT EQUAL SI");
		}
		else
		{
			System.out.println("NOT EQUAL NO");
		}
		
		//ESTRUCTURA IF ELSE CONCATENADO O IF ELSE ANIDADO
		
		int dia = 4;
		
		if (dia == 1) {
			System.out.println("IF ELSE Lunes");
		}else if (dia == 2){
			System.out.println("IF ELSE Martes");
		}else if (dia == 3) {
			System.out.println("IF ELSE Mi�rcoles");
		}else if (dia == 4) {
			System.out.println("IF ELSE Feliz Jueves");
		}else if (dia == 5) {
			System.out.println("IF ELSE Viernes");
		}else if (dia == 6) {
			System.out.println("IF ELSE S�bado");
		}else if (dia == 7) {
			System.out.println("IF ELSE Domingo");
		}else {
			System.out.println("IF ELSE Desconocido");
		}
		
		//ESTRUCTURA DE DECISI�N SWITCH-CASE
		
		int dia_switch = 4;
		
		switch(dia_switch) {
		case 1:
			System.out.println("SWITCH Lunes");
			break;
		case 2:
			System.out.println("SWITCH Martes");
			break;
		case 3:
			System.out.println("SWITCH Mi�rcoles");
			break;
		case 4:
			System.out.println("SWITCH Feliz Jueves");
			break;
		case 5:
			System.out.println("SWITCH Viernes");
			break;
		case 6:
			System.out.println("SWITCH S�bado");
			break;
		case 7:
			System.out.println("SWITCH Domingo");
			break;
		default:
			System.out.println("IF ELSE Desconocido");
		}
	}//main() Ends.

}//class Ends.
