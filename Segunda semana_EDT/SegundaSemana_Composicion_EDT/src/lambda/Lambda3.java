package lambda;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;

public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<persona> my_hashset = new HashSet<persona>();
	
		persona persona1 = new persona("Emmanuel", 21, "Masculino");
		persona persona2 = new persona("Eva", 25, "Femenino");
		persona persona3 = new persona("Velazquez", 28, "Masculino");
		persona persona4 = new persona("Luis", 26, "Masculino");
		persona persona5 = new persona("Lucio", 27, "Masculino");
		persona persona6 = new persona("Guillermo", 29, "Masculino");
		persona persona7 = new persona("Pedro", 28, "Masculino");
		persona persona8 = new persona("Jesus", 26, "Masculino");
		persona persona9 = new persona("Hernandez", 26, "Masculino");
		persona persona10 = new persona("Ariana", 25, "Femenino");
		persona persona11= new persona("Rosario", 28, "Femenino");
		persona persona12 = new persona("Kevin", 24, "Masculino");
		persona persona13 = new persona("Oscar", 34, "Masculino");	
		
		my_hashset.add(persona1);
		my_hashset.add(persona2);
		my_hashset.add(persona3);
		my_hashset.add(persona4);
		my_hashset.add(persona5);
		my_hashset.add(persona6);
		my_hashset.add(persona7);
		my_hashset.add(persona8);
		my_hashset.add(persona9);
		my_hashset.add(persona10);
		my_hashset.add(persona11);
		my_hashset.add(persona12);
		my_hashset.add(persona13);
		
		
		
//		my_hashset.stream().filter(x -> x.getSexo().equals("Masculino")).forEach(System.out::println);
		my_hashset.stream().sorted(Comparator.comparing(persona::getAge)).forEach(System.out::println);
		System.out.println(my_hashset.stream().allMatch(x -> x.getAge() < 40));
		System.out.println(my_hashset.stream().anyMatch(x -> x.getName().equals("Tizok")));
		
		Optional<persona> my_optional = my_hashset.stream().max(Comparator.comparing(persona::getAge));
		System.out.println(my_optional);
	}

}

		class persona{
			
			
			private String name;
			private int age;
			private String sexo;
			
			public persona() {

			}
			
			public persona(String name, int age, String sexo) {
				this.name = name;
				this.age = age;
				this.sexo = sexo;
			}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public int getAge() {
				return age;
			}

			public void setAge(int age) {
				this.age = age;
			}

			public String getSexo() {
				return sexo;
			}

			public void setSexo(String sexo) {
				this.sexo = sexo;
			}

			@Override
			public String toString() {
				return "persona [name=" + name + ", age=" + age + ", sexo=" + sexo + "]";
			}
			
			
			
			
		}
