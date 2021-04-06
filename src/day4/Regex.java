package day4;
import java.util.regex.*;

public class Regex {

	public static void main(String[] args) {
		Pattern pattern1=Pattern.compile("Mrs.");
		Pattern pattern2=Pattern.compile("Mr.");
		Pattern pattern3=Pattern.compile("[mM]rs?\\.");
		Pattern pattern4=Pattern.compile("\\d{3}-\\d{8}");
		Pattern pattern5=Pattern.compile("\\+\\s91\\s(\\d{2})\\s\\d{4}\\s\\d{4}\\s(.*)");
		Pattern pattern6=Pattern.compile("\\d{3}\\s\\d{3}\\s\\d{5}\\s(.*)");
		Pattern pattern7=Pattern.compile("[A-Z]{2}NL");
		
		Matcher matcher1=pattern1.matcher("Mrs.");
		Matcher matcher2=pattern2.matcher("Mr.");
		Matcher matcher3=pattern3.matcher("Mrs.");
		Matcher matcher4=pattern4.matcher("020-26231407");
		Matcher matcher5=pattern5.matcher("+ 91 20 2623 1407 (International call rates applicable)");
		Matcher matcher6=pattern6.matcher("613 701 98270 (Toll Number) #");
		Matcher matcher7=pattern7.matcher("MTNL");
		
		if(matcher1.find())
		{
			System.out.println(matcher1.group());
		}
		else
		{
			System.out.println("Match not found");
		}
		
		if(matcher2.find())
		{
			System.out.println(matcher2.group());
		}
		else
		{
			System.out.println("Match not found");
		}
		
		if(matcher3.find())
		{
			System.out.println(matcher3.group());
		}
		else
		{
			System.out.println("Match not found");
		}
		
		if(matcher4.find())
		{
			System.out.println(matcher4.group());
		}
		else
		{
			System.out.println("Match not found");
		}
		
		if(matcher5.find())
		{
			System.out.println(matcher5.group());
			System.out.println(matcher5.group(1));
		}
		else
		{
			System.out.println("Match not found");
		}
		
		if(matcher6.find())
		{
			System.out.println(matcher6.group());
		}
		else
		{
			System.out.println("Match not found");
		}
		
		if(matcher7.find())
		{
			System.out.println(matcher7.group());
		}
		else
		{
			System.out.println("Match not found");
		}
		
}}
