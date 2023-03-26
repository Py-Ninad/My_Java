
public class BankAcc {
	
	int accId;
	String accHolderName, accType;
	double balance;
	
	static String bankName;
	static int accIdGenerator;
	
	public BankAcc() {
		this.accId = ++accIdGenerator;
	}

	public BankAcc(String accHolderName, String accType, double balance) {
		this.accId = ++accIdGenerator;
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
	
	public void displayBankAccDetails() {
		System.out.println("\nAccount ID : " + accId);
		System.out.println("Account holder name : " + accHolderName);
		System.out.println("Account type : " + accType);
		System.out.println("Account balance : " + balance);
	}
	
	public static void displayBankName() {
		System.out.println("\nBank Name : " + bankName);
	}

	static {
		bankName = "ICICI Bank";
		accIdGenerator = 1000;
	}
	
	
}






















