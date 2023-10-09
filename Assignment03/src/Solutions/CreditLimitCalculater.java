package Solutions;

public class CreditLimitCalculater {
	private int accNo;
	
	private int beginBalance;
	
	private int totalCost;
	
	private int totalCredits;
	
	private int creditLimit;

	public CreditLimitCalculater(int accNo, int beginBalance, int totalCost, int totalCredits, int creditLimit) {
		this.accNo = accNo;
		this.beginBalance = beginBalance;
		this.totalCost = totalCost;
		this.totalCredits = totalCredits;
		this.creditLimit = creditLimit;
	}
	
	public void displayBalance()
	{
		int newBalance=(beginBalance+totalCost-totalCredits);
		
		if(newBalance>this.beginBalance) {
			System.out.println("CREDIT LIMIT EXCEEDED.");
			return;
		}
		else {
			System.out.println("NEW BALANCE : "+(this.beginBalance-newBalance));
		}
	}
	
	
}
