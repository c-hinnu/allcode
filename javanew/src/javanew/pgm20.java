package javanew;
import java.util.*;
public class pgm20 {

	public static void main(String[] args) {
	    System.out.println("Enter the string");
        Scanner sc = new Scanner(System.in);
        int c=0;
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
        	
            for(int j=i+1;j<s.length();j++)
            {
            	if(ch[i]==ch[j])
            	{
                    c++;
                    break;
                    
                    
            	}
            	  System.out.println("Char: "+ch[i]+ " Count: "+c+ " times.");
              	c=0;
            	
                
            }
          

            
           
            
        }
        
        
    }
}