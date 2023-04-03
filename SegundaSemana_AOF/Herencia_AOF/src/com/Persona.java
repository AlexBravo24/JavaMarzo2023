package com;

public abstract class Persona {
	
	//Atributos
	private String nombre;
	private String sexo;
	private int edad;
	public Persona() {}
	public Persona(String nombre, String sexo, int edad) {
		super();
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
	
	//Una clase puede tener metodos propios 
	//se puedenllamar comportamientos
	
	//Declarando metodos propios
	public void respirar () {
		
		System.out.println("Respirando...");
		
		
	}
	//declarando un metodo propiocon argumento a utilizar por 
	//el metodo 
	public void comer(String alimento) {
		System.out.println("Comiendo"+alimento);
	}
	//declaarando otro metodo con el mismo nombre pero con diferentes argumentos
	
	//sin argumentos y ejemplificar el polimorfismo
	
	//el polimorfismo va de la mano con la carga de argumentos y
	//la sobreescritura de metodos
	
	public void comer()	{
		
		System.out.println("Cenando");
	}
	
	//Un metodo abstracto es en el que definimos que se va hacer 
	//pero no como se va hacer
	public abstract void trabajar();
	
	
	
	
	

}//cierra
