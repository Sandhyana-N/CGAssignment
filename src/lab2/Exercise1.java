package lab2;

public class Exercise1 {
	int getSecondSmallest(int[] arr)
	{
		int temp;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		return arr[arr.length-2];
	}

	public static void main(String[] args) {
		Exercise1 a= new Exercise1();
		int[] arr= {2,4,6,3,7,8};
		a.getSecondSmallest(arr);
		System.out.println("Second Smallest :"+a.getSecondSmallest(arr));
	}

}
