package LambdaOnObjectList;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	
	public static List<Employee> getListOfEmp(){
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		e1.setId(101);
		e1.setFname("john");
		e1.setLname("Doe");
		e1.setAge(27);
		e1.setCity("America");
		e1.setGenderMale(true);
		e1.setSalary(250000);
		
		Employee e2 = new Employee();
		e2.setId(102);
		e2.setFname("Alice");
		e2.setLname("Rais");
		e2.setAge(25);
		e2.setCity("London");
		e2.setGenderMale(false);
		e2.setSalary(200000);
		
		Employee e3 = new Employee();
		e3.setId(103);
		e3.setFname("Sai");
		e3.setLname("Kalse");
		e3.setAge(29);
		e3.setCity("pune");
		e3.setGenderMale(false);
		e3.setSalary(25000);
		
		Employee e4 = new Employee();
		e4.setId(104);
		e4.setFname("shailaja");
		e4.setLname("kshirsagar");
		e4.setAge(21);
		e4.setCity("pune");
		e4.setGenderMale(false);
		e4.setSalary(250000);
		
		Employee e5 = new Employee();
		e5.setId(105);
		e5.setFname("suyash");
		e5.setLname("dhajekar");
		e5.setAge(30);
		e5.setCity("pune");
		e5.setGenderMale(true);
		e5.setSalary(300000);
		
		Employee e6 = new Employee();
		e6.setId(106);
		e6.setFname("Adity");
		e6.setLname("Ardak");
		e6.setAge(32);
		e6.setCity("Banglore");
		e6.setGenderMale(true);
		e6.setSalary(200000);
		
		Employee e7 = new Employee();
		e7.setId(107);
		e7.setFname("Akshay");
		e7.setLname("Puranik");
		e7.setAge(31);
		e7.setCity("Banglore");
		e7.setGenderMale(true);
		e7.setSalary(220000);
		
		Employee e8 = new Employee();
		e8.setId(108);
		e8.setFname("Purva");
		e8.setLname("K");
		e8.setAge(31);
		e8.setCity("Nagpur");
		e8.setGenderMale(false);
		e8.setSalary(210000);
		
		Employee e9 = new Employee();
		e9.setId(109);
		e9.setFname("Srushti");
		e9.setLname("K");
		e9.setAge(23);
		e9.setCity("Aurangabad");
		e9.setGenderMale(false);
		e9.setSalary(150000);
		
		Employee e10 = new Employee();
		e10.setId(109);
		e10.setFname("Omkar");
		e10.setLname("Howale");
		e10.setAge(30);
		e10.setCity("Delhi");
		e10.setGenderMale(true);
		e10.setSalary(160000);
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		empList.add(e9);
		empList.add(e10);
		
		return empList;
		
	}
}
