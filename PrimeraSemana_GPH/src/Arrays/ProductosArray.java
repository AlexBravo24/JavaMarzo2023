package Arrays;

public class ProductosArray {

	public static void main(String[] args) {
		
		String utiles []={"Guitarra", "Bateria","Bajo","Acordeon","Bocina"};
		 double precios[]={3654,2376.30,8975.99,27655.70,66787.90};
		 System.out.println("Lista de Productos y sus precios");
		 for (int u=0;u<utiles.length;u++){
		 System.out.println(utiles[u]+ " "+ precios[u]); 
		} 	

	}

}
