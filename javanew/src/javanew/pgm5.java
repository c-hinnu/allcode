package javanew;
import java.util.Scanner;

public class pgm5 {

	public static void main(String[] args) {
		String s="java";
		String empty="";
		char c;
		for(int i=0;i<s.length();i++)
		{
		c=s.charAt(i);
		empty=c+empty;
		}
		System.out.println(empty);
	
	}
}


