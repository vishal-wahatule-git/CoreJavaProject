package hasARelationship;

import java.util.Arrays;
import java.util.List;

public class Demo {
	
	public static void main(String[] args) {
		Address a = new Address();
		a.setCity("PUNE");
		a.setZipCodde(123456);
		
		List<Address> adList1 = Arrays.asList(a);
		
		Student s = new Student();
		s.setStudentId(101);
		s.setName("Shailaja");
		s.setAddr(adList1);

		
		Address a1 = new Address();
		a1.setCity("Nashik");
		a1.setZipCodde(123456);
		
		List<Address> asList2 = Arrays.asList(a,a1);
		
		Student s1 = new Student();
		s1.setName("Devidas");
		s1.setStudentId(102);
		s1.setAddr(asList2);
		
		Student s2 = new Student();
		s2.setStudentId(103);
		s2.setName("KOMAL");
		s2.setAddr(asList2);
		
//		System.out.println(s.toString());
//		System.out.println(s1.toString());
//		System.out.println(s2.toString());
		
		System.out.println("");
		System.out.println(s1.getStudentId());
		System.out.println(s1.getName());
		 List<Address> addList= s1.getAddr();
		 addList.stream().forEach((d)->{
			 System.out.println(d.getCity());
			 System.out.println(d.getZipCodde());
		 });
		
		
	}
}
