package javanew;
import java.util.*;
 class Em {
	
	public int employeeId;
	
	public  String name;
	
	public int causalLeaves;
	
	public String designation;
	
	public float salary;
	
	 
	public void updateCaualLeave(int leaveApplied) {
		
		if (leaveApplied > causalLeaves) {
			
			System.out.println("You have insufficient leave balance");
		}
		else {
			this.causalLeaves = this.causalLeaves-leaveApplied;
		
			System.out.println("You have " + causalLeaves+ " causal leaves");
		
		}
		
	}

	
	
	
	

}


public class emp1 {

	public static void main(String[] args) {
     Em employee = new Em();
		
		employee.employeeId=1000;
		employee.name="Kumar";
		employee.designation = "Developer";
		employee.salary = 50000;
		employee.causalLeaves=20;
		
		
		employee.updateCaualLeave(2);
		employee.updateCaualLeave(1);
		employee.causalLeaves=40;
		employee.updateCaualLeave(1);
		
	}

}
