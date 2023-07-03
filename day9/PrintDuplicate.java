package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicate 
{


	
	public static void main(String[] args) {
		
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		
		
		 Set<Integer> hs = new LinkedHashSet<Integer>();
		 Set<Integer> hs1 = new LinkedHashSet<Integer>();
		 
		 
	for (Integer i : data) 
	{
		
			boolean add = hs.add(i);
			if(!add)
				hs1.add(i);
	
							
	}

		System.out.println(hs);
		System.out.println(hs1);
	

}
}
