package javanew;
import java.util.*;
class Sa{
	
	public int employeeId;
	
	public  String name;
	
	private int causalLeaves=20;
	
	private int carryForward;
	
	public String designation;
	
	public float salary;
	
	
	public void carryForwardLeaves( int leavesToCarryForward){
		
		
		carryForward = leavesToCarryForward;
		
		
	}
	
	 
	public void updateCaualLeave(int leaveApplied) {
		
		if (leaveApplied > (causalLeaves+carryForward)) {
			
			System.out.println("You have insufficient leave balance");
		}
		else {
			this.causalLeaves = this.causalLeaves-leaveApplied;
		
			System.out.println("You have " + causalLeaves+ " causal leaves");
		
		}
		
	}

	
	
	
	

}

public class emp2 {

	public static void main(String[] args) {
Sa employee = new Sa();
		
		employee.employeeId=1000;
		employee.name="Kumar";
		employee.designation = "Developer";
		employee.salary = 50000;
		//employee.causalLeaves=20;
		
		
		employee.updateCaualLeave(2);
		employee.updateCaualLeave(1);
		//employee.causalLeaves=20;
		employee.updateCaualLeave(1);
		
		

	}

}
