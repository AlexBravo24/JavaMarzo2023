package lambda;

public class Lambda1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lambda_interfaz my_lambda = (int edad, String name)->{
			System.out.println("Hola, " + name + " me da gusto que tengas " + edad + " años");
		};
		
		my_lambda.mensaje(21, "Emmanuel");
	}

}
