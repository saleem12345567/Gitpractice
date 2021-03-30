package Practice;

import java.util.LinkedHashSet;

public class removeDuplicate {
	
	
		
		public static void main(String[] args) {
			/*
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
		
	}*/
		
		
     String s="Welcome to india Welcome to mandya";
    String[] ch = s.split(" ");
     
     
     LinkedHashSet<String> set = new LinkedHashSet<String>();//hashset doesnt allow duplicates and gives the alphabets as input
		for(int i=0;i<ch.length;i++)
		{
			set.add(ch[i]);
		}
		System.out.println(set);
	

 for(String l:set){
 System.out.print(l+ " ");
	
}
	
}
   
     		
}
