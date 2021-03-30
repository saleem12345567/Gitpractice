package Testyantra;

import java.util.HashSet;

public class Occurence {

	public static void main(String[] args) {
	
		String s="india";
		char[] ch=s.toCharArray();//convert to char array
		HashSet<Character> set = new HashSet<Character>();//get only unique char
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

	}

}
