package com;

public class Vendedor extends Empleado{
	//dos opciones para crear los constructores
	//añado un atributo a vededore y genero los constructores
	//incluyendon los de la super clase
	private double comision;
	public Vendedor() {}
	
	

	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc,
			double comision) {
		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
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
	
	//sino le agrego atributo a esta clase, entonces genero
	//entonces genero los constructoresa desde la supler clase
//	
//	public Vendedor() {}
//	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc) {
//		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
//		// TODO Auto-generated constructor stub
//	}
//	
	//metodo propio
	public void vender() {
		System.out.println("finalizado ventas....");
	}
	
	//crear otro proyecto ""llamado calculadora_iniciales""
	//crear una clase prinicipal con su metodo main
	//crear una clase llamada calculadora
	//le añaden un par de atributos
	//van a declarar 4 metodos abstractor(suma,restas,multiplicacion y division)
	//crear otra clase llamada cientifica y esta sera la encargada de implementar los metodos
	//una vez hecho esto, instancian un objeto d cientifica en la clase
	//prinicipal y llaman al metodo que le guste(suma,restas,etc)
	
	
}
