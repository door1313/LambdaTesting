package wayne.test;

import java.util.Arrays;
import java.util.Optional;

public class MyTest {

	public static void main(String... arg){
		Optional<Integer> max = Arrays.asList(1,9,3,4,8).stream().map(i -> i+1).max(Integer::compareTo);
		System.out.println(max.get());
	}
	
}
