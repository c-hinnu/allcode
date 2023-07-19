package javanew;
import java.util.*;

public class Strcou {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		char[] cn=s1.toCharArray();
		int c=0;
		for(int i=0;i<s1.length();i++)
		{
			if(cn[i]==' ')
			{
				c++;
			}
		}
		System.out.println(c+1);

	}

}
