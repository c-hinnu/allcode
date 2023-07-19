package javanew;
import java.util.*;


public class Arrmer {

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
		int k=0;
		for(int i=0;i<n;i++)
		{
			mer[k]=arr[i];
			k++;
		}
		for(int i=0;i<m;i++)
		{
			mer[k]=ar[i];
			k++;
		}
		Arrays.sort(mer);
		for(int i=0;i<m+n;i++)
		{
			System.out.println(mer[i]);
		}
		
		
		
		

	}

}
