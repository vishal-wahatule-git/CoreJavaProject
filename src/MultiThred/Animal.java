package MultiThred;

public class Animal extends Thread
{
	public static void main(String[] args) {
	}

	public Animal(String name) {
		super(name);
		
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}

}
