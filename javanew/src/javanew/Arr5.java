package javanew;

import java.util.Scanner;

public class Arr5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] so=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			so[i]=sc.nextInt();
		}
		System.out.println("enter value ");
		int t=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(so[i]==t)
			{
				c++;
			}
		}
		System.out.println("occurence of "+t+" is"+c);
	}

}
