package javanew;

import java.util.Scanner;

public class SumPrimeFactors {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		int sum=0;
		for(int i=2;i<=num;i++)
		{
			while(num%i==0)
			{
				sum=sum+i;
				num=num/i;
			}
		}
		System.out.println(sum);

	}

}
