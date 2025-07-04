package JavaInterfaceMethods;

public interface Animal {
	
	public void getName();
	
	public static void getAge() {
		System.out.println("Static method in interface");
	}
	
	default void getAgeFromCal() {
		ageCalculator();
	}
	
	private void ageCalculator() {
		System.out.println("in private method of interface");
	}

}
