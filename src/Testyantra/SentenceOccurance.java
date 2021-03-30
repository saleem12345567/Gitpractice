package Testyantra;

import java.util.LinkedHashSet;

public class SentenceOccurance {

	public static void main(String[] args) {
		
			String s="Welcome to india Welcome to Mandya";
			String[] ch = s.split(" ");
			LinkedHashSet<String> set = new LinkedHashSet<String>();
			for(int i=0;i<ch.length;i++){
				set.add(ch[i]);
			}
for(String str:set)
{
	int count=0;
	for(int i=0;i<ch.length;i++){
		if(str.equals(ch[i])){
			count++;
		}
		
		
	}
	//System.out.println(count);
	
	//to count duplicate
	if(count>1)
	{
		
		
		System.out.println(str+" "+count);
	}
	
	//
	
}

	}

}
