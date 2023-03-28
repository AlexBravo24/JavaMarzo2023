package ciclos;
import java.util.Scanner;
/*Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
23 x 95 = ???
*/
public class MultiplicaTablas {
	public static void main(String[] args) {
	int sum=0;
	Scanner scn = new Scanner(System.in);
	
	System.out.print("ingrese el primer numero: "); 
	int x = scn.nextInt();

	System.out.println("ingrese el numero por el que se multiplicara");
	int y = scn.nextInt();
	sum = x*y;
	System.out.println("La multiplicacion de los 2 numeros es " + sum);

	}

}

