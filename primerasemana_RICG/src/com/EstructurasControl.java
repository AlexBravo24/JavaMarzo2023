package com;

public class EstructurasControl {

	public static void main(String[] args) {
		
//		//ESTRUCTURAS DE CONTROL
//		//Estructuras de desición IF - Valores Booleanos
//		
       	//int x = 11;
//		if (x<10) {//abro mi condición, la cual estara dentro del parentesis, y posteriormente abro una llave indicando que se ejecura o realizar
//			
//		System.out.println("Es menor");	
//		}else {
//			System.out.println("Es mayor");
//		}
		
     	//String nombre= "Rosario";
    	//System.out.println(nombre.length());//el metodo length me devuelve el valor numerico de la longitud de String
//		
//		if(nombre.length()<10) {
//			System.out.println("Si es menor");
//		}else {
//			System.out.println("No es menor");
//		}
		
		//System.out.println(nombre.lenth()+x);
		//puedo sumar el valor devuelto por el metodo length con otro valor numerico
		
		//Condiciones compuestas 
		//Con operadores logico AND, OR, NOT, DIFERENTE DE, IGUALDAD
		
		 //AND = & & = devuelve un valor true cuando se cumplen todas las condiciones 
       	
//       	if(nombre.length()<15 && nombre.length()>=9) {
//       		System.out.println("Si");
//       	}else {
//       		System.out.println("No");
//       	}
       	
       	
       	//OR - || - devuelven un valor true cuando se cumpla al menos una condición
       	
//       	if(nombre.length()<15 || nombre.length()>9) {
//       		System.out.println("Si");
//       	}else {
//       		System.out.println("No");
//       	}
//       	
//       	//NOT - ! - Niega una condición o cambia el valor de true a falso o viseversa
//       	
//       	if(!(nombre.length()<15)) {
//       		System.out.println("Si");
//       	}else {
//       		System.out.println("No");
//       	}
//       	
//       	//IGUALDAD O COMPARACIÓN - == - comparar el valor, si es igual manda true 
//       	//un solo igual significa asignación
//       	
//       	if(x==11) {
//       		System.out.println("Si es igual");
//       	}else {
//       		System.out.println("No es igual");
//       	}
//
//       	//diferente de - != - Compara el valor y si es diferesnte manda un true
//       	
//
//       	if(x!=10) {
//       		System.out.println("Si es diferente ");
//       	}else {
//       		System.out.println("No es diferente");
//       	}
//       	
     // Estructura if-else concatenado o if-else anidado
    	
//    	int dia = 4;
//    	
//    	if(dia==1) {
//    		System.out.println("Lunes");
//    	}else if(dia ==2) {
//    		System.out.println("Martes");
//    	} else if (dia ==3) {
//    		System.out.println("Miercoles");
//    	}else {
//    		System.out.println("Desconocido");
//    	}
       	
    	//ESTRUCTURA DE DESICIÓN SWITCH-CASE
    	
    	int dia = 7;
    	
    	switch (dia) {
    	case 1:
    	System.out.println("Lunes");
    	break;
    	case 2:
    	System.out.println("Martes");
    	break;
    	case 3:
    	System.out.println("Miercoles");
    	break;
    	case 4:
    	System.out.println("Jueves");
    	break;
        default:
    	System.out.println("Desconocido");
    	break;
    	}
    	
    	
	}

}
