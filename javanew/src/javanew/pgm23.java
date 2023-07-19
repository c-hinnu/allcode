package javanew;
import java.util.*;

public class pgm23 {

	public static void main(String[] args) {
		Scanner sn =new Scanner(System.in);
		System.out.println("Enter row size");
		int n = sn.nextInt();
	    int[] arn = new int[n];
	    int k=0;
	    for(int i=0;i<n;i++)
	    {
	    	arn[i]=sn.nextInt();
	    }
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<arn[i];j++)
	    	{
	    		System.out.print(k+" ");
	    		k++;
	    	}
	    	System.out.println();
	    	
	    	
	    }
	    
		

	}

}
