package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		String s= "PayPal India";
		String output="";
		char[] ch = s.toCharArray();

		Set<Character> chSet=new HashSet<Character>();
		Set<Character> dupCharSet=new HashSet<Character>();
		
		for (Character i : ch) 
		{
			if (chSet.add(i)) 
			{
				output=output+i;
				}
			
		else
		{
			dupCharSet.add(i);
		}
		}
		System.out.println("String after removing duplicates is: " +output);
	}
}


