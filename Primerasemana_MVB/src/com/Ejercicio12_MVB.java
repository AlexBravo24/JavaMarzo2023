package com;
import java.util.Scanner;
public class Ejercicio12_MVB {

	public static void main(String[] args) {
// EJERCICIO 12. 2.Construir un programa que calcule el índice de masa corporal de 
// una persona (IMC = peso [kg] / altura2
//[m]) e indique el estado en el que se encuentra esa persona en función del valor de IMC:
//Nota 1.se recomienda el empleo de sentencias if–else anidadas. 
//Nota 2: Los operandos (peso y altura) deben ser introducidos por teclado por el usuario

		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese su peso en kg:  ");
		double peso = entrada.nextDouble();
		System.out.println("Ingrese su altura en metros:  ");
		double altura = entrada.nextDouble();
        double imc = peso / (altura);
        System.out.println("El IMC es:" + imc);
        
        if (imc<16) {
        	System.out.println("Diagnóstico: Criterio de ingreso en hospital");
        }else if(imc ==16 || imc== 17) { 
        	System.out.println("Diagnóstico: infrapeso");
        }else if(imc ==17 || imc== 18) { 
        	System.out.println("Diagnóstico: bajo peso");
        }else if(imc ==18 || imc >25) { 
        	System.out.println("Diagnóstico: peso normal (saludable)");
        }else if(imc ==25 || imc >30) { 
        	System.out.println("Diagnóstico: sobrepeso (obesidad de grado I");
        }else if(imc ==30 || imc >35) { 
        	System.out.println("Diagnóstico: sobrepeso (obesidad de grado II");
        }else if(imc ==35 || imc >40) { 
        	System.out.println("Diagnóstico: obesidad premórbida (obesidad de grado III");
        }else {
        	if (imc>40) {
        		System.out.println("Diagnóstico: obesidad mórbida (obesidad de grado IV");
        	}
        }
        
        
        
		
		
		
	}//cierre del main

}//cierre de la clase
