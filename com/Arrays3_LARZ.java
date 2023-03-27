package com;

import java.util.Scanner;

public class Arrays3_LARZ {

	public static void main(String[] args) {
		// 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres.
		
		Scanner sn=new Scanner(System.in);
        
        System.out.println("Escriba una frase");
         
        String frase=sn.nextLine(); 
         
        char caracteres[]=frase.toCharArray();
        System.out.println();
         
        for(int i=0;i<frase.length();i++){
            System.out.print(caracteres[i]);
        }


	}

}
