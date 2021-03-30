package Testyantra;

import java.util.LinkedHashSet;

public class RemoveDuplicatewords {

	public static void main(String[] args) {
		String s1="Welcome to India Welcome to Mandya";
		String[] s2=s1.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<s2.length;i++)
		{
		
		 set.add(s2[i]);
	    }
		for(String l:set){
			System.out.print(l+" ");
		}

}
}
