package javanew;
import java.util.*;

public class pgm16 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n= sc.nextInt();
	        int sum=0;
	        if(n>5)
	        {
	         for(int i=5;i<n;i++)   
	         {
	             int k=i;
	             while(k>0)
	             {
	             int rem=k%10;
	             sum=sum+rem;
	             k=k/10;
	             }
	             if(sum==5)
	             {
	                 System.out.println(i);
	                 
	                 
	             }
	             sum=0;
	         }
	        }
	        else
	        {
	            System.out.println("Invalid");
	        }
	    }
	    
	}