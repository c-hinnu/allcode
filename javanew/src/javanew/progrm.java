package javanew;
import java.io.*;
import java.util.*;
import java.util.Scanner;

interface Stall
{
  public void display();  
}
class GoldStall implements Stall{
	private String stallName;
	private int cost;
	private String ownerName;
	private int tvSet;
	public GoldStall() {
		this.stallName = null;
		this.cost = 0;
		this.ownerName = null;
		this.tvSet = 0;
	}
	
	public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
		this.stallName = stallName;
		this.cost = 0;
		this.ownerName = ownerName;
		this.tvSet = 0;
	}
	public String getStallName() {
		return stallName;
	}

	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public int getTvSet() {
		return tvSet;
	}

	public void setTvSet(int tvSet) {
		this.tvSet = tvSet;
	}
	public void display()
	{
	    System.out.println(stallName+" "+cost+" "+ownerName+" "+tvSet);
	}
	
}

public class progrm {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    GoldStall  g = new  GoldStall(); 
		    int n=sc.nextInt();
		    sc.nextLine();
		   String sn = sc.nextLine();
		   int c = sc.nextInt();
		   sc.nextLine();
		   String on = sc.nextLine();
		   int ts=sc.nextInt();
		   
		 
		   
		   switch(n)
		    {
		        case 1:g.setStallName(sn);
		               g.setCost(c);
		               g.setOwnerName(on);
		               g.setTvSet(ts);
		               g.display();
		               break;
		            
		    }
		    
		    
		    

		    }
		}



