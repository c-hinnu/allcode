package javanew;
import java.util.*;

public class mainnew {

	public static void main(String[] args) {
		 Employee e = new Employee();
		    Scanner sc=new Scanner(System.in);
		   System.out.println("Set and Get Employee Information");
		   System.out.println("Menu Driven Application");
		   System.out.println("1. Id Set and Get");
		   System.out.println("2. Name Set and Get");
		   System.out.println("3. Id and Name Set and Get");
		   int c = sc.nextInt();
		   switch(c)
		   {
		       case 1:System.out.println("Enter Employee Id");
		              e.setId(sc.nextInt());
		              int d= e.getId();
		              System.out.println("The given employee id is "+d);
		              break;
		              
		              
		              
		       case 2:System.out.println("Enter Employee Name");
		              sc.nextLine();
	                 e.setName(sc.nextLine());
	                 String s1 = e.getName();
	                 System.out.println("The given employee Name is "+s1);
	                 break;
	                 
		       case 3:System.out.println("Enter Employee Id");
	                 e.setId(sc.nextInt());
	                 System.out.println("Enter Employee Name");
	                 sc.nextLine();
	                 e.setName(sc.nextLine());
	                 System.out.println("Employee Information");
	                 System.out.printf("%-15s%-15s\n","Employee Id","Employee Name");
	                 int y= e.getId();
	                 String s2 = e.getName();
	                 System.out.println(e);
	                 
	                  break;
	                  
		       case 4:System.out.println("Invalid Option");
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
	                 
		   }
		   
			
		}
	}

	class Employee {
		private int id;
		private String name;

		public Employee() {
		}
		public Employee(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return String.format("%-15s%s", id, name);

	}

}
