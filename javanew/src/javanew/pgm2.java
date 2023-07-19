package javanew;

import java.util.Scanner;

public class pgm2 {

	public static void main(String[] args) {
		  int n,m1,m2,r;
		     System.out.println("enter first number");
		     Scanner sc = new Scanner(System.in);
		     m1=sc.nextInt();
		     System.out.println("enter second number");
		     m2=sc.nextInt();
		     System.out.println("enter option");
		    
		     n=sc.nextInt();
             switch(n)
           
             {
             case 1:r=m1+m2;
             System.out.println("sum is"+" "+r);
             break;
             case 2:r=m1-m2;
             System.out.println("difference is "+" "+r);
             break;
             case 3:r=m1*m2;
             System.out.println("product is "+" "+r);
             break;
             case 4:r=m1/m2;
             System.out.println("quotient is "+" "+r);
             break;
             
             }
             
             
	}

}
