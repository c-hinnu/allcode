package javanew;
import java.util.*;

public class Ana {
	public static boolean areAnagrams(String s1, String s2) {// String s3) {
char[] c1 = s1.toCharArray();
char[] c2 = s2.toCharArray();
//char[] c3 = s3.toCharArray();
Arrays.sort(c1);
Arrays.sort(c2);
//Arrays.sort(c3);
return Arrays.equals(c1, c2);// && Arrays.equals(c1, c3);
		}

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		//String s3 = "vgfde";
		boolean result = areAnagrams(s1, s2); //s3);
		System.out.println(result); // Output: true

	}

}
