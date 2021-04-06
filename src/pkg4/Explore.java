package pkg4;

public class Explore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1= new String("Sandhyana");
		String str2= new String("SANDHYANA");
		System.out.println(str1.length());// length of the string
		System.out.println(str1.isEmpty());// string is empty or not
		System.out.println(str1.charAt(0));// to print particular index
		System.out.println(str1.codePointAt(0));
		System.out.println(str1.equals(str2));// to compare string if its equal
		System.out.println(str1.contentEquals(str2));// to check if its equal
		System.out.println(str1.equalsIgnoreCase(str2));// case ignored to check if its equal
		System.out.println(str1.compareTo(str2)>0);//compare
		System.out.println(str1.startsWith(str2));
		System.out.println(str1.endsWith(str2));
		System.out.println(str1.indexOf("d"));// to find the index position
		System.out.println(str1.lastIndexOf("a"));// last index position
		System.out.println(str1.replace("S", "h"));// replacing chars
		System.out.println(str1.toUpperCase());
		System.out.println(str1.valueOf("a"));

	}

}
