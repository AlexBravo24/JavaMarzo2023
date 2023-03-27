package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_RICG {


	public static void main(String[] args) {
		
		//Clases File, FileReader, Filewriter y BufferedReadear
		//Con ellas lo que hacemos es acceder a un archivo
		//poder leeerlo, crearlos, modificarlo
		
		//Realizando lectura de un archivo
		
		//Estructura try and catch
		//El try va intentar ejecutar lo que tenemos dentri de el
		//El catch lo que hace seria atrapar una excepcion o error
		//A veces en la comunicación puede a ver errores que impidan ejecutar el programa
		
		//String linea;//Declaro una variable la cual pueda guardar provisionalmente la linea o lineas a leer del archivo
		
		
		try {//intenta lo siguiente
//			File archivo = new File("C:\\Users\\leo fabian\\Desktop\\fichero.txt");
//		
//		
//			FileReader fr = new FileReader(archivo);
//			//La clase FileReader sube leer el contenido del archivo
//			BufferedReader buffer = new BufferedReader(fr);
//			//Leer el contenido del archico para traerlo de este lado de java
//			
//			while((linea= buffer.readLine())!=null) {
//				//Asignamos el valor de lo que se va leyendo el objeto buffer a una linea
//				//y mientras esta tenga datos y contenidos lo mostraremos en consola
//				System.out.println("Linea:" + linea);
//				
//			}
			
			//Realizar escritura de archivos
			String linea="\n abcdefg \n";// vamos a intentar pasar los caracteres
			//al archivo de prueba mediante FileWriter
			//Volvemos a identificar el archivo de la clase File
			
			File archivo = new File("C:\\Users\\leo fabian\\Desktop\\fichero.txt");
			FileWriter line = new FileWriter(archivo, true);
			//pasamos el valor del archivoque vamosa escribir y que este exista
			//Tenemos como a un ciclo, como ejemplo, para escribir cada caracter en una linea
			
			for (int i=0; i<linea.length(); i++ ) {
				line.write(linea.charAt(i)+"\n");//escribimos cadacaracter
				//recorrido en el stringen una nueva linea
				
			}
			
			line.close();
			
			
			}catch(Exception ex) {//si hay algun error, la atrapara en una excepción
				// Coneste esta clase lo que  tenemos una representacion
				//en memoria del archivo (identificamos)
				
			System.out.println("No encontre el archivo");
				
		}


	}

}
