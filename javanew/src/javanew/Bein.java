package javanew;
import java.util.*;

public class Bein {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s1=sc.nextLine();
		char[] cv=s1.toCharArray();
		System.out.println("enter index");
		int t=sc.nextInt();
		for(int i=0;i<s1.length();i++)
		{
			if(t==i)
			{
				System.out.println("character before specified index :");
				System.out.println(cv[i-1]);
			}
		}
		
		

	}

}
