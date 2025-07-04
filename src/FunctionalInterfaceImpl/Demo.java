package FunctionalInterfaceImpl;

public class Demo {
	
	public static void main(String[] args) {
		
		Calculator c = ( a ,  b) ->  a+b;
		System.out.println(c.doOperation(20, 30));
		
		Calculator ca = (a , b) -> a-b;
		System.out.println(ca.doOperation(58, 10));
		
		Calculator p = (a , b) -> a/b;
		System.out.println(p.doOperation(12, 4));
		
	}

}
