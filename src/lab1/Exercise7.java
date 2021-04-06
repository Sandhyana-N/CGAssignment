package lab1;
import java.util.Scanner;

public class Exercise7 {
	public static boolean checkNumber(int num)
	{
		boolean flag=false;
		while(num>0)
		{
			int lastdigit= num%10;
			num=num/10;
			int nextLastDigit=num%10;
			if (lastdigit>nextLastDigit)
			{
				flag= true;
			}
			else
			{
				flag=false;
				break;
			}
		}
		return flag;
		
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter number");
		int a=sc. nextInt();
		checkNumber(a);
		System.out.println(checkNumber(a));

		}

	}


