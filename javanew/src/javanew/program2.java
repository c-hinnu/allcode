package javanew;

import java.io.*;
import java.util.*;

class Hal {
	private String name;
	private String contactNumber;
	private Double costPerDay;
    private String ownerName;
public String toString()
{
return String.format("%-20s%-20s%-20s%-20s",getName(),getContactNumber(),getCostPerDay(),getOwnerName());
}
public String getName() {
return name;
}

public void setName(String name)
{
this.name = name;
}

public String getContactNumber() 
{
return contactNumber;
}

public void setContactNumber(String contactNumber)
{
this.contactNumber = contactNumber;
}

public Double getCostPerDay()
{
return costPerDay;
}

public void setCostPerDay(Double costPerDay) 
{
this.costPerDay = costPerDay;
}

public String getOwnerName()
{
return ownerName;
}

public void setOwnerName(String ownerName) 
{
this.ownerName = ownerName;
}

public Hal() {
this.name = null;
this.contactNumber = null;
this.costPerDay = (double) 0;
this.ownerName = null;
}

public Hal(String name, String contactNumber, Double costPerDay, String ownerName) {
this.name = name;
this.contactNumber = contactNumber;
this.costPerDay = costPerDay;
this.ownerName = ownerName;
}
}

class HallBO {
	
public List<Hal> getHallList()
{
return null;
}
public void displayAll(List<Hal> ha)
{
for(Hal h1:ha)
{
 System.out.println(h1);
}
}
}

public class program2 
{

	public static void main(String[] args) 
{

		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 sc.nextLine();
		 HallBO hallbo=new HallBO();
		 List<Hal> halls=new ArrayList<Hal>();
	     String name,contactNumber;
		 Double costPerDay;
		 String ownerName;
		 for(int i=0;i<n;i++)
		 {
		 name=sc.nextLine();
		 contactNumber=sc.nextLine();
		 costPerDay=sc.nextDouble();
		 sc.nextLine();
		 ownerName=sc.nextLine();
		 halls.add(new Hal(name,contactNumber,costPerDay,ownerName));
         }

		 System.out.printf("%-20s%-20s%-20s%-20s\n","Name","Contact Number","Cost per Day","Owner Name");
		 hallbo.displayAll(halls); 
}
	}
	

