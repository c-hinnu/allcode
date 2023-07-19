package javanew;
import java.util.*;

public class pgm14 {

	public static void main(String[] args) {
	
		int[]array = new int[6];
		Scanner a = new Scanner(System.in);
		  for(int i=1;i<6;i++)
		  {
			  array[i]=a.nextInt();
		  }
		  
		  for(int i=0;i<6;i++)
		  {
			  for(int j=i+1;j<6;j++)
			{
				if(array[i]==array[j]) 
					
				{
				
				System.out.println(array[i]);
				
				
				
				
				
			    }
			
		  }
			  
			  
		
		

	}

}}
