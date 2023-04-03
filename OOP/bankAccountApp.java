package OOP;

public class bankAccountApp {

	public static void main(String[] args) {
		// creating a new bank account
		
		bankAccount acc = new bankAccount();
		bankAccount acc1 = new bankAccount("Savings account");
		bankAccount acc2 = new bankAccount("Checkings account , 600");
		
		//demo for inheritance
		cdAccount cd1 = new cdAccount();
		cd1.setAccountNumber("0015486");
		cd1.setBalance(1000);
		cd1.setName("Roger");
		cd1.setBalance(1000);
		System.out.println(cd1.getName());
		cd1.deposit(500);
		cd1.deposit(200);
		cd1.withdraw(100);
	}

}
