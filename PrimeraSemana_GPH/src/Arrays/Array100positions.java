package Arrays;

//Crea un array de números de 100 posiciones, que contendrá los números del 
//1 al 100. Obtén la suma de todos ellos y la media.

public class Array100positions {

	public static void main(String[] args) {
		   
		        int media, suma = 0;
		        int[] memoria = new int[100];//memoria sera de 100 posiciones
		        for (int i = 0; i < memoria.length; i++) { //recorera el contenido de la memoria en 1
		        	memoria[i] = i+1; //contara cada segmento
		            System.out.println(memoria[i]); //imprime el recorrido de la memoria
		            suma += i+1;
		        }
		        media = suma / memoria.length;
		        System.out.println("La suma da"+suma);
		        System.out.println("La media da"+media);
		    }

	}


