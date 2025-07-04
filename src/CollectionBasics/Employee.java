package CollectionBasics;

public class Employee {
	
	public int Id;
	
	public String Fname;
	
	
	
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Fname=" + Fname + ", lname=" + lname + ", Salary=" + Salary + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return Id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		Id = id;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return Fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		Fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return Salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		Salary = salary;
	}

	public String lname;
	
	public int Salary;
	

}
