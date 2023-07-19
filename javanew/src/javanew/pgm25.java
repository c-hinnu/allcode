package javanew;
import java.util.*;

public class pgm25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int q;
        try
        {
            q=n1/n2;
            System.out.println(q);
            
            
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        
    }


	}


