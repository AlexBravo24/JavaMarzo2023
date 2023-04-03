package calculadora;

public class Calculadora_cientifica extends Calculadora{
		
	private int res;
	
	
	public Calculadora_cientifica(String color, int price, String marca) {
		super(color, price, marca);
	}
	

	public void sumar(int num1, int num2) {
		res = num1+num2;
		System.out.println("Resultado: " + res);
	}

	public void restar(int num1, int num2) {
		res = num1-num2;
		System.out.println("Resultado: " + res);
	}

	public void multiplicar(int num1, int num2) {
		res = num1*num2;
		System.out.println("Resultado: " + res);
	}

	public void dividir(int num1, int num2) {
		res = num1/num2;
		System.out.println("Resultado: " + res);
	}	
	
}
