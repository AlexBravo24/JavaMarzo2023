package com;

public class Vendedor extends Empleado{
	
	//Dos opciones para crear los constructores
	//Añado un atributo a vendedor y generos los comstructores
	//Incluyendo los de la super clase
	
	private double comision; //atributo
//	
	public Vendedor() { //construstor vacio
//		
	}
	//constructor 
	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idempleado, String rfc,
			double comision) {
		super(nombre, sexo, edad, salario, puesto, idempleado, rfc);
		this.comision = comision;
	}
	public double getComision() {
		return comision;
	}
	public void setComision(double comision) {
		this.comision = comision;
	}
	@Override
	public String toString() {
		return "Vendedor [comision=" + comision + ", toString()=" + super.toString() + "]";
	}
	
	//Método propio 
	
	public void vender() {
		
		System.out.println("Finalizando ventas...");
	}
	
	
	
	
	
	
	//Sino agrego atributos a esta clase, entonces genero el constructor desde la superclase
	//Segunda manera, sin atributos, solo hace referencia a clase padre e hija
//	public Vendedor() {
//		
//	}
//
//	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idempleado, String rfc) {
//		super(nombre, sexo, edad, salario, puesto, idempleado, rfc);
//		// TODO Auto-generated constructor stub
//	}
	
	
}
