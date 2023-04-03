package com;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Cientifica cientifica1 = new Cientifica ("Negro","Casio",2018);
		System.out.println(cientifica1);
		cientifica1.tomarTemperatura();
		
		System.out.println("¿Qué operacion desear realizar?\n1.Suma\n2.Resta\n3.Divicion\n4.Multiplicacion\nRespuesta: ");
		int i;
		Scanner sc = new Scanner (System.in);
		i = sc.nextInt();
		
		if (i==1) { cientifica1.suma(0, 0);
			
		} else if (i==2) { cientifica1.resta(0, 0);
			
		} else if (i==3) { cientifica1.division(0, 0);
			
		} else if (i==4) { cientifica1.multiplicacion(0, 0);
			
		} else { System.out.println("Opcion invalida");
			
		}
		
		
	}

}
