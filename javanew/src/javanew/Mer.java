package javanew;

import java.util.Arrays;
import java.util.Scanner;

public class Mer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		int m= sc.nextInt();
	    int[] ar=new int[m];
		int[] mer=new int[m+n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<m;j++)
		{
			ar[j]=sc.nextInt();
		}
		Arrays.sort(mer);
		for(int i=0;i<m+n;i++)
		{
			System.out.println(mer[i]);
		}
		
		
		
		

	}

}
