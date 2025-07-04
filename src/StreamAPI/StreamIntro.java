package StreamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIntro {

	public static void main(String[] args) {
		
		
		List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Stream<Integer> list = l.stream();
		
		Integer[] a = {1,2,3,4,};
		Arrays.stream(a);
		
		Stream<String> name = Stream.of("a","abc","abcd");
	}

}
