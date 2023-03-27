package com;

import java.util.Scanner;

public class Ejercicio11_LFEO {
	/*
	 * 11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
     Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
     la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
     
     Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
     cuestiones de logística y seguridad.
     Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
     de la entrega
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int zona, pesoPa,cobroentrega;
		
		
		System.out.println("SELECCIONE LA ZONA CORRESPONDIENTE AL NUMERO DONDE ENVIARA SU PAQUETE :");
		System.out.println();
		System.out.println("1. America Del Norte");
		System.out.println("2. America Central");
		System.out.println("3. America Del Sur");
		System.out.println("4. Europa");
		System.out.println("5. Asia");
		zona = entrada.nextInt();
		
		System.out.println("CUANTO PESA TU PAQUETE A ENVIAR?");
		pesoPa = entrada.nextInt();
		
		switch(zona) {
		case 1:
			if(pesoPa<=5) {
				System.out.println("EL COSTO POR KILO DEL PAQUETE ES DE 24 EUROS");
				cobroentrega = pesoPa*24;
				System.out.println("EL TOTAL A PAGAR DEL PAQUETE CON ENVIO AMERICA DEL NORTE ES : "+cobroentrega+" EUROS");
			}else {
				System.out.println("LA ENTREGA ES RECHAZADA, SUPERA EL LIMITE DE LOS KILOS PERMITIDOS");
			}
			break;
			
		case 2:
			if(pesoPa<=5) {
				System.out.println("EL COSTO POR KILO DEL PAQUETE ES DE 20 EUROS");
				cobroentrega = pesoPa*20;
				System.out.println("EL TOTAL A PAGAR DEL PAQUETE CON ENVIO AMERICA CENTRAL ES : "+cobroentrega+" EUROS");
			}else {
				System.out.println("LA ENTREGA ES RECHAZADA, SUPERA EL LIMITE DE LOS KILOS PERMITIDOS");
			}
			break;
			
		case 3:
			if(pesoPa<=5) {
				System.out.println("EL COSTO POR KILO DEL PAQUETE ES DE 21 EUROS");
				cobroentrega = pesoPa*21;
				System.out.println("EL TOTAL A PAGAR DEL PAQUETE CON ENVIO AMERICA DEL SUR : "+cobroentrega+" EUROS");
			}else {
				System.out.println("LA ENTREGA ES RECHAZADA, SUPERA EL LIMITE DE LOS KILOS PERMITIDOS");
			}
			break;
			
		case 4:
			if(pesoPa<=5) {
				System.out.println("EL COSTO POR KILO DEL PAQUETE ES DE 10 EUROS");
				cobroentrega = pesoPa*10;
				System.out.println("EL TOTAL A PAGAR DEL PAQUETE CON ENVIO A EUROPA ES : "+cobroentrega+" EUROS");
			}else {
				System.out.println("LA ENTREGA ES RECHAZADA, SUPERA EL LIMITE DE LOS KILOS PERMITIDOS");
			}
			break;
			
		case 5:
			if(pesoPa<=5) {
				System.out.println("EL COSTO POR KILO DEL PAQUETE ES DE 18 EUROS");
				cobroentrega = pesoPa*18;
				System.out.println("EL TOTAL A PAGAR DEL PAQUETE CON ENVIO ASIA ES : "+cobroentrega+" EUROS");
			}else {
				System.out.println("LA ENTREGA ES RECHAZADA, SUPERA EL LIMITE DE LOS KILOS PERMITIDOS");
			}
			break;
		default:
			System.out.println("EL NUMERO INGRESADO NO PERTENECE A NINGUNA ZONA");
			break;
			
			
			
		}

	}

}
