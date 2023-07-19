package javanew;

import java.util.Scanner;

public class pgm21 {

	public static void main(String[] args) {
		  System.out.println("Enter the number of rows");
	        System.out.println("Enter the number of  columns");
	        System.out.println("Enter 6 elements 1 by 1");
	        System.out.println("Before Square");
	        Scanner sc = new Scanner(System.in);
	        int r = sc.nextInt();
	        int c = sc.nextInt();
	        int[][] arr=new int[r][c];
	        for(int i=0;i<r;i++)
	        {
	        	for(int j=0;j<c;j++)
	        	{
	        		 arr[i][j]=sc.nextInt();
	        	}
	        }
	        for(int i=0;i<r;i++)
	        {
	        	for(int j=0;j<c;j++)
	        	{
	        		 System.out.print(arr[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	        System.out.println("After Square");
	        for(int i=0;i<r;i++)
	        {
	        	for(int j=0;j<c;j++)
	        	{
	        		 System.out.print(arr[i][j]*arr[i][j]+" ");
	        	}
	        	System.out.println();
	        }
	        
	        

	}

}
