package javanew;

import java.util.Scanner;

public class Arr2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		int max=0;
		int min=100000;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("greatest element is"+max);
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("smallest element is"+min);

	}

}
