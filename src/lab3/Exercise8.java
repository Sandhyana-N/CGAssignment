package lab3;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise8 {
	public static boolean increasingString()
	{
		boolean flag= true;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		
		int n= s.length();
		char[] c= new char[n];
		for(int i=0; i<n; i++)
		{
			c[i]=s.charAt(i);
		}
		Arrays.sort(c);
		for(int i=0; i<n; i++)
		{
			if(c[i]!=s.charAt(i))
			{
				flag=false;
				break;
			}
			else
			{
				flag= true;
			}
		}
		System.out.println(flag);
		return flag;
		
	}

	public static void main(String[] args) {
		increasingString();
		
	

	}

}
