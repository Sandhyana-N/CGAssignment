package lab3;
import java.util.*;
public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter numbers separated by comma:");
		String s=sc.next();
		StringTokenizer st= new StringTokenizer(s,",");
		int sum=0;
		while(st.hasMoreTokens())
		{
			int n=0;
			n=Integer.parseInt(st.nextToken());
			System.out.println("interger is:"+n);
			sum=sum+n;
		}
		System.out.println("sum of integers:"+sum);
	}

}
