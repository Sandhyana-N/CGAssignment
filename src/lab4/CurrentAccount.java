package lab4;
import java.util.Scanner;
public class CurrentAccount extends Account{
	double overDraftLimit;
	CurrentAccount(double od)
	{
		this.overDraftLimit=od;
	}
	@Override
	void withdraw(double w)
	{
		boolean flag=true;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter overdraft limit");
		double a=sc.nextDouble();
		if(w>a)
		{
			flag=true;
		}
		else {
			flag=false;
		
		}
		System.out.println("Overdraft limit is reachd:"+" "+flag);
	}

}
