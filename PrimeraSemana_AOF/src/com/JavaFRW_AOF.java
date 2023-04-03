package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.Buffer;

public class JavaFRW_AOF {

	public static void main(String[] args) {
//Clases File, FileReader,FileWriter,BufferedReader
		//con ellos accedemos a archivos y podemos leerlos
		
		//Realizando lectura de un archivo
		
		//Estructura try and catch
		//va a intentar ejecutar lo que tenemos dentro de él
		//mientras que el catch lo que hace  seria atrapar una excepcion o error
		//a veces en la comunicación con archivos externos puedesn haber errores en la comunicacion que impiden ejecutar el programa
		
		//String linea;//declaro una variable la cual voy aguardar probicionalmente lineas a leer del archivo
		
		try {//intenta lo siguiente
//			
//			File archivo=new File("C:\\Users\\arian\\Desktop\\fichero.txt");
//			//con la clasefile es tener una representación en memoria del archivo(identificamos)
//			
//			FileReader fr=new FileReader(archivo);//Esta clase lee el contenido del archivo
//			
//			BufferedReader buffer= new BufferedReader(fr);
//			//BufferedReader lee el contenido del archivo para traerlo a java
//			
//			
//			while((linea= buffer.readLine())!=null){//asignamos el valor de lo que va leyendo el objeto buffer a una linea
//				//mientras esta tenga datos o contenido lomostramos en consola
//				
//				System.out.println("Linea:"+ linea); 
//				
//		
//			}//llave while
			
			
			
			
			//Realizar escritura de arhivo
			
		String linea ="\n abcdefg \n";// vamos a intentar pasar estos caracteres
		//al archivo de prueba mediante FileWriter
 		//Volvemos a identificar al archivo con la clase File
		
		File archivo=new File("C:\\Users\\arian\\Desktop\\fichero.txt");
		
		FileWriter line = new FileWriter (archivo,true);//pasamos el valor del archvo que vamos a escribir y que este exista
		//traemos un ciclo comoejemplo para escribir cada caracter en una linea
		
		for(int i=0; i<linea.length();i++) {
			line.write(linea.charAt(i)+"\n");
			
			//recorrifo en el string en una nueva linea
			}
		
	line.close();
		
		
		
		
		
			
			//llave try cierra
			
		}catch(Exception ex) {//si hay algun error lo atrapa en una excepcion
			
			System.out.println("No encontre el archivo");
			
		}
		
		
		
		
		
		

	}//cierra

}//cierra
