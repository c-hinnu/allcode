package javanew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamQues2 {

	public static void main(String[] args) {
		List<Integer> ls=Arrays.asList(2,3,4,5,6);
		Integer x=ls.stream().min(Integer::compare).get();
		System.out.println(x);

	}

}
