package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_PRSC {

	public static void main(String[] args) {

		//Clases Fila, FileReader, FileWritter y BufferedReader
		
		//Con ellos lo que hacemos es acceder a archivos
		//Poder leerlos, crearlos, modificarlos, etc.
		
		
		//Realizando lectura de un archivo
		
		//Estructura try and catch
		//El try va a intentar ejecutar lo que tenemos dentro de �l
		//Mientras que el catch lo que hace es atrapar una excepci�n o error
		//A veces en la comunicaci�n con archivos externos puede haber
		//errores en la comunicaci�n que impidan ejecutar el programa
		
//		String linea; //Declaro una variable en la cual
		//pueda guardar provisionalmente la l�nea o l�neas a leer
		//del archivo
		
		try { //Intenta lo siguiente
//			File archivo = new File("C:\\Users\\aguil\\Desktop\\fichero.txt");
//			//Con esta clase lo que hacemos es tener una representaci�n
//			//en memoria del archivo (Identificamos)
//			FileReader fr = new FileReader(archivo); //La clase FileREader
//			//Sabe leer el contenido del archivo
//			BufferedReader buffer = new BufferedReader(fr);
//			//Leer el contenido del archivo para traerlo de este lado a Java
//			while ((linea = buffer.readLine())!=null) { //asignamos el valor 
//				//de lo que va leyendo el objeto buffer a una linea
//				//y mientras esta tenga datos o contenido lo mostraremos
//				//en consola
//				System.out.println("Linea: " +linea);
//			}
			
			//Realizar escritura de archivos
			String linea="\nabcdefg \n"; //Vamos a intentar pasar estos caracteres
			//al archivo de prueba mediante FileWritter
			//Volvemos a identificar el archivo con la clase file
			File archivo = new File("C:\\Users\\aguil\\Desktop\\fichero.txt");
			FileWriter line = new FileWriter(archivo, true); //Pasamos el valor
			//del archivo que vamos a escribir y que exista
			//Traemos un ciclo como ejemplo para escribir cada caracter
			//en una linea
			
			for (int i=0; i<linea.length(); i++) {
				line.write(linea.charAt(i)+"\n"); //Escribimos cada caracter
				//recorrido en el string de una nueva linea
			
			}
			
			line.close();
			
		}catch(Exception ex) { //si hay alg�n error, lo atrapar� en una excepci�n
			System.out.println("No encontr� el archivo");
		}

	} 

}
