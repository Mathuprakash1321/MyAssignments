package week3.day1;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String Name="MathiMozhi";
	     String output="";
	     //Duplicate e,i,n,
	     char[] ch = Name.toCharArray();
	     Set<Character> name=new HashSet<Character>();
	     for (Character i : ch) {
	    	 if(name.add(i))
	        
		output=output+i;
	     
		}
	     System.out.println(name);
	 	System.out.println(output);
	}

}




