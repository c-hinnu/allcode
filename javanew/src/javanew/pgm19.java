package javanew;
import java.util.*;

public class pgm19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String s1=sc.nextLine();
		int c=0;
		String s;
		for(int i=0;i<n;i++)
		{
		 s=sc.nextLine();
		// System.out.println(s);
		char[] ch = s.toCharArray();
		for(int j=0;j<s.length();j++)
		{
		if(Character.isLowerCase(ch[j]))
		{		
		c++;
		}
		}
	   if(c==s.length())
	   {
	   System.out.println("FOUND! Sequences of lowercase");
	   }
	   else
	   {
	   System.out.println("NOT FOUND! sequences of lowercase");
	   }
	   c=0;
	   }	
	}

}
