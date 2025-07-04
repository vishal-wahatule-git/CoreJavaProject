package setExample;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LHashSetStr {
	public static void main(String[] args) {
		
		Set<String> s = new LinkedHashSet<>();
		s.add("Tiger");
		s.add("Dog");
		s.add("Cat");
		s.add("Lion");
		s.add("Bull");
		s.add("Panda");
		System.out.println(s);
		
		// For Loop
		List<String> animal = new ArrayList<String>(s);
		for(int i = 0; i < animal.size(); i++ ) {
			System.out.println(animal.get(i));
		}
		// Enhance For each loop
		for (String a : animal) {
		System.out.println(a);
		}
		// Stream API Lambda Function
		animal.stream().forEach(a -> System.out.println(a));
	}

}
