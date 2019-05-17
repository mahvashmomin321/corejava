package main;

public class MmBank{
	private String accountHolderName;
	private double accountBalance;
	private double accountNumber;
	private static final double AvailAccountNumber=1000;
	
	public MmBank(){
	}

	public MmBank(String accountHolderName,double accountBalance){
		this.accountHolderName=accountHolderName;
		this.accountBalance=accountBalance;
	} 	

	public double withDraw(double amount){
		if(this.accountBalance>amount){
				this.accountBalance=this.accountBalance-amount;
		}
		else {
				this.accountBalance=accountBalance;
		}
		return this.accountBalance;
	}

	public double deposit(double amount){
		this.accountBalance=this.accountBalance+amount;
		return this.accountBalance;
	}
}