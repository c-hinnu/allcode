package javanew;
import java.util.*;

public class Stream6 {

	public static void main(String[] args) {
	     List<Integer> myList = new ArrayList<>();
	        myList.add(1);
	        myList.add(2);
	        myList.add(3);
	        myList.add(4);
	        myList.add(5);

	        // convert list to stream and find product of elements
	        int sum = myList.stream().reduce(1, (a, b) -> a * b);

	        System.out.println("product of elements: " + sum);
	    }
	}



















































