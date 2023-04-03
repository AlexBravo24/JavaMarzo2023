package com;

public abstract class Persona {
	//atributos
	private String nombre;
	private String sexo;
	private int edad;
	
	public Persona() {}
	public Persona(String nombre, String sexo, int edad) {
		
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	/*
	 * UNA CLASE PUEDE TENER METODOS PROPIOS
	 * LOS METODOS TAMBIEN SE PUEDE LLAMAR COMPORTAMIENTOS
	 * 
	 * DECLARANDO METODOS PROPIOS
	 */
	public void respirar() {
		System.out.println("respirarando...");
	}
	
	//declarando un metodo propio con argumentos a utlizar por el metodo
	public void comer(String alimento) {
		System.out.println("comiendo"+alimento);
	}
	//declarando otro metodo con el mismo nombre, pero con diferentes
	//argumentos o sin argumentos, para ejemplificar el polimorfismo
	//el polimorfismo va de la mano con la sobrecarga de argumentos
	//y la sobreescritura de metodos.
	
	public void comer() {
		System.out.println("cenando...");
		
	}
	//un metodo obstracto es en el que definimos QUÉ se va hacer
	//pero no definimos el COMO se va hacer
	public abstract void trabajador();


}
