package com;

import java.util.HashSet;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> conjunto = new HashSet<String>(); 
		 conjunto.add("manzana");
		 conjunto.add("pera");
		 conjunto.add("fresa");
		 conjunto.add("naranja");
		 conjunto.remove("pera");
		 for(String s : conjunto) {
		     System.out.println(s);
		 }
	}

}
