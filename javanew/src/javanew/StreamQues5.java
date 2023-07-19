package javanew;

import java.util.Arrays;
import java.util.List;

public class StreamQues5 {

	public static void main(String[] args) {
		List<String> str=Arrays.asList("Hello","Interview","Questions","Answers","Ram","For");
		str.stream().filter(s->s.length()>3).forEach(System.out::println);
		

	}

}
