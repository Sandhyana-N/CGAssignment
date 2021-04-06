package pkg2;

public class Main {

	public static void main(String[] args) {
		Employee.companyName="CG";
		Employee emp1=new Employee("Sandhyana",131788,22000);
		Employee emp2=new Employee("Helen",171398,30000);
		
		
		System.out.println(emp1.name);
		System.out.println(emp1.empID);
		System.out.println(emp1.Sal);
		
		System.out.println(emp2.name);
		System.out.println(emp2.empID);
		System.out.println(emp2.Sal);
		
		

	}

}
