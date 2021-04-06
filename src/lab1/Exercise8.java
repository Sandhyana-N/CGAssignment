package lab1;
import java.util.Scanner;

public class Exercise8 {
	public static boolean checkNumber(int n)
	{
		if (n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int a=sc.nextInt();
		checkNumber(a);
		System.out.println(checkNumber(a));
		

	}

}
