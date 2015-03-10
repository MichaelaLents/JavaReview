package MixingStaticAndNonStatic;
/**
 * @author michaela
 *  Class with static and nonstatic members
 *
 */

public class SavingsAccount {

	private double balance; 
	public static double interestRate = 0;
	public static int numberOfAccounts = 0;
	
	//Default Constructor
	public SavingsAccount(){
		balance = 0;
		numberOfAccounts++;
	}
	
	public static void setInterestRate(double newRate){
		interestRate = newRate;
	}
	
	public static double getInterestRate(){
		return interestRate;
	}
	
	public static int getNumberOfAccounts(){
		return numberOfAccounts;
	}
	
	public void deposit(double amount){
		balance +=amount;
	}
	
	public double withrdraw(double amount){
		if(balance <amount){
			amount = 0;
		}else{
			balance -=amount;
		}
		return balance;
	}
	
	public void addInterest(){
		double interest = balance *getInterestRate();
		balance +=interest;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public static void showBalance(SavingsAccount account){
		System.out.println("Account balance: "+account.getBalance());
	}
	
}
