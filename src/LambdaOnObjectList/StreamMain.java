package LambdaOnObjectList;

import java.util.List;
import java.util.Optional;

public class StreamMain {
	
	public static void main(String[] args) {
		List<Employee> eList = EmployeeRepository.getListOfEmp();
		
		// using for each loop .
		int totalSalary = 0;
		for(Employee e : eList) {
			totalSalary = totalSalary +e.getSalary();
			
//			if(e.getSalary() > 200000) {
//				System.out.println(e.getFname());
//			}
			
			//System.out.println(e.getFname());
			//System.out.println(e.getSalary());
		}
		System.out.println(totalSalary);
		
		
		System.out.println("-------------------------------------------------------------------------");
		
		// using stream API
		
		Optional<Integer> salarySum = eList.stream().map(k -> k.getSalary()).reduce((x,y) -> x+y);
		System.out.println(salarySum.get());
//		eList.stream()
//		.filter(l -> l.getSalary() > 200000)
//		.forEach(k -> System.out.println(k.getFname()));
		
		
//		eList.stream().forEach((k) ->{
//			System.out.println(k.getFname());
//			System.out.println(k.getSalary());
//		});
		}
		
	}


