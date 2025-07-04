package FunctionalInterfaceImpl;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

 
public class Main {
	public static void main(String[] args) {
		
		Predicate<Integer> p = (a) -> a % 2 == 0; // predicate fun intrf [ boolean test(T t); ]
		System.out.println(p.test(25));

//  	----------------------------------------------------------------------------------------
		
		Function<Integer, Integer> f = (x) -> x * 2; // Function [ R apply(T t); ]
		int result = f.apply(25);
		System.out.println(result);
		
//  	----------------------------------------------------------------------------------------		
		
		Consumer<String> c = y -> System.out.println(y); // Consumer [ void accept(T t); ]
		c.accept("Consumer");
		
//  	----------------------------------------------------------------------------------------		
		
		Supplier<String> sup = () -> "Supplier"; // Supplier [ T get(); ]
		System.out.println(sup.get());
		
//  	----------------------------------------------------------------------------------------
		
		BiPredicate<Integer, Integer> bp = (x,y) -> (x+y)%2 ==0; // BiPredictade [ boolean test(T t, U u); ]
		System.out.println(bp.test(3, 5));

//      ----------------------------------------------------------------------------------------
		
		BiConsumer<String, String> bic = (x,y) -> { // BiConsumer [ void accept(T t, U u); ]
			System.out.println("String a " +x);
			System.out.println("String b " +y);
		};
		bic.accept("hello", "world");
		
//  	----------------------------------------------------------------------------------------		
		
		BiFunction<Integer, Integer, Integer> Bifun = (a,b) -> (a+b)/2; // BiFunction [ R apply(T t, U u); ]
		int a = Bifun.apply(4, 10);
		System.out.println(a);
		
//  	----------------------------------------------------------------------------------------		
		
		// if given no is even then square it
		
		Predicate<Integer> pred = x -> x%2==0;
		Function<Integer, Integer> func = y -> y*y;
		Supplier<Integer> supp = () -> 8;
		Consumer<Integer> cons = d -> System.out.println("output square is : "+d);
		
		if(pred.test(supp.get())) {
			cons.accept(func.apply(supp.get()));
		}
		
		
	}

}
