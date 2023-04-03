package com;

public class  Empleado extends Persona {//La herencia nos permite reutilizar codigo de otra clase
	//De una clase Padre
	//La herencia se realiza con la palabra reservada "extends" despues de la 
	//clase que va heredar dichos atributos
	
	
	//Un empleado tambien es una persona 
	//Pero tambien tiene otros atributos que lo vuelven especificamente
	
	private double salario;
	private String puesto;
	private int idempleado;
	private String rfc;
	
	public Empleado() {
		
	}
	//Para generar un constructor con los parametros heredados de la clase padre,
	//primero realizamos herencia con la palabra extends y al generar el constructor
	//elegimos la opcion del constructor 

	public Empleado(String nombre, String sexo, int edad, double salario, String puesto, int idempleado, String rfc) {
		super(nombre, sexo, edad);
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
				+ ", toString()=" + super.toString() + "]";
	}
//En la subclase  o clase hija, una vez heredando de una clase padre, se obliga a heredar atributos
	//y comportamientos (métodos) e implementarlos, si es necesario o si los metodos son necesesarios.
	
	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Trabajando...");
		
	}

	
	

}
