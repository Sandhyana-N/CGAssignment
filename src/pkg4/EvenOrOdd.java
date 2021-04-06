package pkg4;

public class EvenOrOdd {
	 int num;
    void met1(int n) {
    	this.num=n;
    	if(num%2==0) {
    		System.out.println("even");
    	}
    	else
    	{
    		System.out.println("odd");
    	}
    }
	public static void main(String[] args) {
		EvenOrOdd a= new EvenOrOdd();
		a.met1(23);
		

	}

}
