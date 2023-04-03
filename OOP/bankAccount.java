package OOP;

public class bankAccount {
	
	//what a bank account must have
	
	//instance variables
	private String accountNumber;
	private static final String routingNumber ="015489";
	private String name;
	private String id;
	private String accountType;
	private double balance;
	
	//constructor definition : unique methods
		//1.use to define set up properties of an object
		//2.constructors ar call upon instanciation
		//3.the same name as the class itself
		//4.cunstoctors have no return type 
	bankAccount(){
		System.out.println("new account has been created");
	}
	
	//overloading call the same method with diferent arguments
	bankAccount(String accountType){
		System.out.println("new account created: "+ accountType);
		
	}
	//initDeposit,msg, accountType (local variables)
	bankAccount(String accountType, double initDeposit){
		System.out.println("new account created: "+ accountType);
		System.out.println("you have deposit : $" + initDeposit);
		String msg = null;
		if(initDeposit < 1000) {
			msg = "Error initial deposit must be minimum $1000";
			
		} else {
			 msg = "thank you for your Deposit of $"+ initDeposit;
			
		}
		System.out.println(msg);
		balance = balance+initDeposit;
	}
	
	
	
	
	//bank account methods
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("Deposit");
	}
	
	//getters and setters
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static String getRoutingnumber() {
		return routingNumber;
	}

	public void withdraw(double amount) {
		balance = balance + amount; 
		showActivity("withdraw");
		
	}
	
	private void showActivity(String activity) {
		System.out.println("your recent transaction : "+ activity);
		System.out.println("your new balance is $"+ balance);
	}
	
	public void checkBalance() {
		System.out.println("balance : " + balance );
	}
	
	public void getStatus() {
		
	}
	

}
