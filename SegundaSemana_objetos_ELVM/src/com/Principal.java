package com;

public class Principal {

	public static void main(String[] args) {
		// LA CLAE PRINICIPAL. debe ser unica
		//solo existe una clase con el metodo main
		//la cual se encargara de ejecutar el proyecto
		//o aplicacion 
		
		//aqui podemos instanciar a nuestro objeto
		//instanciar=crear un objeto
		//pregunta de entrtevista-
		/*¿diferencia entre clase y "objeto e instancia"
		 * clase es la pantilla
		 * es creado apartir de la clase
		 * 
		 */
		//instanciar o crear a un objeto Perro
		Perro doberman =new Perro();//es por que tengo el constructor vacio
		Perro dalmata=new Perro("fido",5,15.5,"Moteado");
		//con la ayuda del constructor vacio puedo establecer los getters y setters
		//hay dos formas de extablecerlosPerro doberman =new Perro(aqui se establece)
		doberman.setNombre("firulais");
		doberman.setEdad(2);
		doberman.setPeso(10.6);
		doberman.setColor("cafe");
		
		System.out.println(doberman);
		System.out.println(dalmata);
		//lo anterior lo muestra asi Perro [nombre=firulais, edad=0, peso=0.0, color=null]
		
		
		 //vamos arealizar esta actividad
		//modelar 5 objetos-minimo tres atributos por objetos maximo 5
		//crear metodos constuctores
		//getters y setters
		//metodo toString
		//llas van a instanciar aqui en clase principal
		//((instancian un objet con todos los parametros))
		//instanciar otro de la misma clase, con uno o dos parametros
		
		Compu1 compugaming=new Compu1();
		Compu1 compuworkspace=new Compu1("NVIDIA Quadro 600",8,"sTRX4","i3");
		compugaming.setTarjetaGrafica("NVIDIA 1080 ti" );
		compugaming.setMemoriaRam(16);
		compugaming.setTarjetaMadre("AM4");
		compugaming.setProcesador("i5");
		
		System.out.println(compugaming);
		System.out.println(compuworkspace);
		
		
		Robotmovil Minisumo=new Robotmovil();
		Robotmovil RobotSeguidor=new Robotmovil("arduino","infrarojo",2,"4 doble A","pvc","servonotores");
		Minisumo.setTarjetaProgramable("arduino");
		Minisumo.setSensor("aproximidad");
		Minisumo.setNllantas(4);
		Minisumo.setPila("litio");
		Minisumo.setMaterialChasis("impresion 3D");
		Minisumo.setTipoMotores("servomotores");
		
		System.out.println(Minisumo);
		System.out.println(RobotSeguidor);
		
		Torta TortaSencilla=new Torta();
		Torta Tortaligh=new Torta("pavo americano","sin adereso","pan de ajo","queso panela");
		TortaSencilla.setJamon("jamon de pavo");
		TortaSencilla.setAdereso("mayonesa");
		TortaSencilla.setTPan("pan de basico");
		TortaSencilla.setTQueso("queso amarillo");
		
		System.out.println(TortaSencilla);
		System.out.println(Tortaligh);
		
		Sushi SushiPlatano=new Sushi();
		Sushi SushiClasico=new Sushi("surimi","queso crema",6,"arroz sin envolvente");
		SushiPlatano.setTDpez("camaron");
		SushiPlatano.setTqueso("queso crema");
		SushiPlatano.setNrollos(9);
		SushiPlatano.setEnvolvente("platano con arroz");
		
		System.out.println(SushiPlatano);
		System.out.println(SushiClasico);
		
		Pizza PizzaPeperoni=new Pizza();
		Pizza PizzaHawaina=new Pizza(120,180,"base de salsa de seta","queso vegano");
		PizzaPeperoni.setCArina(300);
		PizzaPeperoni.setCsalsaT(180);
		PizzaPeperoni.setTBase("base de salsa de tomate");
		PizzaPeperoni.setTQueso("queso mosarela");
		
		System.out.println(PizzaPeperoni);
		System.out.println(PizzaHawaina);
		
		
		

	}

}
