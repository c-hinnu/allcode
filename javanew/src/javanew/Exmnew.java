package javanew;

public class Exmnew {
	

	public static void main(String[] args) {
		int year=1000;		
		int[] ar={1,3,4,5,6};
		int i,t,r,flag;		
		for( i=year;i<i+1;i++)
		{
			t=i;
			flag=0;
			while(t>0)
			{
				r=t%10;
				for(int j=0;j<ar.length;j++)
				{
					if(r==ar[j])
					{
						flag=1;
						//System.out.println("gh");
					}
				}
				t=t/10;
			//	System.out.println("ghf");
				
			}
			if(flag==0)
			{
				
				System.out.println(i);
				break;
				
			}
			
		}
		
		
		

	}

}
