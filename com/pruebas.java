package com;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		 String str = "25";
//	        try{
//	            Integer number = Integer.valueOf(str);
//	            System.out.println(number); // output = 25
//	        }
//	        catch (NumberFormatException ex){
//	            ex.printStackTrace();
//	        }
		
		 char[] in = new char[50];       // Para guardar la entrada
	        int size = 0;
	        try {
	            File file = new File("fileWrite2.txt"); // Solo es un objeto
	            FileWriter fw = new FileWriter(file);   // Creamos un fichero actual y un
	                                                    // objeto FileWriter
	            fw.write("howdy\nfolks\n");             // Escribimos caracteres en el fichero
	            fw.flush();                             // Limpiamos
	            fw.close();                             // Cerramos el archivo cuando todo ha terminado
	             
	            FileReader fr = new FileReader(file);    // Creamos un objeto FileReader
	            size = fr.read(in);         // Leemos el archivo entero
	            System.out.println(size + " ");  // Cantidad de bytes leidos
	            for (char c : in){
	                System.out.println(c);
	            	//System.print(c);        // Imprimimos el array
	            }
	            fr.close();     // De nuevo, siempre cerramos
	        }catch(IOException ex){ }
	        
	}

}
