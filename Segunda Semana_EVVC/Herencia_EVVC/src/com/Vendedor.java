package com;

public class Vendedor extends Empleado {
	
	//Si no le agrego atributos a esta clase, entonces genero los constructores desde la super clase
	//en source generate constructors from superclase
	
//	public Vendedor() {}
//
//	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc) {
//		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
//		// TODO Auto-generated constructor stub
//	}
//	
	
	/*Dos opciones para crear los constructores:
	 * A�ado un atributo a vendedor y genero los constructores incluyendo los de la superclase
	 */

private double comisi�n;

	public Vendedor() {}
	public Vendedor(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc,
			double comisi�n) {
		super(nombre, sexo, edad, salario, puesto, idEmpleado, rfc);
		this.comisi�n = comisi�n;
	}

	public double getComisi�n() {
		return comisi�n;
	}

 public void setComisi�n(double comisi�n) {
		this.comisi�n = comisi�n;
	}
@Override
public String toString() {
	return "Vendedor [comisi�n=" + comisi�n + ", toString()=" + super.toString() + "]";
}
	
// M�todo propio

	public void vender () {
		System.out.println("Finalizando ventas...");
	}
	
	

}
