package ciclos;

import java.util.Scanner;

public class MenorMayor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, menor, mayor;
       
        //Lectura de dos n�meros enteros distintos
        do {
            System.out.print("Introduce un n�mero entero: ");
            numero1 = sc.nextInt();
            System.out.print("Introduce otro n�mero entero distinto del anterior: ");                   
            numero2 = sc.nextInt();
            if(numero1 == numero2){
                System.out.println("Debes introducir dos n�meros distintos");
            }
        } while (numero1 == numero2);
       
        //Calcular cu�l de los n�meros es el mayor y cu�l el menor
        if (numero1 > numero2) {
            mayor = numero1;
            menor = numero2;
        } else {
            mayor = numero2;
            menor = numero1;
        }
       
        //Mostrar por pantalla los n�meros desde el menor hasta el mayor.
        System.out.println("\nN�meros desde " + menor + " hasta " + mayor + " : ");
        for (int i = menor; i <= mayor; i++) {
            System.out.println(i);
        }
    }
}