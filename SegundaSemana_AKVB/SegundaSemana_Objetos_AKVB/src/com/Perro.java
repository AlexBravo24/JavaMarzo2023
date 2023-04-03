package com;

public class Perro {
	
	/*
	 * Una clase funciona como una plantilla para modelar un objeto.
	 * 
	 * Caemos en el primer pilar de la POO, que es la abstracci�n.
	 * Traer la idea del objeto en la vida real, de acuerdo a lo que
	 * necesitamos en Java.
	 * 
	 * Vamos a definir el objeto, sus atributos, y algunos comportamientos
	 * expresados a trav�s de m�todos.
	 * 
	 * Primero definimos los atributos del objeto.
	 * 
	 * El encapsulamiento es otro pilar de la POO, que protege el acceso a
	 * la informaci�n.
	 * 
	 * Esto se lleva a cabo mediante los modificadores de acceso:
	 * 
	 * 	- private - default - protected - public -
	 */
	
	private String name;
	private int age;
	private double weight;
	private String color;
	
	/*
	 * M�TODOS CONSTRUCTORES:
	 * 
	 * Nos ayudan a crear o construir al objeto con sus respectivos 
	 * atributos.
	 * 
	 * Regularmente se encuentran dos m�todos constructores.
	 * El primero es el constructor vac�o, que nos sirve como un 
	 * comod�n para llamar o instanciar un objeto sin iniciarlo
	 * (sin asignarle valores)
	 */
	
	public Perro() {} //Ejemplo de constructor vac�o.

	/*
	 * M�todo constructor con todos los par�metros
	 * Este m�todo nos ayuda a instanciar nuestro objeto, pero
	 * en este caso si vamos a requerir declarar sus atributos.
	 */
	
	public Perro(String name, int age, double weight, String color) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.color = color;
	}
	
	/*
	 * Podemos generar los constructores necesarios, no hay l�mite.
	 * 
	 * M�TODOS GETTERS Y SETTERS
	 * 
	 * Getter - Devuelve el valor asignado de un atributo.
	 * Setter - Nos permite establecer o asignarle valor a un atributo.
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	// toString imprime en consola los atributos de una clase.
	
	@Override
	public String toString() {
		return "Perro [name = " + name + ", age = " + age + ", weight = " + weight + ", color = " + color + "]";
	}
	
	
	

	
	

}
