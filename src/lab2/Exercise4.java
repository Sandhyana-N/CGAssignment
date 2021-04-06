package lab2;
import java.util.Arrays;

public class Exercise4 {
	 static int[] modifyArray(int[] array)
	{
		 int j=0;
		 int[] array1= new int[array.length];
		 Arrays.sort(array);
		 for(int i=0; i<array.length-1; i++)
		 {
			 if(array[i]!=array[i+1])
					 {
				       array[j]=array[i];
				       j++;
					 }
		 }
		 array[j]= array[array.length-1];
		 for(int i=j; i>=0; i--)
		 {
			 System.out.println(array[i]);
		 }
		 
		 return array1;
	    }  
	       
	    public static void main (String[] args) {  
	    	int[] array= {10,33,52,56};
	    	modifyArray(array);
	    }
}
 
		
		
		

	
