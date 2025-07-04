package CollectionBasics;

import java.util.HashSet;
import java.util.Set;

public class SETs {
	
	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		
		System.out.println("**************");
	    
		// Enhanced for loop with Array
		int[] arr = {1,2,3,4,5};
		
		for (int b : arr) {
			System.out.println(b);
		}
		
		//Collection and iterate using enhance for loop
		for(int a : s) {
			System.out.println(a);
		}
		
	 }

}
