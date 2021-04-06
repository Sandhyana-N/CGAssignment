package pkg3;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		int n,max;
		Scanner s= new Scanner(System.in);
		System.out.println("enetr the number of elements");
		int num=s.nextInt();
		int a[]=new int[num];
		System.out.println("enter the elements");
		for(int i=0;i<num;i++) {
			a[i]=s.nextInt();
		}
		max=a[0];
		for(int i=1; i<num;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("largest num is:"+ max);

	}

}
