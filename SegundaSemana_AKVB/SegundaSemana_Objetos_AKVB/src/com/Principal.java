package com;

public class Principal {

	public static void main(String[] args) {
		/*
		 * La clase principal debe ser �nica, es decir, s�lo
		 * existe una clase con el m�todo main(), la cu�l, 
		 * se encargar� de ejecutar el proyecto o aplicaci�n.
		 * 
		 * Aqu� podemos instanciar a nuestra clase.
		 * Instanciar = Crear un objeto.
		 * 
		 * Pregunta entrevista - DIFERENCIA ENTRE CLASE Y OBJETO.
		 * 
		 * El objeto est� creado a partir de la clase.
		 * 
		 */
		
		Perro doberman = new Perro();
		
		Perro dalmata = new Perro("Fido", 5, 15.5, "Moteado");
		
		/*
		 * Con ayuda del constructor vacio puedo esetablecer los
		 * valores de sus atributos mediante los getters y setters.
		 */
		doberman.setName("Firulais");
		doberman.setAge(2);
		doberman.setWeight(10.65);
		doberman.setColor("Caf�");
		
		System.out.println(doberman);
		System.out.println(dalmata);
		
		/*
		 * ACTIVIDAD
		 * 
		 * Modelar 5 objetos - M�nimo 3 atributos por objeto, m�ximo 5.
		 * Cada objeto con m�todos constructores.
		 * Getters y Setters.
		 * M�todo toString()
		 * Instanciar en la clase principal (this.class)
		 * Instanciar un objeto con todos los parametros
		 * Instanciar otro de la misma clase con uno o dos parametros
		 */

		Fruta naranja = new Fruta("Naranja", 12, 2.25, "Madura");
		Fruta manzana = new Fruta();
		
		manzana.setName("Manzana");
		manzana.setWeight(125.68);
		manzana.setEstado("Pasada");
		
		System.out.println(naranja);
		System.out.println(manzana);
		
		//SEGUNDO OBJETO
		
		Animal ballena = new Animal("Ballena", "Antonieta", 54, 67348.12, "Marino", "Azul y blanco" );
		Animal gato = new Animal();
		gato.setNombre("G�ero");
		gato.setColor("Atigrado Naranja");
		gato.setPeso(5.98);
		
		System.out.println(ballena);
		System.out.println(gato);
		
		//TERCER OBJETO
		
		Juguete carrito = new Juguete("Carrito", "Hot Wheels Volkswagen Beetle", "Mattel", "En Empaque");
		Juguete mu�eca = new Juguete(){};
		mu�eca.setTipo("Mu�eca de trapo");
		mu�eca.setEstado("Gastada");
		
		System.out.println(carrito);
		System.out.println(mu�eca);
		
		//CUARTO OBJETO
		
	}

}
