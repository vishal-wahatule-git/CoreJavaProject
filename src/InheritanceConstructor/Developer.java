package InheritanceConstructor;

public class Developer extends Employee {
	
	private int id;
	
	private int age;
	
	private String name;
	
	public Developer() {
		this(101, "abc");
	}
	
	public Developer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	

}
