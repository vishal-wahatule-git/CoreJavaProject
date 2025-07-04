package setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetStr {
public static void main(String[] args) {
		
		Set<String> s = new HashSet<>();
		s.add("Suyash");
		s.add("Vishal");
		s.add("Tushar");
		s.add("Aditya");
		s.add("Omkar");
		s.add("Surya");
		System.out.println(s);
		
		// Using For Loop 
		List<String> list = new ArrayList<String>(s);
		for (int i = 0; i < list.size(); i++) {
		    System.out.println(list.get(i));
		}
		// Using Enhanced For-Each Loop
		for(String name : s) {
			System.out.println(name);
		}
		// Using Stream API Lambda Fun
		list.stream().forEach(z -> System.out.println(z));
	 }

}



