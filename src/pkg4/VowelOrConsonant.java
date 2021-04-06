package pkg4;

public class VowelOrConsonant {

	void meth(char c)
	{
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'||c=='A'|| c=='E' ||c=='I' || c=='O' || c=='U') {
			System.out.println("given letter is vowel");
		}
		else
		{
			System.out.println("given letter is consonant");
		}

	}


	public static void main(String[] args) {
		VowelOrConsonant a= new VowelOrConsonant();
		a.meth('x');

	}

}
