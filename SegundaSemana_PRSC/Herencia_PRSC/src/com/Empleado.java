package com;

//La herencia nos permite reutilizar c�digo de otra clase
//(De una clase padre)
// La HARENCIA se realiza con la palabra reservada "extends"
//despu�s del nombre de la clase que va a heredar dichos atributos
public class Empleado extends Persona {

	//Un empleado tambi�n es una persona pero tiene
	//otros atributos que lo vuelven espec�ficamente
	//un empleado
	
	private double salario;
	private String puesto;
	private int idEmpleado;
	private String rfc;
	
	public Empleado() {}
	
	
	//Oara generar un constructor con los par�metros heredados 
	//de la clase padre, primero realizamos herencia con la palabra extends
	//Y al generar el constructor elegimos la opci�n de el constructor 
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
				+ ", getNombre()=" + getNombre() + ", getSexo()=" + getSexo() + ", getEdad()=" + getEdad() + "]";
	}
	
	//En la subclase o clase hija, una vez heredando de la clase
	//padre, se obliga a heredar atributos
	//y comportamientos (m�todos) e implementarlos si
	//es necesario o si los m�todos son asbtractos
	
	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Trabajando...");
		
	}

	
	
}
