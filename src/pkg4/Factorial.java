package pkg4;

public class Factorial {
	int num;
	void meth1(int n)
	{
		this.num=n;
		int fact=1;
		for(int i=num; i>1; i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Factorial a= new Factorial();
		a.meth1(5);

	}

}
