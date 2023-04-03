package com;

public class Principal {

	public static void main(String[] args) {
		//Clase principal debe ser unica , es decir, solo existe una clase con el metodo main
		//la cual se encargara de la ejecucutar el proyecto o aplicación
		
		//aqui podemos instanciar a nuestro objeto 
		//Instanciar =Crear un objeto
		//Pregunta de entrvista = Diferencia entre clase 
		
		//Instanciar o crear a un objeto Perro e instancia
		
		Perro doberman = new Perro();
		Perro dalmata = new Perro("Fido", 5,15.5,"Moteado");
		
		
		
		//Con ayuda del constructor vacio puedo establecer los valores de sus 
		//atributos mediante los getters y setters
		
		doberman.setNombre("Firulas");
		doberman.setEdad(2);
		doberman.setPeso(10.6);
		doberman.setColor("cafe");
		
		System.out.println(doberman);
		System.out.println(dalmata);
		
		//Actividad
		//Modelar 5 Objetos - minimo 3 atributos por objeto maximo 5
		//Crear metodos construstores 
		//Getter y Setters
		//Metodo to String
		//Instancian un objeto con todos los parametros 
		//Instanciar otro de la misma clase, con uno o dos parametros
		
		
		//Ejemplo 1
		
		ZapatoE1 bota = new ZapatoE1();
		bota.setMarca("gucci");
		bota.setPrecio(1000.00);
		
		System.out.println(bota);
		
		//Ejemplo2
		AutoE2 convertible = new AutoE2("kia", "rey", 120000.2, 000000," 2 puertas");
		System.out.println(convertible);
		
		
		//Ejemplo3
		CasaE3 morelos = new CasaE3();
		morelos.setColor("negra");
		morelos.setTamaño("grande");
		morelos.setNumhabitacion(5);
		morelos.setNumniveles(2);
		morelos.setPrecio(1588458.025);
		
		System.out.println(morelos);
		
		//Ejemplo4
		ComputadoraE4 escritorio = new ComputadoraE4("HP","morada",9.25,12,64);
		System.out.println(escritorio);
		
		//Ejemplo5
		CelularE5 nuevo= new CelularE5("Nova9","Huawei",12,8500,"12x15");
		System.out.println(nuevo);
		
		
		

	}

}
