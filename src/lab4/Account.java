package lab4;
import java.util.Scanner;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;
	
	Account(){}
	Account(long accNum, double balance, Person accHolder)
	{
		this.accNum= accNum;
		this.balance=balance;
		this.accHolder=accHolder;
	}
	Account(String name, int age, long accNum,double balance, Person accHolder)
	{
		this.accNum=accNum;
		this.balance=balance;
		this.accHolder=accHolder;
	}
	
	void deposit(double d)
	{
		System.out.println("Amount is deposited");
		balance=balance+d;
	}
	void withdraw(double w)
	{
		System.out.println("amount is withdrawn");
		balance=balance-w;
	}
	double getBalance()
	{
		return balance;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
