package lab1;
import java.util.Scanner;
public class Exercise6 {
	public static int calculateDifference()
	{
		int sum=0;
		int temp=0;
		int sum1=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of n");
		int num=sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			temp=temp+(i*i);
		}
		for(int i=1; i<=num; i++)
		{
			sum=(sum+i);
		}
		sum=sum*sum;
		sum1=temp-sum;
		System.out.println(sum1);
		return sum1;
		
	}
	public static void main(String[] args)
	{
		calculateDifference();
		
		
	}

}
