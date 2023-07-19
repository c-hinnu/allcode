package javanew;

import java.util.Scanner;

public class Strrev {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
        String s1=sc.nextLine();
        char[] ch=s1.toCharArray();
        char[] cn=new char[s1.length()];
        for(int i=s1.length()-1;i>=0;i--)     	
        {
        	cn[i]=ch[i];
        	System.out.print(cn[i]);
        }
       
	}

}
