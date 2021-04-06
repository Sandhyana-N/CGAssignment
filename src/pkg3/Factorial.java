package pkg3;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int fact=1;
		Scanner s= new Scanner(System.in);
		System.out.println("enetr the number");
		int num=s.nextInt();
		for(int i=num;i>1; i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);

	}

}
