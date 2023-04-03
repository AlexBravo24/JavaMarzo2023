package com;

public class Laptop {

	//Atributos
	
			private String marca;
			private String sistema;
			private double precio;
			private String color;
			private String teclado;
			
	//Con el modificador static podemos crear constantes 
			// de clase pero aun podemos modificar 
			//su valor mediante getter y setters
	//con el modificador final creamos constantes con valores 
			//inmutables.Puedo retornar su valor, pero no cambiarlo.
			
			
			
	//hablando de la capacidad o de la memoria
	//ram o procesador
	//Un disco duro, una memoria ram y un procesador 
	//también son "objetos"
//En ejemplo la composición se base en que podemos 
//tener objetos que formen parte de otros objetos 
// mas grande 
		
//Tendriamos a un objeto como atributo de otro objeto			
		private RAM ram;
		private Almacenamiento disco;
		private Procesador cpu;
		
		public Laptop () {}

		
		public Laptop(String marca, String sistema, double precio, String color, String teclado, RAM ram,
				Almacenamiento disco, Procesador cpu) {
			super();
			this.marca = marca;
			this.sistema = sistema;
			this.precio = precio;
			this.color = color;
			this.teclado = teclado;
			this.ram = ram;
			this.disco = disco;
			this.cpu = cpu;
		}


		

		public String getMarca() {
			return marca;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}


		public String getSistema() {
			return sistema;
		}


		public void setSistema(String sistema) {
			this.sistema = sistema;
		}


		public double getPrecio() {
			return precio;
		}


		public void setPrecio(double precio) {
			this.precio = precio;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public String getTeclado() {
			return teclado;
		}


		public void setTeclado(String teclado) {
			this.teclado = teclado;
		}


		public RAM getRam() {
			return ram;
		}


		public void setRam(RAM ram) {
			this.ram = ram;
		}


		public Almacenamiento getDisco() {
			return disco;
		}


		public void setDisco(Almacenamiento disco) {
			this.disco = disco;
		}


		public Procesador getCpu() {
			return cpu;
		}


		public void setCpu(Procesador cpu) {
			this.cpu = cpu;
		}


		@Override
		public String toString() {
			return "Laptop [marca=" + marca + ", sistema=" + sistema + ", precio=" + precio + ", color=" + color
					+ ", teclado=" + teclado + ", ram=" + ram + ", disco=" + disco + ", cpu=" + cpu + "]";
		}


		
		
		
			
	
			
			
}
