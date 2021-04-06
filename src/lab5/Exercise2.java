package lab5;
import java.util.Scanner;

public class Exercise2 {
	String fname;
	String lname;
	public Exercise2(String fname, String lname) {
		this.fname=fname;
		this.lname=lname;
	{
      if (fname.length()==0 || lname.length()==0)
      {
    	 try {
    		 throw new NameException(" first name and last name shouldn't be blank");
    		 
    	 }catch(NameException e) {
    		 e.printStackTrace();
    	 }
      }
    	  
	}
	
	}
	void display() {
		System.out.println("Employee name:"+this.fname+" "+this.lname);
	}
	public static void main(String[] args) {
		String fname=null;
		String lname=null;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter fname");
		String str1=sc.nextLine();
		System.out.println("enter lname");
		String str2=sc.nextLine();
		Exercise2 a= new Exercise2(str1,str2);
		a.display();
		

	}

}
