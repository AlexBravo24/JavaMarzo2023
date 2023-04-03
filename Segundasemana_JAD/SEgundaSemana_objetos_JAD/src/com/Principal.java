package com;

public class Principal {

	public static void main(String[] args) {
		// la clase principal debe ser unica es decir solo existe una clase con el 
		//metodo main, la cual se encargara de ejecutar el proyecto o aplicacion
		
		// aqui podemos instanciar a nuestro objeto
		//instanciar=crear un objeto
		//pregunta de entrrevista - diferencia entre clase e instancia 
		
		//instancia o crear un objeto perro
		Auto camioneta = new Auto();
		Perro doberman =new Perro();
		Pizza peperoni= new Pizza("peperoni","familiar",108.5f);
		Calzado tenis=new Calzado("blanco",26.5f,1250f);
		Ropa camisa = new Ropa();
		
		// con ayuda del constructor vacio puedo establecer los valores de 
		// sus atributos mediante los Getters y Setters
		doberman.setNombre("firulais");
		doberman.setEdad(12);
		doberman.setPeso(25);
		doberman.setColor("negro");
		
		camioneta.setMarca("ford");
		camioneta.setCilindros(6);
		
		camisa.setColor("azul");
		camisa.setMarca("levis");
		
		
		System.out.println(doberman);
		System.out.println(camioneta);
		System.out.println(peperoni);
		System.out.println(tenis);
		System.out.println(camisa);
		
	}
	
	

}
