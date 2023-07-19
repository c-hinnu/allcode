package javanew;

public class RepeatFirstChar {

	public static void main(String[] args) {
       String s="abhijith";
       int k=0;
       char[] c=s.toCharArray();
       for(int i=0;i<s.length();i++)
       {
    	   for(int j=i+1;j<s.length();j++)
    	   {
    		   if(c[i]==c[j])
    		   {
    			   k=1;
    			   System.out.println(c[i]);
    			   
    		   }
    		   //if(k==1)
    			  // break;
    			   
    	   
    	   }
    	   if(k==1)
			   break;
			   
    	   
       }
	}

}
