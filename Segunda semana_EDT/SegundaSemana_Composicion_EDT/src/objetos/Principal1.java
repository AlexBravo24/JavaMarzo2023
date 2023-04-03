package objetos;

public class Principal1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruta my_fruta = new Fruta("Fresa", "Roja", 50);
		Azucar my_azucar = new Azucar("Morena", "Café");
		Tipo_agua agua = new Tipo_agua("Desionizada", 30);
		
		Tortilla my_tortilla = new Tortilla("De nopal", "Verde", 30);
		Salsa my_salsa = new Salsa("Tomate", "Verde", false);
		Huevo my_huevo = new Huevo("Revuelto", 45);
		
		
		
		Agua_fresca my_agua = new Agua_fresca("Mediano",my_fruta, my_azucar, agua);
		Chilaquiles my_chilaquiles = new Chilaquiles("Grande",my_tortilla, my_salsa, my_huevo);
		
		System.out.println(my_agua.toString());
		System.out.println(my_chilaquiles.toString());
		
	}

}
