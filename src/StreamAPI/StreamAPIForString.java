package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIForString {
	
	public static void main(String[] args) {
		
		List<String> animalName = Arrays.asList("Lion", "Tiger", "Tortoise","Eagel", "Dog");
		
		// list of animal starting with t
		List<String> listOne = animalName.stream().filter(m -> m.startsWith("T")).collect(Collectors.toList());
		System.out.println(listOne);
		
		// count of animal starting with t
		long count = animalName.stream().filter(l -> l.startsWith("T")).count();
		System.out.println(count);
		
		
		// print all animal in upper case
		animalName.stream().map(l -> l.toUpperCase()).forEach(k -> System.out.println(k));
		
		System.out.println("----------------------------------------------------------------");
		
		// print animal starting with t in upper case
		animalName.stream().filter(l -> l.startsWith("T")).map(m -> m.toUpperCase()).forEach(k -> System.out.println(k));
				
		
		
	}

	
}
