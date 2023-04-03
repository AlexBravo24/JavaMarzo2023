package com;

public abstract class Persona {
	
	//ATRIBUTOS
	
	private String nombre;
	private String sexo;
	private int edad;
	
	public Persona() {}
	
	public Persona(String nombre, String sexo, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [nombre = " + nombre + ", sexo = " + sexo + ", edad = " + edad +"]";
	}
	
	/*
	 * La clase puede tener m�todos propios. Los m�todos tambi�n se
	 * pueden llamar comportamientos.
	 */
	
	//Declarando m�todos propios
	public void respirar() {
		System.out.println("Respirando...");
	}
	
	//Declarando un m�todo con argumentos a utilizar.	
	public void comer(String alimento) {
		System.out.println("Comiendo " + alimento + "...");
	}
	
	/*
	 * Declarando otro m�todo con el mismo nombre, pero si argumentos
	 * o diferentes argumentos, para ejemplificar el polimorfismo.
	 * El polimorfismo va de la mano con la sobrecarga de argumentos
	 * y la sobreescritura de m�todos.
	 */
	public void comer() {
		System.out.println("Cenando...");
	}
	
	/*
	 * Un m�todo abstracto es en el que definimos QU� vamos a hacer
	 * pero no definimos el C�MO se va a hacer.
	 */
	
	public abstract void trabajar();
	
	
}
