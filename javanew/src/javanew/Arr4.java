package javanew;
import java.util.*;

public class Arr4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] sor=new int[n];
		int temp;
		for(int i=0;i<n;i++)
		{
			sor[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(sor[i]>sor[j])
				{
					temp=sor[i];
					sor[i]=sor[j];
					sor[j]=temp;
					
				}
				
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(sor[i]);
		}
		

	}

}
