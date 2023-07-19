package javanew;
import java.util.Scanner;

public class pgm6 {

	public static void main(String[] args) {
		
		String s="java";
		int n;
		char ch[] = s.toCharArray();
		System.out.println("enter index");
		Scanner sca = new Scanner(System.in);
		n=sca.nextInt();
		for(int i=0;i<s.length();i++)
		{
			if(i == n)
			{
				System.out.println(ch[i]);
			}
		}
	

		
		
		

		}}

	


