package LambdaOnObjectList;
//Encapsulated class
public class Employee {
	
	private int id;
	
	private String fname;
	
	private String lname;
	
	private int age;
	
	private boolean isMale;
	
	private String city;
	
	private int Salary;

	
	@Override
	public String toString() {
	    return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", age=" + age + 
	           ", gender=" + (isGenderMale() ? "Male" : "Female") + ", city=" + city + ", Salary=" + Salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGenderMale() {
		return isMale;
	}

	public void setGenderMale(boolean gender) {
		this.isMale = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	// TODO Auto-generated method stub
	
	
}
