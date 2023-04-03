package ciclos;
import java.util.Scanner;
/*Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
ancho y el alto. Ejemplo: 8 x 8*/
public class Cuadro8 {
public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese valor de las dimenciones: ");
		int valor = teclado.nextInt();
		teclado.close();
		
		for (int fila = 1; fila <= valor; fila++) {//se inicia el recorrido de la fila
			for (int columna = 1; columna <= valor; columna++)//se inicia el recorrido de la columna
				System.out.print("*");
			
			System.out.println();//Salto de línea para pasar a la siguiente FILA
		}

	}

}