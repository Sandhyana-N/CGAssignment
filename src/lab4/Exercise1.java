package lab4;

public class Exercise1 {

	public static void main(String[] args) {
		
		Person p1= new Person("Smith", 22);
		Person p2= new Person("Kathy", 23);
		
		Account acc1=new Account(1000000001L,2000, p1);
		Account acc2=new Account(1000000002L,3000, p2);
		
		p1.acc=acc1;
		p2.acc=acc2;
		
		acc1.deposit(2000);
		acc2.withdraw(2000);
		
		System.out.println("Smith's Balance"+" "+acc1.getBalance());
		System.out.println("Kathy's Balance"+" "+acc2.getBalance());
		
		
		SavingsAccount sa=new SavingsAccount();
		sa.withdraw(2000);
		
		CurrentAccount ca=new CurrentAccount(2500);
		ca.withdraw(2000);
		
				
				
	}

}
