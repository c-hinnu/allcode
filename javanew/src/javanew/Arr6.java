package javanew;

import java.util.Scanner;

public class Arr6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		int m= sc.nextInt();
		int[] ar=new int[m];
		int[] inter=new int[m+n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++)
		{
			ar[j]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(arr[i]==ar[j])
				{
					System.out.println(arr[i]);
					
				}
			}
		}
		/*
		 * for(int i=0;i<n;i++) { System.out.println(inter[i]); }
		 */
		

	}

}
