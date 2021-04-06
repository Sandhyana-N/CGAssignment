package lab3;

import java.util.Scanner;

public class Exercise2 {
	public static String getImage(String str)
	{
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		System.out.println(str+"|"+sb);
		return "s";

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string");
		String s= sc.next();
		
		getImage(s);
	
		
		

	}

}
