package javanew;
import java.util.Scanner;

public class pgm4 {

	public static void main(String[] args) {
		String s1,s2,s3;
		System.out.println("enter first string");
		Scanner s = new Scanner(System.in);
		s1=s.nextLine();
		System.out.println("enter second string");
		s2=s.nextLine();
		s3=s1+s2;
		System.out.println(s3);

	}

}
