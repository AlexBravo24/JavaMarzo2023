package com;

public class Principal {

	public static void main(String[] args) {
		// La clase principal debe ser unica, es decir, solo debe haber 
		// una clase con el metodo main, la cual se encargara de ejecutar
		// el proyecto o aplicacion

		//Aqui podemos instanciar a nuestro objeto
		//Instanciar = Crear un objeto
		//Pregunta de entrevista - Diferencia entre clase e instancia
		
		//Instanciar o crear a un objeto Perro
		
		Perro doberman = new Perro ();
		Perro dalmata = new Perro ("Fido", 5, 15.5, "Moteado" );
		
		// Con ayuda del constructor vacio puedo establecer los
		//valores de sus atributos mediante getters y setters
		
		doberman.setNombre("Firulais");
		doberman.setPeso(10.6);
		doberman.setColor("Negro");
		doberman.setEdad(8);
		
		System.out.println(doberman);
		System.out.println(dalmata);
		System.out.println();
		
		
		// Actividad
		// Modelar 5 objetos minimo 3 atributos por objetos maximo 5
		//Crear metodos constructores 
		//Getters y Setters
		//Metodo toString 
		//Los van a instanciar aqui en la clase principal
		//instancian un objeto con todos los parametros
		//Instanciar otro de la misma clase, con uno o dos parametros
		
		Carro toyota = new Carro(); 
		Carro mazda = new Carro ();
		
		mazda.setMarca("Mazda");
		mazda.setAño(2022);
		
		toyota.setAño(2015);
		toyota.setColor("Blanco");
		toyota.setKilometrake(25600.3);
		toyota.setMarca("Toyota");
		
		Tv roku = new Tv();
		Tv LG = new Tv();
		
		LG.setMarca("LG");
		
		roku.setAño(2020);
		roku.setMarca("Roku");
		roku.setPulgadas(25.1);
		
		Telefono celular = new Telefono();
		Telefono celular2 = new Telefono ();
		
		celular2.setMarca("Apple");
		
		celular.setAño(2021);
		celular.setColor("Negro");
		celular.setMarca("LG");
		
		Ropa camisa = new Ropa ();
		Ropa pantalon = new Ropa ();
		
		pantalon.setPrenda("Pantalon");
		
		camisa.setMarca("Cuidado con el perro");
		camisa.setPrecio(198.30);
		camisa.setPrenda("Camisa"); 
		
		Gorra nu = new Gorra ();
		
		nu.setColor("Azul");
		nu.setMarca("Converse");
		nu.setPrecio(350.50);
		
		System.out.println(toyota);
		System.out.println(mazda);
		System.out.println();
		
		System.out.println(roku);
		System.out.println(LG);
		System.out.println();
		
		System.out.println(celular);
		System.out.println(celular2);
		System.out.println();
		
		System.out.println(camisa);
		System.out.println(pantalon);
		System.out.println();
		
		System.out.println(nu);
		
	}

}
