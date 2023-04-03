package ciclos;

public class ContarLetra {

	public static void main(String[] args) {
		 String exampleString = "Este es un ejemplo de una cadena de texto";

	        int stringLength = exampleString.length();

	        System.out.println("Longitud de la cadena: " + stringLength);

	        int stringLengthWithoutSpaces = exampleString.replace(" ", "").length();
	        System.out.println("Longitud de la cadena sin espacios: " + stringLengthWithoutSpaces);
	        }

	}


