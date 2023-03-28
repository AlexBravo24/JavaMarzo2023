package ciclos;

public class Palindromo {

	public static void main(String[] args) {
		String palabra = "amor a roma";
		
System.out.println("La palabra "+ palabra + "es palindromo "
		+esPalindromo(palabra));		

	}
	public static boolean esPalindromo(String palabra) {
		palabra = palabra.toLowerCase();
		
		for(int i = 0,j = palabra.length() -1;i<=j; i++,j--) {
			if(palabra.charAt(i) != palabra.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}


		
		
		
	}


