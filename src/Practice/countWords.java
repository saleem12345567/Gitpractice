package Practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class countWords {

	public static void main(String[] args) {
	
	/*	String s="india";
		char[] ch=s.toCharArray();//convert to char array
		HashSet<Character> set = new HashSet<Character>();//get only unique char in alphabetical order
		for(int i=0;i<ch.length;i++){
			set.add(ch[i]);
		}
		for(Character character :set){//compare
			int count=0;
			for(int i=0;i<ch.length;i++){
				if(character==ch[i])
				{
					count++;
				}
			}
		
			System.out.println(character+" "+count);
			
		}
*/
	
		String s="hello world hello city ";
		String[] ch = s.split(" ");//convert to char array
		HashSet<String> set = new HashSet<String>();//create a set and get only unique char
		for(int i=0;i<ch.length;i++){
			set.add(ch[i]);
		}
		for(String str :set){//compare
			int count=0;
			for(int i=0;i<ch.length;i++){
				if(str==ch[i])
				{
					count++;
				}
			}
		
			System.out.print(str+" "+count);
			
		}
		
	}

}
