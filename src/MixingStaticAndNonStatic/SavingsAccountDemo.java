package MixingStaticAndNonStatic;

public class SavingsAccountDemo {

	public static void main( String args[]){
		
		SavingsAccount.setInterestRate(0.01);
		SavingsAccount mySavings = new SavingsAccount();
		SavingsAccount yourSavings = new SavingsAccount();
		System.out.println("I deposit $10");
		mySavings.deposit(10);
		System.out.println("I deposit $20");
		yourSavings.deposit(10);
		
		double cash = yourSavings.withrdraw(5);
		System.out.println("You savings are: "+yourSavings.getBalance());
		System.out.print("You savings are: ");
		SavingsAccount.showBalance(yourSavings);
		
		
		
		
		

		
		
	}
}
