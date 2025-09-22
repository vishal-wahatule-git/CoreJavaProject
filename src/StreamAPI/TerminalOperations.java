package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {
	
	public static void main(String[] args) {
		
		// console 
		// collection
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		
		// for each -> print method 
		list.stream().forEach(z -> System.out.println(z));
		
		// in form of list .
		List<Integer> li = list.stream().collect(Collectors.toList());
		System.out.println(li);
		
		// count
		long count = list.stream().count();
		System.out.println("Count is "+count);
		
		long count2 = list.stream().distinct().count();
		System.out.println(count2);
		
		// sum of complete list 
		Optional<Integer> sum = list.stream().reduce((x,y) -> x+y);
		System.out.println(sum.get());
		
		// short circuiting [Terminal operation]
		// anyMatch, allMatch, noneMatch
		List<String> studentName = Arrays.asList("suyash", "akshay", "hari", "neha", "Raj", "Mechael");
		
		boolean v = studentName.stream().anyMatch(x -> x.length() ==4);
		System.out.println(v);
		
		boolean v1 = studentName.stream().allMatch(y -> y.length()>3);
		System.out.println(v1);
		
		boolean v2 = studentName.stream().noneMatch(z -> z.startsWith("z"));
		System.out.println(v2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
