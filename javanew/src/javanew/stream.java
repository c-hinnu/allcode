package javanew;
import java.util.stream.Stream;

public class stream {

	public static void main(String[] args) {
		
        Stream<Integer> myStream =Stream.of(1,2,3,4,5,6,7,8,9,10);
		
		long noOfElements = myStream.filter((i)->i%2==0).count();
		
		
		System.out.println("Number of even numbers: "+noOfElements);

	}

}
