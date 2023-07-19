package javanew;
import java.util.*;

public class Exm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter limit");
		int n=sc.nextInt();
		System.out.println("enter elements");
		List<Integer> re=new ArrayList<Integer>();
		//int[] re=new int[n];
		int c=0;
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			re.add(a);
		}
		System.out.println("enter element to search");
		int t=sc.nextInt();
		for(int i=0;i<re.size();i++)
		{
			if(t==re.get(i))
			{
				c++;
			}
		}
		System.out.println("occurence is: "+c);
			

	}

}
