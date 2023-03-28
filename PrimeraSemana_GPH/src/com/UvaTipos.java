package com;

/**La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
entrega en un embarque considerando lo siguiente:
* Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
es de tamaño 2.
* Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
tamaño 2.
Precio inicial se recibe desde teclado
 la cual se clasifica en tipos A y B, y además en tamaños 1 y 2. 
 Cuando se realiza la venta del producto, ésta es de un solo tipo y tamaño, se requiere determinar 
 cuánto recibirá un productor por la uva que entrega en un embarque, considerando
lo siguiente:

si es de tipo A, 
se le cargan 20 céntimos al precio inicial cuando es de tamaño 1; y 30 céntimos si es de tamaño 2.
Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de tamaño 2.
Realice un algoritmo para determinar la ganancia obtenida.
*/

import java.util.Scanner;//importamos libreria Scaner
// Inicio del programa y declaración de variables:
public class UvaTipos {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//nombramos a la variable scanner como "sueldo" para pedir datos por consola
  //creamos las variables
    int kilos;
    double precioInicial;
    String tipo;
    int tamano;

// Solicitud de datos al usuario
    System.out.println("Este programa calcula la ganancia según el tipo de vino, tamaño y cantidad vendida:");
    System.out.print("Introduce los Kg. de uva entregada: ");
    kilos = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
    System.out.print("Precio por Kg. inicial: ");
    precioInicial = scanner.nextDouble();//llamamos a la variable scanner para pedir datos por consola
    System.out.print("Uva de valor \"A\" ó \"B\": ");
    tipo = scanner.next(); scanner.nextLine();//llamamos a la variable scanner para pedir datos por consola
    System.out.print("Tipo de uva \"1\" ó \"2\": ");
    tamano = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola

// Realizamos Cálculos y mostramos en pantalla
    if (!((tipo.toUpperCase().equals("A") || tipo.toUpperCase().equals("B")) &&
        (tamano == 1 || tamano == 2))) {
      System.out.println("Tipo o tamaño incorrecto, vuelva a introducir los valores.");
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