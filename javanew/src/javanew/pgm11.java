package javanew;

import java.util.Scanner;

public class pgm11 {

	public static void main(String[] args) {
		int n,r,sn=0;
		System.out.println("enter number");
		Scanner s = new Scanner(System.in);
		n=s.nextInt();
		int temp=n;
		while(n>0) {
			
		    r=n%10;
			sn=sn*10+r;
			n=n/10;
			
		}
	   if(temp == sn)
	   {
		   System.out.println("true");
	   }
	   else
	   {
		   System.out.println("false"); 
	   }
		
		

	}

}
