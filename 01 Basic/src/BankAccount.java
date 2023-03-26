
public class BankAccount {
	
	int accId;   //instance variables
	String accHolderName, accType;
	double balance;

	static String bankName = "ICICI Bank";
		
	public BankAccount() {
		
	}
	
	public BankAccount(int accId, String accHolderName, String accType,
			double balance) {
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.balance = balance;
	}

	public void withdraw(int amount) {
		balance = balance - amount;
	}
	
	public void credit(int amount) {
		balance = balance + amount;
	}
	
	public void displayAccountDetails() {
		System.out.println("\nAccount ID : " + accId);
		System.out.println("Account holder name : " + accHolderName);
		System.out.println("Account type : " + accType);
		System.out.println("Account balance : " + balance);
	}
	
	public static void displayBankName() {
		System.out.println("\nBank name : " + bankName);
	}
}













