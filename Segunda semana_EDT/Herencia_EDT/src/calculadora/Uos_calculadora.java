package calculadora;
import java.util.Scanner;


public class Uos_calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner my_scanner = new Scanner(System.in);
		Calculadora_cientifica my_calculadora = new Calculadora_cientifica("Negra", 200, "Casio");
		
		
		System.out.println("¿Qué operación quieres realizar? \n 1.-SUMA \n 2.-RESTA \n 3.-MULTIPLICAR \n 4.-DIVIDIR");
		int comando = my_scanner.nextInt();
		
		System.out.println("Introduce el primer número");
		int num1 = my_scanner.nextInt();
		System.out.println("Introduce el segundo número");
		int num2 = my_scanner.nextInt();
		
		
		if (comando ==1) {
			my_calculadora.sumar(num1, num2);
		} else if (comando ==2) {
			my_calculadora.restar(num1, num2);
		}  else if (comando == 3) {
			my_calculadora.multiplicar(num1, num2);
		}  else if (comando == 4) {
			my_calculadora.dividir(num1, num2);
		} else {System.out.println("Comando no encontrado");}
		
	}
}

