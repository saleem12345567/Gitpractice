package Testyantra;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String s="india";
		char ch[]=s.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();//hashset doesnt allow duplicates
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		System.out.println(set);
	

    for(Character l:set){
    System.out.print(l);
	
}
}
}
