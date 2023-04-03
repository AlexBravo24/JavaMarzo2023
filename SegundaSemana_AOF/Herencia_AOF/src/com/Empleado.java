package com;



//La herencia no permite reeutilizar codigo de otraclase (clase padre)
//laherencia se realiza conla palabra reservada "extends"
//despues del nombre de la clase queva a heredar los atributos 

public class Empleado extends Persona { 
//un empleado es una persona pero tiene otros atributos 
	//que lo vuelven especificamente un empleado
	
	private double salario;
	private String puesto;
	private int idEmpleado;
	private String RFC;
	
	public Empleado() {}

	//para generar un constructor con las parametros heredados de la clase padre
	//primero hacemos herencia con la palabra extends 
	//y al generar el constructor elegimos el contrusctos de la clase padre (en el manu de arriba cuando se generan)
	public Empleado(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rFC) {
		super(nombre, sexo, edad);
		this.salario = salario;
		this.puesto = puesto;
		this.idEmpleado = idEmpleado;
		RFC = rFC;
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

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", puesto=" + puesto + ", idEmpleado=" + idEmpleado + ", RFC=" + RFC
				+ ", toString()=" + super.toString() + "]";
	}
	
	
//en la clase hija una vez heredando de una clase padre se obliga a heredar
	//atributos y comportamientos es decir metodos e implementarlos si es necesario
	//o si los metodos son abstractos
	
	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Trabajando...");
	}

	
	
	
}
