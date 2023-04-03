package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_LFEO {

	public static void main(String[] args) {
		
		
		//Clases File, FileReader, FileWriter y BufferedReader
		
		//Con ella lo que hacemos es acceder a archivos leerlos, crearlos, modificarlo, etc.
		
		//Realizando lectura de un archivo
		
		//Estructura try and catch
		//El try va aintentar ejecutar lo que tenemos dentro de el
		//Mientras que el catch lo que hace seria atrapar una excepcion o error
		//A vece en la comunicacion con archivos externos pueden haber errores en la 
		//comunicacion que impiddan ejecutar el programa
		
		
		//String linea; //declaro una variable la cual pueda guardar provisionalmente lineas a leer del archivo
		
		try { //intenta lo siguiente
			
//			File archivo = new File("C:\\Users\\Admin\\Desktop\\fichero.txt");
//			//Con esta clase lo que hacemos es tener una representacion en memoria del archivo (lo identificamos)
//			
//			FileReader fr = new FileReader(archivo); //La calse FileReader sabe leer el contenido del archivo
//			
//			BufferedReader buffer = new BufferedReader(fr); //Leer el contenido del archivo para traerlo de este lado a java
//			
//			while((linea = buffer.readLine()) != null) {//asiganamos el valor de lo que va leyendo el objeto bufffer a una linea
//				                                         //y mientras esta tenga datos o contenido lo mostraremos en consola
//				System.out.println("Linea: " +linea);
//				
//			}
			
			//Realizar escritura de archivos
			String linea = "\nabcdefg";  //Vamos intentar pasar estos caracteres al archivo de prueba mediante FileWriter
			//vamos a identificar el archivo
			File archivo = new File("C:\\Users\\Admin\\Desktop\\fichero.txt");
			FileWriter line = new FileWriter(archivo,true); //pasamos el valor del archivo que vamos a escribir y que este exista
			//Traemos un ciclo como ejemplo, para escribir cada caracter en una linea
			
			for(int i=0; i<linea.length(); i++) {
				line.write(linea.charAt(i)+"\n"); //escribimos cada caracter recorrido en el String en una nueva linea
			}
			line.close();
			
		}catch(Exception ex) { //si hay algun error lo atrapara en una excepcion
			System.out.println("NO ENCONTRO EL ARCHIVO!");
			
		}

	}

}
