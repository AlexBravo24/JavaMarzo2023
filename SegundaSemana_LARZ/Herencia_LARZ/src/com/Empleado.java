package com;

/*
 * La herencia nos permite utilizar codigo de otra clase 
 * (una clase padre)
 * La herencia se realiza con la palabra reservada "extends"
 * despues del nombre de la clase que va a heredar dicho atributo
 */
public class Empleado extends Persona {
	/*
	 * un empleado es una persona, pero tiene otros atributos que
	 * lo vuelven especialmente un salario
	 */
	
	private double salario;
	private String puesto;
	private int idEmpleado;
	private String rfc;
	
	public Empleado () {}

	//Para generar un constructor con los parametros heredador de 
	//la clase padre, primero realizamos herencia con la palabra extends
	//y al generar el constructor elegimos la opcion del constructor
	//de la clase padre
	public Empleado(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc) {
		super(nombre, sexo, edad);
		this.salario = salario;
		this.puesto = puesto;
		this.idEmpleado = idEmpleado;
		this.rfc = rfc;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", puesto=" + puesto + ", idEmpleado=" + idEmpleado + ", rfc=" + rfc
				+ ", toString()=" + super.toString() + "]";
	}

	

	//En la sub clase o clase hija, una vez heredando una clase padre
	//se obliga a heredar atributos y comportamientos (metodos) e
	//implementarlos, si es necesario o si los metodos son abstractos
	
	@Override
	public void trabajar() {
		System.out.println("Trabajando...");
	}
	
}
