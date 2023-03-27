package com;

public class EjercicioArray5 {

	public static void main(String[] args) {
	      String [] producto = {"chile","tomate","cebolla","leche","huevo","sopa"};
	      double [] precio = {11.55,13,21.5,34,3.5,14.70};
	      System.out.println("EL PRECIO DE LOS PRODUCTOS ES:");
	      for(int i=0;i<precio.length;i++) {
	    	  System.out.println(producto[i]+" --  "+"$" +precio[i]);
	      }

	}

}
