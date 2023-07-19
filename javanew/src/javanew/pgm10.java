package javanew;

public class pgm10 {

	public static void main(String[] args) {
		String s="chinnu thilakan ";
		int c = 0;
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i] == 'n')
			{
				c++;
			}
			
		}
		System.out.println("occurence is"+" "+c);


	}

}
