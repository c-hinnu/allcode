package javanew;
interface NumericTest {
	
	boolean test(int n);

}

public class lamb2 {

	public static void main(String[] args) {
		
		NumericTest isEven;
        isEven=(n)->(n%2)==0;
	    if(isEven.test(5)) 
		System.out.println("10 is even");
	    else
	    System.out.println(" is odd");
	    	


	}

}
