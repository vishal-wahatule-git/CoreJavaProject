package MultiThred;

public class Demo {
	
	public static void main(String[] args) {
		
		Animal a = new Animal("My custom threads");
		a.start();
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
