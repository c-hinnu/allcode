package javanew;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream5 {

	public static void main(String[] args) {
		//concate
		List<String> strings = Arrays.asList("Hello", "world", "!");
		String concatenated = strings.stream().collect(Collectors.joining(" "));
		System.out.println(concatenated); 


	}

}
