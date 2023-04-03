package com;

public class Principal {
	public static void main(String[] args) {
		
		
		Accesorio acceso = new Accesorio("Pista",2);
		Seguro seguro =new Seguro("si","no");
		Servicio servi =new Servicio("no","cada 3 meses");
		
		Motoneta YH= new Motoneta(2598,"Yamaha","Negra",acceso,seguro,servi);
		
		System.out.println(YH);
		
	}
	
	

}
