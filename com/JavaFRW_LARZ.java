package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_LARZ {

	public static void main(String[] args) {
		// Clases File, Filereader, Filewriter y BufferedReader
		
		//Con ella lo que hacemos es accerder a archivos 
		//Poder leerlos, crearlos, modificarlos, etc.
		
		//Realizar lectura de un archivo
		
		//Estructura try and catch
		//El Try va a intentar ejecutar lo que tenemos dentro de el
		//Mientras que el catch lo que hace seria atrapar una excepcion o error
		//A veces en la comunicacion con archivos externos puede haber
		//errores en la comunicacion que impida ejecutar el programa
		
		//String linea; //Declaro una variable la cual pueda guardar provisionalmente
		//la linea o lineas del archivo
		
		try { //intenta lo siguiente
//			File archivo= new File("C:\\Users\\Luis Angel\\Desktop\\fIcHeRo.txt");
//			//Con esta clase lo que hacemos es tener una representacion en memoria del 
//			//archivo (identificacion)
//			FileReader fr= new FileReader (archivo); //La clase FileReader
//			//sabe leer el contenido del archivo
//			BufferedReader buffer= new BufferedReader(fr);
//			//Leer el contenido del archivo para traerlo de este lado a Java
//			while ((linea = buffer.readLine()) != null) { //Asignamis el valor
//				//de lo que va leyendo el objeto buffer a una linea y mientras
//				//esta tenga datos o contenido lo mostraremos en la consola
//				System.out.println("Linea: "+linea);
//			}
			
		//Realizar escritura de archivos
			String linea="\nABCD\n"; //Vamos a intentar pasar estos caracteres al archivo 
			//de prueba mediante FileWritter
			//Volvemos a identificar el archivo con la clase File
			File archivo= new File("C:\\Users\\Luis Angel\\Desktop\\fIcHeRo.txt");
			FileWriter line=new FileWriter(archivo, true); //pasamos el valor del archivo
			//que vamos a escribir y que este exista
			//Traemos a un ciclo como ejemplo para escribir cada caracter en una linea
			
			for (int i=0;i<linea.length();i++) {
				line.write(linea.charAt(i)+"\n"); //Escribimos cada caracter recorrido en el string en una 
				//nueva linea
			} line.close(); //Para que el archivo se cierre
			
			
			
		
		} catch (Exception ex) { //Si hay algun error, lo atrapara en una excepcion
			System.out.println("No encontre el archivo");
		}
		

		
	}

}
