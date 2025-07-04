package AbstractionTask;

public class Developer extends Employee {

	@Override
	public void getSalary() {
		System.out.println("salary for developer is " +15000);
		
	}

	@Override
	public void getAttendance() {
		System.out.println("attendance is mandetory");
		
	}

	@Override
	public void workMode() {
		System.out.println("workmode for HR wfh");
	}

	@Override
	public void dressCode() {
		System.out.println("not mandetory");
	}

}
