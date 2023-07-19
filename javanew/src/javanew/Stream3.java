package javanew;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream3 {

	public static void main(String[] args) {
		//odd numbers
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		 IntStream w=Arrays.stream(a)
		.filter(p->(p%2)!=0);
		 w.forEach(s -> System.out.println(s));
      
	}

}
