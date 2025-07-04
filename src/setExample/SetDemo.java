package setExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	
	public static void main(String[] args) {
		// one null value, no duplicate,  Random order
		Set<Integer> s = new HashSet<Integer>();
		s.add(45);
		s.add(12);
		s.add(null);
		s.add(980);
		s.add(456);
		s.add(980);
		System.out.println(s);
		
		System.out.println("***************************************************");
		
		// one null value, no duplicate, Insertion order
		Set<Integer> sa = new LinkedHashSet<Integer>();
		sa.add(45);
		sa.add(12);
		sa.add(null);
		sa.add(980);
		sa.add(456);
		sa.add(980); 
		System.out.println(sa);
		System.out.println("-----------------------------");
		
//		List<Integer> list = new ArrayList<>(sa);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		
		System.out.println("***************************************************");
		
		// no null value, no duplicate, shorted (ascending) order
		Set<Integer> sab = new TreeSet<Integer>();
		sab.add(45);
		sab.add(12);
		sab.add(980);
		sab.add(456);
		sab.add(980);
		System.out.println(sab);
		
	}

}
