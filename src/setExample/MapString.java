package setExample;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapString {
	
	public static void main(String[] args) {
		
		// one null key, & Multiple null Value Random order
		Map<String, String> m = new HashMap();
		m.put("Fname", "Suyash");
		m.put("Dist", "Pune");
		m.put("Mname", "Ram");
		m.put("Lname", "Shinde");
		m.put("SubDist", "Mulshi");
		m.put("Village", "Bhugaon");
		
		System.out.println(m);
		
		System.out.println("-----------------------------------------");
		
		// one null key, & Multiple Null Values, Insertion order
		Map<String, String> ma = new LinkedHashMap();
		ma.put("Fname", "Suyash");
		ma.put("Lname", "Shinde");
		ma.put("Mname", "Ram");
		ma.put("Village", "Bhugaon");
		ma.put("Dist", "Pune");
		ma.put("SubDist", "Mulshi");
		
		System.out.println(ma);
		
		System.out.println("-----------------------------------------");
		
		// no null key, allow multiple null values, shorted (ascending) order 
		Map<String, String> map = new TreeMap();
		map.put("Fname", "Suyash");
		map.put("Mname", "Ram");
		map.put("Lname", "Shinde");
		map.put("Dist", "Pune");
		map.put("SubDist", "Mulshi");
		map.put("Village", "Bhugaon");
		
		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
