package javanew;

import java.util.Arrays;
import java.util.List;

public class StreamQues3 {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(2,3,4,5,6);
		Integer x=ls.stream().max(Integer::compare).get();
		System.out.println(x);


	}

}
