package lab2;

import java.util.Arrays;

public class Exercise3 {
	static public int[] getSorted(int[] arr) 
	{
		int[] reverse= new int[arr.length];
		int[] result= new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			while(arr[i]!=0)
			{
				int remainder= arr[i]%10;
				reverse[i]=reverse[i]*10+remainder;
				arr[i]=arr[i]/10;
			}
			
		}
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(reverse[i]+ " ");
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arr= {24,12,90};
		getSorted(arr);

	}

}
