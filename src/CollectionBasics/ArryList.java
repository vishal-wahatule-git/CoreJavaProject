package CollectionBasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArryList {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(101);
		l.add(102);
		//900
		l.add(103);
		l.add(104);
		l.add(105);
		l.add(106);
		l.add(106);
		l.add(107);
		l.add(104);
		l.add(null);
		
		System.out.println(l.get(3));
		l.add(2,900);
		System.out.println(1);
		
		// default capacity = 10
		
		
		// surely = 100 elements
		List<Integer> la = new ArrayList<Integer>(100);  // capacity = 100 , size = 0

		
		Integer[] arr = { 91, 92, 93, 94, 95, 96};
		List<Integer> list = Arrays.asList(arr); // // arraylist -> can dynamically increase or decrease its size
		
		System.out.println(list.size());
		//l.remove(2);
		
		// Iteration of list 
		// for loop
		// enhanced for loop 
		// stream api
		
		List<Integer> linkList = new LinkedList<Integer>();
		linkList.add(91);
		linkList.add(92);
		linkList.add(93);
		linkList.add(94);
		
		System.out.println(linkList.size());
		
		
		
	}
	
	
	

	
}
