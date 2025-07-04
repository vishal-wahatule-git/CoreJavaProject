package setExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStr {
	public static void main(String[] args) {
		
		Set<String> city = new TreeSet<>();
		city.add("Pune");
		city.add("Banglore");
		city.add("Mumbai");
		city.add("Chennai");
		city.add("Hyadrabad");
		System.out.println(city);
		
		System.out.println("------------------------------------------------");
		
		// For Loop
		List<String> cName = new ArrayList<>(city);
		for(int i = 0; i < cName.size(); i++) {
			System.out.println(cName.get(i));
		}
		System.out.println("------------------------------------------------");
		
		// Enhanced for each loop
		for (String c : cName) {
			System.out.println(c);
		}
		System.out.println("------------------------------------------------");
		
		// Stream API Lambda Function
		cName.stream().forEach(a -> System.out.println(a));
		
	}

}
