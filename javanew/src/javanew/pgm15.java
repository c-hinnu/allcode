package javanew;

import java.util.Scanner;

public class pgm15 {

	  public static void main(String[] args)
	    {
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int sum=0;
	    int rem;
	    int temp;
	    System.out.println("Enter limit:");
	    System.out.println("Armstrong Number up to 500 are:");
	    
	   for(int i=0;i<=n;i++)
	   {
	       if(i>0 && i<=9)
	       {
	           System.out.print(i+" ");
	       }
	       else
	       {
	       temp=i;
	       while(temp!=0)
	       {
	           rem=temp%10;
	           sum=sum+rem*rem*rem;
	           temp=temp/10;
	       }
	       if(sum==i)
	       {
	           System.out.print(i+" ");
	          
	           
	       }
	       sum=0;
	       }
	   }
	    
	    
	    
	    
	    
	    
	}}