package javanew;

import java.util.Scanner;

public class pgm7 {

	public static void main(String[] args) {
		int r,c;
		Scanner sca = new Scanner(System.in);
		r=sca.nextInt();
		c=sca.nextInt();
		for(int i=1;i<=r;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.println();
	    }
	}
	

}
