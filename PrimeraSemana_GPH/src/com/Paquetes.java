package com;

/**Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica 
Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
ZONA UBICACI�N COSTO/KILOGRAMO
1 Am�rica del Norte 24,00 euros
2 Am�rica Central 20, 00 euros
3 Am�rica del Sur 21,00 euros
4 Europa 10,00 euros
5 Asia 18,00 euros
Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por 
cuestiones de log�stica y seguridad.
Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
de la entrega
Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. El costo
por el servicio de transporte se basa en el peso del paquete y la zona a la que
va dirigido. Lo anterior se muestra en la tabla:

    ZONA    UBICACI�N            COSTO/KILOGRAMO
    1        Am�rica del Norte      24.00 euros
    2        Am�rica Central        20.00 euros
    3        Am�rica del Sur        21.00 euros
    4        Europa                10.00 euros
    5        Asia                  18.00 euros

Parte de su pol�tica implica que los paquetes con un peso superior a 5 kg no son
transportados, esto por cuestiones de log�stica y de seguridad. 
Realice un algoritmo para determinar el cobro por la entrega de un paquete o, en
su caso, el rechazo de la entrega.


*/

import java.util.Scanner;//importamos libreria Scaner
// Inicio del programa y declaraci�n de variables:
public class Paquetes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//nombramos a la variable scanner para pedir datos por consola
  //creamos las variables
    int peso;
    int zona;

// Solicitud de datos al usuario creando un menu
    System.out.println("Calcula la tarifa para el env�o seg�n peso y zona de destino.");
    System.out.println("Zonas de env�o:");
    System.out.println("1.- Am�rica del Norte");
    System.out.println("2.- Am�rica Central");
    System.out.println("3.- Am�rica del Sur");
    System.out.println("4.- Europa");
    System.out.println("5.- Asia");
    zona = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
    System.out.println("Introduce el peso del paquete en gramos: ");
    peso = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola

// Realizamos comparaciones y mostramos el resultado
    if (peso > 5){
      System.out.println("El paquete no puede ser admitido por motivos de seguridad.");
    } else if (peso < 1) {
      System.out.println("El peso del paquete debe ser un entero positivo.");
    } else {
      switch (zona) {// se inicia el switch para poder usar el menu en forma de casos, siendo mas practico que else if
      case 1:
        System.out.println("El paquete de " + peso + " kilogramos enviado a Am�rica del Norte sale por " +(peso*24) + " euros.");
        break;//cuando se inicia un caso se tiene que romper
      case 2:
        System.out.println("El paquete de " + peso + " kilogramos enviado a Am�rica Central sale por " +(peso*20) + " euros.");
        break;
      case 3:
        System.out.println("El paquete de " + peso + " kilogramos enviado a Am�rica del Sur sale por " +(peso*21) + " euros.");
        break;
      case 4:
        System.out.println("El paquete de " + peso + " kilogramos enviado a Europa sale por " +(peso*10) + " euros.");
        break;
      case 5:
        System.out.println("El paquete de " + peso + " kilogramos enviado a Asia sale por " +(peso*18) + " euros.");
        break;
      default:
        System.out.println("ERROR: zona elegida incorrecta.");
        break;
      }
    }
  }
}