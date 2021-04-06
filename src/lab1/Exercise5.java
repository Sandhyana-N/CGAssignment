package lab1;

import java.util.Scanner;

public class Exercise5 {
	static public int calculateSum() {
		int sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println(" enter the value of n");
		int num = sc.nextInt();
		for(int i=0; i<=num; i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		calculateSum();
		

	}

}


