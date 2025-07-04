package JavaInterfaceMethods;

public class Dog implements Animal
{

	@Override
	public void getName() {
		Animal.getAge();
		
	}

	@Override
	public void getAgeFromCal() {
		// TODO Auto-generated method stub
		Animal.super.getAgeFromCal();
	}
	
	

}
