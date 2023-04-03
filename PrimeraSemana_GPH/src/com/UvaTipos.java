package com;

/**La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
entrega en un embarque considerando lo siguiente:
* Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
es de tama�o 2.
* Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
tama�o 2.
Precio inicial se recibe desde teclado
 la cual se clasifica en tipos A y B, y adem�s en tama�os 1 y 2. 
 Cuando se realiza la venta del producto, �sta es de un solo tipo y tama�o, se requiere determinar 
 cu�nto recibir� un productor por la uva que entrega en un embarque, considerando
lo siguiente:

si es de tipo A, 
se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1; y 30 c�ntimos si es de tama�o 2.
Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de tama�o 2.
Realice un algoritmo para determinar la ganancia obtenida.
*/

import java.util.Scanner;//importamos libreria Scaner
// Inicio del programa y declaraci�n de variables:
public class UvaTipos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//nombramos a la variable scanner como "sueldo" para pedir datos por consola
  //creamos las variables
    int kilos;
    double precioInicial;
    String tipo;
    int tamano;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la ganancia seg�n el tipo de vino, tama�o y cantidad vendida:");
    System.out.print("Introduce los Kg. de uva entregada: ");
    kilos = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
    System.out.print("Precio por Kg. inicial: ");
    precioInicial = scanner.nextDouble();//llamamos a la variable scanner para pedir datos por consola
    System.out.print("Uva de valor \"A\" � \"B\": ");
    tipo = scanner.next(); scanner.nextLine();//llamamos a la variable scanner para pedir datos por consola
    System.out.print("Tipo de uva \"1\" � \"2\": ");
    tamano = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola

// Realizamos C�lculos y mostramos en pantalla
    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
        (tamano == 1 || tamano == 2))) {
      System.out.println("Tipo o tama�o incorrecto, vuelva a introducir los valores.");
    } else {
      if (tipo.toUpperCase().equals("A") && tamano == 1) {
        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)+(kilos*0.20)));
      } else if (tipo.toUpperCase().equals("A") && tamano == 2) {
        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)+(kilos*0.30)));
      } else if (tipo.toUpperCase().equals("B") && tamano == 1) {
        System.out.println("La ganancia final es de: " + ((kilos * precioInicial)-(kilos*0.30)));
      } else if (tipo.toUpperCase().equals("B") && tamano == 2) {
        System.out.println("La ganancia final es de: " + ((kilos*precioInicial)-(kilos*0.50)));
      }
    }
  }
}