package setExample;

import java.util.HashMap;
import java.util.Map;

public class HashMapStr {
	public static void main(String[] args) {
		
		Map<String, String> m = new HashMap();
		m.put("Fname", "Suyash");
		m.put("Dist", "Pune");
		m.put("Mname", "Ram");
		m.put("Lname", "Shinde");
		m.put("SubDist", "Mulshi");
		m.put("Village", "Bhugaon");
		System.out.println(m);
		
		System.out.println("-----------------------------------------------");
		
        // Using For Loop
		String[] key = m.keySet().toArray(new String[0]);
		for (int i = 0; i < key.length; i++) {
			String ke = key[i];
			System.out.println(key + " = " + m.get(key));
		}
		System.out.println("-----------------------------------------------");
		
		// Enhance for loop
		for (String ke : m.keySet()) {
			System.out.println(key + "=" +m.get(key));
		}
		System.out.println("-----------------------------------------------");
		
		// Using lambda function 
		m.forEach((ke, value) -> System.out.println(key + "=" + m.get(key)));
	}

}
