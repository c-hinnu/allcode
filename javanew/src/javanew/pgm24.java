package javanew;

import java.util.*;

public class pgm24 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		char[] ch1 = str.toCharArray();
		char[] ch = new char[50];
		int k = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((ch1[i] != ' ') && (ch1[i] != ',') && (ch1[i] != '-')) {
				ch[k] = ch1[i];
				k++;
			}
		}
		int c = 0;
		for (int i = 0; i < k; i++) {
			for (int j = i + 1; j < k; j++) {
				if (ch[i] == ch[j] && ch[j] != '\0') {
					c++;
					ch[j] = '\0';
				}
			}
			if (c > 0) {
				System.out.println("Char: " + ch[i] + ", Count: " + (c + 1) + " times.");
			}
			c = 0;

		}
	}
}
