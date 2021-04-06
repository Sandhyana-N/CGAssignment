package com.cg.eis.exception;
import java.util.Scanner;

public class Excercise3 {
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter sal");
		double sal=sc.nextDouble();
		if(sal<3000)
		{
			try {
				throw new EmployeeException("Employee salary is below 3000");
			}catch(EmployeeException e) {
				e.printStackTrace();
			}
		}
		else
			System.out.println("employee sal:"+" "+sal);
		
		

	}

}
