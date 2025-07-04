package AbstractionTask;

public class HR extends Employee {

	@Override
	public void getSalary() {
		System.out.println("salary for HR is " +20000);
		
	}

	@Override
	public void getAttendance() {
		System.out.println("Attendance is mandetory" );
		
	}

	@Override
	public void workMode() {
		System.out.println("workmode for HR wfo");
	}

	@Override
	public void dressCode() {
		System.out.println("dresscode is formal");
		
	}
	
	

}
