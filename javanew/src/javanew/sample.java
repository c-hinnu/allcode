package javanew;

import java.util.Arrays;

public class sample {

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
String[] ch= {"c","h","i","n","n","u"};
		int i,len=ch.length,j;
		for(i=0;i<len-1;i++)
		{
			int count=1;
			str.append(ch[i]);
			for(;;i++)
{
if(ch[i]!=ch[i+1])
{
 break;
}
else
 {
 count++;
}
 }
if(count>=2){
 str.append(count);
}
}
str.append(ch[i]);
String singleString = str.toString();
System.out.println(singleString); 
	}}

	
