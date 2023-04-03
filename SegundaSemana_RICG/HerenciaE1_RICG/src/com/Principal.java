package com;

public class Principal {

	public static void main(String[] args) {
	
		
		Maestro profe1 = new Maestro("Sofia","Femenino",21287,"Calculo Integral","4 semmestre");
		
		System.out.println(profe1);
		
		Alumno alu = new Alumno("Rosario","Femenino",0,"Electronica","5 semestre",
				1523238,"aprovechamiento","rosario@gmail");
		
		System.out.println(alu);
		

	}	
	
}
