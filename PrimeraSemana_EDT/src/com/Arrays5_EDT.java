package com;

public class Arrays5_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] articles = {"Shampoo", "Crema", "Rastrillos", "Cepillos", "Frutas"};
		int [] prices = {50, 200, 20, 80, 90};
		
		for (int i = 0; i < articles.length; i++) {
			System.out.println("Producto: " + articles[i] + " cuesta: $" + prices[i]);
		}
	}

}
