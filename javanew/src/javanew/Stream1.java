package javanew;

import java.util.Arrays;

public class Stream1 {

	public static void main(String[] args) {
		//sum of even numbers
		 int a[]= {1,2,3,4,5,6,7,8,9,10};
		 System.out.println(Arrays.stream(a)
				 .filter(p->(p%2)==0)
				 .sum());
         

	}

}
