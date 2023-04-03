package com;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;

public class JavaFRW_AKVB {

	public static void main(String[] args) {
		/* Clases File, FileReader, FileWritter, y BufferedReader
		 * Con ellas podemos acceder, leer, modificar archivos, etc.
		 */

		/*Realizando lectura de un archivo.
		 * Estructura try and catch
		 * El try va a intentar ejecutar lo que tenemos dentro de el
		 * mientras que el cath va a atrapar una excepción o error.
		 * A veces eb la comunicacipon con archivos externos pueden haber
		 * errores que impidan ejecutar el programa.
		 */
		
		String linea;	//Declaro una variable para guardar las lineas a leer.
		
		try {	//Intenta lo siguiente
			File archivo = new File("C:\\Users\\We are Benito\\Desktop\\fichero.txt");
			/* Con esta clase tenemos una representacion en memoria
			 * del archivo
			 */
			FileReader fr = new FileReader(archivo);
			
			//FileReader sabe leer el contenido del archivo.
			BufferedReader buffer = new BufferedReader(fr);
			/*BufferedReader lee el contenido del archivo para 
			*traerlo de este lado a java (?)
			*/
			while ((linea = buffer.readLine()) != null) {
				System.out.println("Línea: " + linea);
				/*
				 * Asignamos el valor de buffer a una linea y mientras
				 * esta tenga datos o contenido lo mostraremos en consola
				 */
			}
		//Realizar escritura de archivos
			
			String linea_a = "\n abcdefg\n"; 	// Vamos a intentar oasar estos
												// caracteres al archivo mediante
												// fileWriter
			FileWriter line = new FileWriter(archivo, true);
			/*Pasamos el valor del archivo que vamos  a escribir y que exista
			 * Traemos un ciclo para escribir caracteres en la linea
			 */
			
			for(int i = 0 ; i < linea_a.length() ; i++) {
				line.write(linea_a.charAt(i) + "\n");
				//Escribimos cada caracter recorrido en el String en una nueva linea
			}
			
			line.close();
		}catch(Exception ex) {	//Si hay algún error lo atrapa en una excepcion.
			System.out.println("ERROR 404: File not Found");
		}
	}

}
