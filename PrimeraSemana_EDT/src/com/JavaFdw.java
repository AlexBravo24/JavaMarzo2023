package com;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class JavaFdw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String saludo = "Saludos, mi campeón";
			File my_file = new File("src/com/fichero.txt");
			FileWriter my_writer = new FileWriter(my_file, true);
			FileReader my_reader = new FileReader(my_file);
			BufferedReader my_buffered = new BufferedReader(my_reader);
						
			my_writer.write(saludo);
			my_writer.close();

			System.out.println(my_buffered.readLine());
			my_buffered.close();
		} catch(IOException e) {
			System.out.println("No se encontró el archivo :(");
		}
		
	}

}
