package com;

public abstract class Persona { 

	//Atributos
	
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
	
	//Una clase puede tener m�todos propios
	//Los m�todos tambi�n se pueden llamar comportamientos
	
	//Declarando m�todos propios
	
	public void respirar() {
		System.out.println("Respirando...");
	}
	
	//Declarando un m�todo propio con argumentos a utilizar por el
	//m�todo
	public void comer(String alimento) {
		System.out.println("Comiendo "+alimento);	
	}
	
	//Declarando otro m�todo con el mismo nombre, pero con diferentes
	//argumentos o sin argumentos, para ejemplificar el polimorfismo
	//El polimorfismo va de la mano la sobrecarga de argumentos
	//y la sobrescritura de m�todos
	public void comer() {
		System.out.println("Cenando...");
	}
	
	//Un m�todo abstracto es en el que definimos que se va a hacer
	//pero no definimos el COMO se va a hacer.
	public abstract void trabajar();
}
