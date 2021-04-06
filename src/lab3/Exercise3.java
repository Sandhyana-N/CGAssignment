package lab3;
import java.util.Scanner;
public class Exercise3 {

	
	String alterString(String str)
	{
		String st = "";
		int num=0;
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' )
			{
				st+=ch;
			}
			else
			{
				num=1+(int)ch;
				st=st+(char)num;
			}
		}
		return st;
	}

	public static void main(String[] args) {
		Exercise3 e=new Exercise3();
		Scanner sc= new Scanner(System.in);
		System.out.print("enter string");
		String s=sc.next();
		
		System.out.println(e.alterString(s));
	
		
		

	}

}
