package com;


//La herencia nos permite reutilizar codigo de otra clase (de una clase padre)
//La herencia se realiza con la palabra reservada "extends"
//Despues del nombre de la clase que va heredar dichos atributos

public class Empleado extends Persona {
	
	//Un empleado tambien es una persona pero tiene otros atributos que lo vuelven especificamente un empleado
	
	private double salario;
	private String puesto;
	private int idEmpleado;
	private String rfc;
	
	public Empleado() {}
	
	//Para generar un constructor con los parametros eredados de la clase padre
	//Primero realizamos la herencia con la palabra extends
	//Y al generar el constructor  elegimos la opcion del constructor de la clase padre

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

	//en la subclase o clase hija, una vez heredando de una clase 
	//padre, se obliga a heredar atributos
	//y comportamientos (metodos) e implementarlos, si 
	//es necesario o si los metodos son abstractos
	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Trabajando...");
		
	}

	
	
	
	
	
	
	

}
