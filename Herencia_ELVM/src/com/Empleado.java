package com;

/*la herencia nos permite reutilizar codigo de otra clase 
 * de una clase padre
 * la Herencia se realiza con la palabra reservada "extends"
 * despues del nombre de la clase que va a heredar dichos atributos
 * 
 */
public class Empleado extends Persona{//empleado va a heredar personas con  extends Persona
//un empelado tambien es una persona,pero tiene
	//otros atributos que lo vuelven especificamente
	//un empleado
	
	private double salario;
	private String puesto;
	private int IdEmpleado;
	private String rfc;
	
	
	public Empleado() {}
	
	//para generar un construcutor con los parametros heredados de la clase padre, primero creamos un herencia con la palabra extens
	//y al generar el constcutror elegimos la opccion de el constcutor de la clase padre, como de la clase hija que es empleado
	

//para hacer la estructura llena  los parametros,btenemos que dar click derecho,resource,la de estuctura llena y de ahi aparecera arriba el superconductor vemos cual ponemos y listo
	public Empleado(String nombre, String sexo, int edad, double salario, String puesto, int idEmpleado, String rfc) {
		super(nombre, sexo, edad);
		this.salario = salario;
		this.puesto = puesto;
		IdEmpleado = idEmpleado;
		this.rfc = rfc;
	}
//aqui solo genera los get y sett de los que estan aquui, los que fueron eredados ya no necesita ahi por que ellos ya trae sus propios gets y sets
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
		return IdEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		IdEmpleado = idEmpleado;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	@Override
	public String toString() {
		return "Empleado [salario=" + salario + ", puesto=" + puesto + ", IdEmpleado=" + IdEmpleado + ", rfc=" + rfc
				+ ", toString()=" + super.toString() + "]";
	}
	//en la subclase o clase hija, una vez heredando de una clase 
	//padre, se obliga a heredar atributos
	//y comportamientos (metodos) e implementarlos, si
	//es necesario o si los metodos son abstractos
	
	@Override
	public void trabajador() {
		System.out.println("trabajando...");
		
	}

	
	
	
	
	
	
}
