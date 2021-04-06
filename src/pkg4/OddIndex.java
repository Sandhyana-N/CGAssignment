package pkg4;

public class OddIndex {
	
	void meth(int arr[]) {
		for(int i=0; i<arr.length;i+=2)
		{
			System.out.println(arr[i]);
		}
	}
	

	public static void main(String[] args) {
		OddIndex a=new OddIndex();
		int arr[]= {10,20,30,40,50};
		a.meth(arr);
		

	}

}
