package setExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class LHashMapStr {
	public static void main(String[] args) {
		
		Map<String, String> ma = new LinkedHashMap();
		ma.put("Fname", "Baliram");
		ma.put("Mname", "Babanrao");
		ma.put("Lname", "Shelke");
		//ma.put(null, null);
		ma.put("Village", "Kumbhefal");
		ma.put("SubDist", "Chh.Sambhajinagar");
		ma.put("Dist", "Chh.Sambhajinagar");
		System.out.println(ma);
		
		System.out.println("------------------------------------------");
		
		// For Loop 
		String[] k = ma.keySet().toArray(new String[0]);
		for(int i = 0; i < k.length; i++) {
			String ke = k[i];
			System.out.println(ke+ "=" +ma.get(ke));
		}
		System.out.println("------------------------------------------");
		
		for (String ke : ma.keySet()) {
			System.out.println(ke+ "=" +ma.get(ke));
		}
		System.out.println("------------------------------------------");
		
		ma.forEach((ke, value) -> System.out.println(ke+ "=" +ma.get(ke)));
		
		
	}
	

}
