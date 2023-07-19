package Encaps;
class Accountn
{
	public int accno;
	public String accname;
	private float balance=2000;


public void withdrawMoney(float amountToWithdraw)

{ if(balance > amountToWithdraw)
{
	balance = balance - amountToWithdraw;
	System.out.println(balance);
	
}
else
{
	System.out.println("insufficient");
}
	
}
class SBAccount extends Accountn
{
	float tenure;
	boolean autoRenewal;
}
class FDAccount extends Accountn
{
	float tenure;
	boolean autoRenewal;
	
	
	
}
class CurrentAccount  extends Accountn
{
	float overDraftLimit;
}
class LoanAccount  extends Accountn
{
	float emi;
	float loanOutStanding;
	float tenure;
	
}
	/*
	 * class InterestCalculator {
	 * 
	 * }
	 */

public class p2 {

	public static void main(String[] args) {
		

	}

}}
