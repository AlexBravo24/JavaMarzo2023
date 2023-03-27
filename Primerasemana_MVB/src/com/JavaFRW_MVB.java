package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_MVB {

	public static void main(String[] args) {
		// Clases File, FileReader, FileWriter y BufferedReader
		//con ellas los que hacemmos es acceder a archivos 
		//podemos leerlos, crearlos, modificarlo, etc.
		
		//realizando lectura de un archivo
		//estructura try and catch
		//el try va a intentar ejecutar lo que tenemos dentro de él
		//mientras que el catch seria atrapar una excepción o un error
		//aveces en la comunicación con archivos externos puede haber errores en la comunicación 
		//que impidan ejecutar el programa      //lectura de archivo
		
//		String linea;//declaro una variable en la cual puede guardar provisionalmente la linea
//		//o lineas a leer del archivo
//		
		try {   //intenta lo siguiente
//			File archivo=new File ("C:\\Users\\monse\\OneDrive\\Escritorio\\fichero.txt");
//		//con esta clase lo que hacemos es tener una representación
//			//en memoria del archivo (identificado)
//			FileReader fr= new FileReader(archivo); // la claseFileReader
//			//sabe leer el contenido del archivo
//			BufferedReader buffer = new BufferedReader (fr); 
//			//Leer el contenido del archivo para traerlo de este lado a Java
//			while ((linea=buffer.readLine())!= null) { 
//				//asignamos el valor de lo que va leyendo el objeto buffer a una linea
//				//y mientras esta tenga datos o contenido lo mostraremos en consola 
//				System.out.println("Linea: "+linea);
//			}
	//Realizar escritura de archivos 
			String linea="\n abcdefg \n";//Vamos a intentar pasar estos caracteres al archivo de prueba mediante FileWriter
			//volvemos a identificar el archivo con la clase File
			File archivo = new File ("C:\\Users\\monse\\OneDrive\\Escritorio\\fichero.txt");
			FileWriter line = new FileWriter(archivo,true); //pasamos el valor 
		//del archivo que vamos a escribir y que éste exista
		//traemos a un ciclo, como ejemplo, para escribrir cada caracter en una linea
			
			for (int i=0;i<linea.length();i++) {
				line.write(linea.charAt(i)+"\n"); //Escribimos cada caracter
			//recorrio en el string en una nueva línea
				
			}
			line.close();
			
		}catch (Exception ex) { //Si hay algún error, lo atrapará en una excepcion
			System.out.println("No se encontró el archivo");
		}
	
		

	}//CIERRE 

}//CIERRE
