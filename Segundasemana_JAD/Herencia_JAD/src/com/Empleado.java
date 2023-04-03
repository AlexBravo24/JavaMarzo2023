package com;

// la herencia nos permire reutilizar codigo
//de una clase padre
// la herencia se realiz con la palabra reserbada extends
// despues del nombre de la clase que va a heredar
public class Empleado extends Persona{
	
	// un empleado tambien es una persona, pero tiene otros
	//atributos que lo vuelven  especificamente un empleando
	
	private double salario;
	private String puesto;
	private int idempleado;
	private String rfc;
	
	public Empleado () {}

	public Empleado(String nombre, String genero, int edad, double salario, String puesto, int idempleado, String rfc) {
		super(nombre, genero, edad);
		this.salario = salario;
		this.puesto = puesto;
		this.idempleado = idempleado;
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

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", puesto=" + puesto + ", idempleado=" + idempleado + ", rfc=" + rfc
				+ ", getNombre()=" + getNombre() + ", getGenero()=" + getGenero() + ", getEdad()=" + getEdad() + "]";
	}
    // en la subclase o clase hija, una vez heredando de una clase 
	//padre, se obliga a heredar atributos y comportamientos
	//(metodos) e implementarlos, si es necesario o si los metodos son abstractos
	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("trabajando...");
	}


	

}
