package Interface;

public class Car implements Vehicle{

	@Override
	public void getType() {
		System.out.println("this is car");
	}

	@Override
	public void getColor() {
		System.out.println("Color is white");
	}

	@Override
	public void getBrand() {
		System.out.println("Volkswagen");
	}

}
