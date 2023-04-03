package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class JavaFRW_EVVC {

	public static void main(String[] args) {
		/*Clases File, FileReader, FileWriter y BufferedReader
		 * Con ellas lo que hacemos es acceder a archivos, poder leerlos, crearlos modificarlo, etc
		 */

		//Realizando lectura de un archivo
		
		/*Estructura try and catch  (el intentará ejecutar lo que tenemos dentro de él y el catch 
		 * atrapará una exceoción)
		 * Aveces en la comunicación con archivos externos debe haber errores en la comunicación que
		 * impidan ejecutar el programa por ello hacemos uso de try and catch
		 */
		
		//String linea; //Declaro una variable la cual pueda guardar provisionalmente linea o lineas al leer
						//el archivo
		
		try {//Intenta lo siguiente
//			File archivo=new File ("C:\\Users\\Eva Couturier\\Desktop\\Fichero.txt");
//									//Con la anterior clase tenemos una representación en memoria del
//									//archivo (identificamos por su respectiva ruta)
//			
//			FileReader fr=new FileReader(archivo);//la clase FileReader sabe leer el contenido del archivo
//			
//			BufferedReader buffer = new BufferedReader(fr); //leer el contenido para traerlo de este lado
//			
//			while ((linea= buffer.readLine()) != null) { //Asignamos el valor de lo que va leyendo al objeto
//															//buffer a una linea y mientas esta tenga datos
//															//o contenido lo mostramos en consola
//				System.out.println("Línea: "+ linea);
//				
//			}
			
			//Realizar escritura de archivos
			
			String linea="\nabcdefg\n"; // Vamos a intentar pasar estos caracteres al archivo de prueba
										//mediante FileWriter
										//Volvemos a identificar el archivo con la clase File
			File archivo=new File ("C:\\Users\\Eva Couturier\\Desktop\\Fichero.txt");
			FileWriter line = new FileWriter(archivo, true); //pasamos el valor del archivo del qie vamos
															// a escribir y que exista
			  //Traemos un ciclo, como ejemplo, oara escribir cada caracter en una línea
			for(int i=0;i<linea.length(); i++) {
				line.write(linea.charAt(i)+"\n"); //Escribimos cada caracter recorrido en el 
													// string en una nueva linea
			}
			line.close();
			
			
		}catch (Exception ex) { //Si hay algun error, lo atrapará en una excepción
			System.out.println("No encontré el archivo");
		}
		
	}

}
