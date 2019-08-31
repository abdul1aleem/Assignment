
public class BankAccount {

	private double balance;
	private String accountNumber;
	
	public double deposit(double amount){
		balance=balance + amount;
		return balance;
	}
	public double withdraw(double amount){
	if(balance>amount)
		{     balance-=amount;
	          return balance;
		}
	else 
		return 0;
	}

public double getBalance(){
	return balance;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount baba=new BankAccount();
		
		
		System.out.println(baba.deposit(1000));
		System.out.println(baba.withdraw(500));
		System.out.println(baba.getBalance());
	}

}
