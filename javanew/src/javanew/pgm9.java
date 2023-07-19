package javanew;
import java.util.*;

public class pgm9 {

	public static void main(String[] args) {
		String s="chinnu thilakan ";
		String empty="";
		char c;
		String[] newstr = s.split("\\s");
		for(String str: newstr)
		{
		for(int i=0;i<str.length();i++)
		{
			c=str.charAt(i);
			empty=c+empty;
			
			}
		System.out.print(empty+" ");
		empty=" ";
		}
			
		
		}
		
		

	}



