package com;

import java.util.Scanner;//importamos libreria Scaner

//Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n.Si el 
//segundo n�mero es 0, debe mostrar un mensaje de error.
//Inicio del programa y declaraci�n de variables:
public class Divicion {
    public static void main(String[] args) {
       
        Scanner teclado= new Scanner(System.in);//nombramos a la variable de scanner "teclado" para pedir datos por consola
        dividir();
    }
    
     public static void dividir(){
     Scanner teclado = new Scanner(System.in);
     float num1,num2,divide;//creamos las variables
     
        System.out.println("Ingrese Primer N�mero:");
        num1= teclado.nextInt();//llamamos a la variable scanner para pedir datos por consola
        System.out.println("Ingrese Segundo N�mero:");
        num2= teclado.nextInt();//llamamos a la variable scanner para pedir datos por consola
        divide= num1/num2;
        
        System.out.println("La Divisi�n es:" +divide);
}
}