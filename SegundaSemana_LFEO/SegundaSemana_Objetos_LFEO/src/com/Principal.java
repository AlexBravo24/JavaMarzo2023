package com;

public class Principal {

	public static void main(String[] args) {
		// La clase principal debe ser unica, es decir solo exite una clase con el metodo main, 
		//La cual se encargara de ejecutar el proyecto o aplicacion
		
		
		//Aqui podemos instanciar a nuestro objeto
		//Instanciar = Crear un objeto
		//Preguntan en entrevista-- diferencia entre clase y objeto R:"El objeto esta creado a partir de la clase"
		
		//Instanciar o crear a un objeto Perro
		
		Perro doberman = new Perro();
		
		Perro dalmata = new Perro("Fido",5,15.5,"Moteado");
		
		//Con ayuda del constructor vacio  puedo establecer los 
		//valores de sus atributos mediante los getters y setters
		
		doberman.setNombre("Firulais");
		doberman.setEdad(2);
		doberman.setPeso(10.6);
		doberman.setColor("Cafe");
		
		System.out.println("OBJETO PERRO:");
		System.out.println(doberman);
		System.out.println(dalmata);
		System.out.println();
		
		//Actividad
		//MOdelar 5 objetos - MInimo 3 atributo por objeto maximo 5
		//crear metodos constructores
		// crear metodos Getters y Setters
		// crear Metodo toString
		//Los van a instanciar en la clase principal
		//instancia un objeto con tos los parametros
		//Instanciar otro de la misma clase, con uno o dos parametros
		
		//OBJETO 1 PERSONA
		Persona persona1 = new Persona("Aranza",'M',6); //Todos sus parametros o atributos
		Persona persona2 = new Persona();
		
		persona2.setNombre("David"); //2 parametros o atributos
		persona2.setSexo('H');
		
		System.out.println("OBJETO 1 PERSONA");//Impresion de parametros o atributos
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println();
		
		
		//OBJETO 2 COCHE
		Coche  coche1 = new Coche("ROJO","NISSAN",5000.70); //Todos los parametros
		Coche coche2 = new Coche();
		
		coche2.setColor("AMARILLO"); //2 parametros
		coche2.setPrecio(70000.67);
		
		System.out.println("OBJETO 2 COCHE");
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println();
		
		//OBJETO 3 PC
		Pc pc1 = new Pc("DELL","i5","Windows"); //todo los parametros
		Pc pc2 = new Pc();
		
		pc2.setMarca("LENOVO");
		pc2.setProcesador("i7"); //2parametros
		
		System.out.println("OBJETO 3 PC");
		System.out.println(pc1);
		System.out.println(pc2);
		System.out.println();
		
		
		//OBJETO 4 ESTUDIANTE
		Estudiante estudiante1 = new Estudiante("VESPERTINO","PRIMERO",'A'); //TODO LOS PARAMETROS
		Estudiante estudiante2 = new Estudiante();
		
		estudiante2.setTurno("MATUTINO");
		estudiante2.setGrado("TERCERO"); //2 PARAMETROS
		
		System.out.println("OBJETO 4 ESTUDIANTE");
		System.out.println(estudiante1);
		System.out.println(estudiante2);
		System.out.println();
		
		//OBJETO 5 BANCO
		Banco banco1 = new Banco("AZTECA",21.6,19.8); //TODO LO ATRIBUTOS PARAMETROS
		Banco banco2 = new Banco();
		
		banco2.setNombre("SANTANDER");
		banco2.setPrecioVentaDolar(20.5); //2 parametros
		
		System.out.println("OBJETO 5 BANCO");
		System.out.println(banco1);
		System.out.println(banco2);
		
				

	}

}
