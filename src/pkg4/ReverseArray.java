package pkg4;

public class ReverseArray {
	void methodReverse(int[] arr)
	{
		System.out.println("Reversed Array:");
		for(int i=arr.length-1; i>=0 ; i--)
		{
			
			System.out.print(arr[i]+" ");
		}

	}

	public static void main(String[] args) {
		ReverseArray a= new ReverseArray();
		int[] arr = {10,20,30,40,50};
		a.methodReverse(arr);
		
		

	}

}
