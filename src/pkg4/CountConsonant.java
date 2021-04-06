package pkg4;

public class CountConsonant {
	int getConsonantCount(char[] arr)
	{
		int count=0;
	    int conCount=0;
		
		for(char a:arr)
		{
			switch(a)
			{
			case 'a':
				count+=1;
				break;
			case 'e':
				count+=1;
				break;
			case 'i':
				count+=1;
				break;
			case 'o':
				count+=1;
				break;
			case 'u':
				count+=1;
				break;
			default:
				conCount+=1;
			}
		}
		return conCount;	
	}

	public static void main(String[] args) {
		CountConsonant a=new CountConsonant();
		char[] arr=  {'a','e','r','t','g'};
		a.getConsonantCount(arr);
		System.out.println("ConsonantCount :"+a.getConsonantCount(arr));
		
		

	}

}
