package javanew;

import java.util.Scanner;

public class pgm12 {

	public static void main(String[] args) {
		int n,t;
		  System.out.print("enter size:");
		  Scanner sc = new Scanner(System.in);
		  n=sc.nextInt();
		  System.out.print("enter target:");
		  t=sc.nextInt();
		  System.out.print("enter elements:");
		  int[]array = new int[n];
		  for(int i=0;i<n;i++)
		  {
			  array[i]=sc.nextInt();
		  }
		  for(int i=0;i<n;i++)
		  {
			  if(array[i]==t)
			  {
				  System.out.print(i);  
			  }
			  else if(array[i]>t)
			  {
				 System.out.println(i); 
				 break;
			  }
		  }
		

	}
	

}
