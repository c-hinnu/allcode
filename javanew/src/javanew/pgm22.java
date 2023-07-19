package javanew;

import java.util.Arrays;
import java.util.Scanner;

public class pgm22 {

	public static void main(String[] args) {
		 System.out.println("Enter n");
		 System.out.println("Enter values");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		 double med;
		 int[] ar=new int[n];
		 for(int i=0;i<n;i++)
		 {
			 ar[i]=sc.nextInt();
		 }
		 Arrays.sort(ar);
		
		 if(n%2!=0)
		 {
				med=ar[n/2];
				System.out.println("The Median is: "+med);
			 }
			 else
			 {
				 
				int a=n/2;
				int b=ar[a-1]+ar[a];
				med=b/2;
				System.out.println("The Median is: "+med);
				 
			 } 

		 
		
		
		 

	}

}
