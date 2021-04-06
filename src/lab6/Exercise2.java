package lab6;

import java.util.*;
import java.util.Map.Entry;

public class Exercise2 {
	public Map<Character, Integer> countChars(char[] ch)
	{
		HashMap<Character, Integer> hs= new HashMap<>();
		for(char c:ch)
		{
			if(hs.containsKey(c))
			{
				hs.put(c,hs.get(c)+1);			
			}
			else {
				hs.put(c, 1);
			}
		}
		Set<Entry<Character, Integer>> s=hs.entrySet();
		for(Entry<Character,Integer> entry:s)
		{
			System.out.println(entry);
		}
		return hs;
		
	}

	public static void main(String[] args) {
		Exercise2 e= new Exercise2();
		char[] c={'a','a','b','b','c'};
		e.countChars(c);
		
		

	}

}
