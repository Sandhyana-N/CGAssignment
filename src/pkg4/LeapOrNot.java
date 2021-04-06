package pkg4;

public class LeapOrNot {
	int year;
	void meth(int year)
	{
		this.year=year;
		if(year%4==0 && year%100!=0)
		{
			System.out.println("leap year");
		}
		else if(year%400==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
	}

	public static void main(String[] args) {
		LeapOrNot a= new LeapOrNot();
		a.meth(2021);

	}

}
