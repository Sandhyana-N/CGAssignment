package pkg4;

public class Array {
	int sum=0;
	void sumOfArray(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("sum:"+sum);
			
	}
	void largestOfArray(int[] arr)
	{
		int max=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("largest:"+max);
	}
	void smallestOfArray(int[] arr)
	{

		int min=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("smallest:"+min);
	}

	public static void main(String[] args) {
		Array a=new Array();
		int[] arr= {10,20,30,40,50};
		a.sumOfArray(arr);
		a.largestOfArray(arr);
		a.smallestOfArray(arr);
		

	}

}
