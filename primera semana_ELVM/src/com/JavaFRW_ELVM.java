package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_ELVM {

	public static void main(String[] args) {
		// Clases File,Filereader,FileWriter yBufferedReader
		
		//con ellas lo que hacemos es acceder a archivos
		//poder leerlos,crearlos,modificarlo,etc.
		
		
		//REALIZANDO LECTURA DE UN ARCHIVO
		
		//Estructura Try and Catch ---try es intenta
		//el try va a tratar de ejecutar lo que tenemos dentro de el
		//mientras que el cach lo que hace seria atrapar una expeccion o error
		//a veces en la comunicacion con archivos externos puede haber
		//errores en la comunicacion que impidan ejecutar el programa
		//String linea;//declaro una variable en la cual
		//pueda guardar provisionalmente la linea o lineas a leer
		//del archivo
		
		try {//intenta lo siguiente
//			File archivo=new File("C:\\Users\\erick\\Desktop\\fichero.txt");
//			/*
//			 * con esta clase lo que hacemos es tener una representacion
//			 * en memoria del archivo(identificamos)
//			 */
//			FileReader fr=new FileReader(archivo);//la clase Filereader 
//			//sabe leer el contenido del archivo
//			BufferedReader buffer =new BufferedReader(fr);
//			/*
//			 * leer el contenido del archivo para traerlo de este lado a java
//			 * 
//			 */
//			while((linea=buffer.readLine()) != null) {//asignamos el valor de lo que va leyendo el objeto uffer a una linea
//				//y mientras esta tenga datos o contenido lo mostraremos
//				//en consola
//				
//				System.out.println("linea: "+linea);
//			}
		/*REALIZAR UNA ESCRITURA DE ARCHIVO
		 * 
		 */
			String linea="\nabcdefg\n";//vamos a intentar pasar estos caracteres
			//al archivo de prueba, meduiante FileWrite
			//volvemos a identificar al archivo con la clase File
			File archivo=new File("C:\\Users\\erick\\Desktop\\fichero.txt");
			FileWriter line=new FileWriter(archivo, true);//pasamos el valor
			//del archivo que vamos a escrbir y que este exista
			//traemos a un ciclo, como ejemplo, para escribir cada caracter
			//en una linea
			for(int i= 0;i<linea.length();i++) {
				line.write(linea.charAt(i)+"\t");//escribirmos cada caracter
				//recorrido en el String en una nuev linea
				
			}
			line.close();
		}catch(Exception ex) {//si hay algun error lo atrapara en una exception
			
			System.out.println("no encontre el archivo");
		}

	}

}
