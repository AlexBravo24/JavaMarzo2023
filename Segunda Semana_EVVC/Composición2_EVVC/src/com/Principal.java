package com;

public class Principal {

	public static void main(String[] args) {
		Procesador cpu = new Procesador (8,14, 3.6);
		Gráficos gpu = new Gráficos ("Radeon",1.825,"12.5 Teraflops");
		Almacenamiento almacenamiento = new Almacenamiento("PCle", "SSD",4, 2.4);
		
		Consolas XboxSeriesX= new Consolas ("Xbox", "Negro",1.928, "15.1x15.1x30.1 cm", cpu,gpu,almacenamiento );
		
		System.out.println(XboxSeriesX);
		

	}

}
