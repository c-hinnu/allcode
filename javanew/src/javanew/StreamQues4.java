package javanew;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamQues4 {

	public static void main(String[] args) {
		List<String> str=Arrays.asList("Hello","Interview","Questions","Answers","Ram","For");
		long c=str.stream().filter(s->s.length()>3).count();
		System.out.println(c);
		

	}

}
