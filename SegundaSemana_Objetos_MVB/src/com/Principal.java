package com;

public class Principal {
	
	 public static void main(String[] args) {
		
		
	
	//La clase principal debe ser única, es decir 
	//solo existe una clase en con el método main
	//La cual se encargará de ejecutar el proyecto
	//o aplicación
	
//Aquí podemos instanciar a nuestro objeto 
//Instanciar = Crear un objeto 
//Pregunta de entrevista -Diferencia entra clase e instancia? 
 //Instancia u Objeto es creado a partir de una clase y la 
 //Clase es una plantilla
	 
 //Instanciar o crear a un objeto Perro
	 
	 Perro doberman = new Perro();
	 
	 Perro dalmata = new Perro ("Fido",5,15.0,"Moteado");
	 
	 
	 
 //Con ayuda del constructor vacío puedo establecer los valores 
//de sus atributos mediante los getter y setters
	 
	 doberman.setNombre("Firulais");
	 doberman.setEdad(2);
	 doberman.setPeso(10.6);
	 doberman.setColor("Café");
	 
	 System.out.println(doberman);
	 System.out.println(dalmata);
	 
	 
	//Actividad 
	//Modelar 5 objetos-  mínimo 3 atributos por objetos max 5
	//Crear métodos constructores
	//Getters y setters
	//Método toString 
	//Se van a instanciar aquí en la clase "principal"
	//Instanciar un objeto con todos los parámetros
	//Instanciar otro de la misma clase, con uno o dos parámetros
	 
	//Objeto1
	 
	 Vestidos halter = new Vestidos("Rojo",4,225.50,"Poliester","M");
	 Vestidos fiesta = new Vestidos ();
	 
	 fiesta.setColor("Lavanda");
	 fiesta.setPrecio(899.99); 
	 System.out.println(halter);
	 System.out.println(fiesta);

	 //Objeto2
	 
	 Refresco cola = new Refresco ("CocaCola",12.00,"Vidrio",10);
	 Refresco fanta = new Refresco ();
	 
	 fanta.setEnvase("Lata");
	 fanta.setPrecio(10.00);
	 System.out.println(cola);
	 System.out.println(fanta);
	 
	 //Objeto3
	 
	 Auto rio = new Auto ();
	 Auto accord = new Auto ("Honda","Rojo",500.000,2,"Manual");
	 
	 rio.setMarca("KIA");
	 rio.setPuertas(5);
	 rio.setTransmision("Automática");
	 System.out.println(rio);
	 System.out.println(accord);
	 
	 //Objeto4
	 
	 Television papillon = new Television();
	 Television viision = new Television(68,"Samsung","OLED",60);
	 
	 papillon.setMarca("Lenovo");
	 papillon.setPulgadas(52);
	System.out.println(papillon);
	System.out.println(viision);
	
	 //Objeto5
	 
	 Mochila escolar = new Mochila ();
	 Mochila festival = new Mochila ("Tranasparente","Plástico",3,"Pequeña");
	 
	 			
	 escolar.setColor("Negra");
	 escolar.setMaterial("Lona");
System.out.println(escolar);	 
System.out.println(festival);


}

}
