package com;

import java.util.Scanner;

public class Ejercicio13_LFEO {
	/*
	 * 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
      centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
      Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
      y el resto se invierte en la bolsa.

      Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
      ni�os y el resto se invierte en la bolsa.
      La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double donacion, centrosalud, comedor, invbolsa; //se crean las variables donde se guardara cada dato
		
		System.out.println("INGRESE EL MONTO A DONAR:");
		donacion = entrada.nextDouble(); // se guarda el monto a donar
		
		if(donacion>=10000) { //si es mayor o igual a 10,000
			centrosalud = (donacion*30)/100; //se calcula el 30% para el centro de salud
			comedor = (donacion*50)/100; // se calcula el 50% para comedor
			invbolsa = donacion - centrosalud - comedor; // se calcula el resto para invertir en la bolsa
			System.out.println("AL CENTRO DE SALUD SE DESTINARA : "+centrosalud+ " ANUALMENTE");
			System.out.println("AL COMEDOR SE DESTINARA : "+comedor+ " ANUALMENTE");
			System.out.println("A LA BOLSA SE INVERTIRA : "+invbolsa+ " ANUALMENTE");
		}else {  //es menor a 10,000
			centrosalud = (donacion*25)/100; //se calcula el 25%
			comedor = (donacion*60)/100; //se calcula el 60%
			invbolsa = donacion - centrosalud - comedor; //se calcula el resto para invertir en la bolsa
			System.out.println("AL CENTRO DE SALUD SE DESTINARA : "+centrosalud+ " ANUALMENTE");
			System.out.println("AL COMEDOR SE DESTINARA : "+comedor+ " ANUALMENTE");
			System.out.println("A LA BOLSA SE INVERTIRA : "+invbolsa+ " ANUALMENTE");
			
		}

	}

}
