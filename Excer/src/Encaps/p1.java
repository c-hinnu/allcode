package Encaps;

class Account{
	public int accno;
	public String accname;
	private float balance=2000;


public void withdrawMoney(float amountToWithdraw)
{ if(balance>amountToWithdraw)
{
	balance = balance - amountToWithdraw;
	System.out.println(balance);
	
}
else
{
	System.out.println("insufficient");
}
   

}}
public class p1 {
public static void main(String[] args) {
		
Account a = new Account();
a.accno=1234;
a.accname="chinnu";
a.withdrawMoney(3000);





}

}
