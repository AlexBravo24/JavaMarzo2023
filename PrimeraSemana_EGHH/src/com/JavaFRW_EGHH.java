package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_EGHH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Clases File, FileReader, FileWriter y BufferedReader
		 * Con ellas lo que hacemos es acceder a archivos, poder leerlos, crearlos, modificarlos, etc.
		 */
		
		//Realizando lectura de un archivo.
		//Estructura try and catch
		//El try va a intentar ejecutar lo que tenemos dentro de �l, mientras que el catch lo que haceser�a atrapar una excepci�n o error.
		//A veces en la comunicaci�n con archivos externos puede haber errores en la comunicaci�n que impidan ejecutar el programa.
		
		//String linea;//Declaro una variable en la cual pueda guardar provisionalmente la linea o lineas a leer del archivo.
		
		try {//Intenta lo siguiente
//			File archivo = new File("C:\\Users\\52555\\Desktop\\fichero.txt");
//			/*Con esta clase lo que hacemos es tener una representaci�n
//			 * en memoria del archivo (identificamos)
//			 */
//			FileReader	fr = new FileReader (archivo);
//			//Sebe leer el contenido del archivo
//			BufferedReader buffer = new BufferedReader (fr);
//			//Leer el contenido del archivo para traerlo a java
//			while((linea = buffer.readLine())!=null){
//				/*
//				 * Asignamos el valor de lo que a leyendo el objeto buffer a una linea
//				 * y mientras esta tenga datos o contenido lo mostramos en consola.
//				 */
//				System.out.println("Linea: "+linea);
//			}
			
			/*
			 * Realizar escritura de archivos
			 */
			
			String linea = "\n abcdefg \n"; //Vamos a intentar pasar estos caracteres al archivo de prueba, mediante FileWriter
					//Volvemos a identificar al archivo con la clase Fila
			File archivo = new File("C:\\Users\\52555\\Desktop\\fichero.txt");
			FileWriter line = new FileWriter(archivo, true);
			/*
			 * Pasamos el valor del archivo que vamos a escribir y que exista.
			 * Traemos a un ciclo, como ejemplo, para escribir cada caracter en una linea.
			 */
			for (int i = 0; i<linea.length();i++) {
				line.write(linea.charAt(i)+"\n");
			}
			line.close();

		}catch(Exception ex) { //Si hay alg�n error lo atrapar� en una exception
			System.out.println("No encontre el archivo");
		}
	}

}
