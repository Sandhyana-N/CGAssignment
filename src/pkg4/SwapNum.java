package pkg4;

public class SwapNum {
	int a,b,c;
	void meth(int a, int b)
	{
		c=a;
		a=b;
		b=c;
		System.out.println("x="+a);
		System.out.println("y="+b);
		
	}

	public static void main(String[] args) {
		SwapNum a= new SwapNum();
		a.meth(10,20);

	}

}
