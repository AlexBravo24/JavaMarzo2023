package lambda;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

public class Lambda2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name1 = "Emmanuel";
		String name2 = "Denisse";
		String name3 = "Juan";
		String name4 = "Ernesto";
	
		HashSet<String> my_set = new HashSet<String>();
		HashSet<String> my_set2 = new HashSet<String>();
		my_set.add(name1);
		my_set.add(name2);
		my_set.add(name3);
		my_set.add(name4);
		
		my_set.stream().filter(e -> e.startsWith("D")).forEach(System.out::println);
		System.out.println();
		my_set.stream().sorted().forEach(System.out::println);
		System.out.println();
		my_set.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
		System.out.println();
		my_set.stream().map(String::toString).forEach(System.out::println);
		System.out.println();
		my_set2 =  (HashSet<String>) my_set.stream().collect(Collectors.toSet());
		Iterator<String> my_iterator = my_set2.iterator();
		
		while(my_iterator.hasNext()) {
			System.out.println("Esto es lo que hay en la nueva lista, gracias al método collect(Collectors.toList)");
			System.out.println(my_iterator.next());
		}
		
	}

}
