package setExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
	public static void main(String[] args) {
		 Map<Integer, String> m = new HashMap();
		 
		 m.put(945, "Suyash");
		 m.put(7852, "Ram");
		 m.put(785, "Sham");
		 m.put(789452, "Raghav");
		 m.put(7895, "Sham");
		 
		 int[] arr = {945, 7852, 785,7895};
		 
		 for (int b : arr)
			 System.out.println(b);
		 
		// System.out.println(m);
		 
		 System.out.println("---------------------------------------------------");
		 
		 Map<Integer, String> m1 = new LinkedHashMap();
		 m1.put(945, "Suyash");
		 m1.put(7852, "Ram");
		 m1.put(785, "Sham");
		 m1.put(789452, "Raghav");
		 m1.put(7895, "Sham");
		 
		 System.out.println(m1);
		 
		 System.out.println("---------------------------------------------------");
		 
		 
		 Map<Integer, String> m2 = new TreeMap();
		 m2.put(945, "Suyash");
		 m2.put(7852, "Ram");
		 m2.put(785, "Sham");
		 m2.put(789452, "Raghav");
		 m2.put(7895, "Sham");
		 
		 System.out.println(m2);
		 
		 
		 
	}

}
