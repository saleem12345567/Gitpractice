package Practice;

import java.util.LinkedHashSet;

public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="india";
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> set=new LinkedHashSet<>();
		for(int i=0;i<ch.length;i++){
			set.add(ch[i]);//store s[india] in set
			
			for(Character chr:set)
			{
				int count=0;
				for(int i1=0;i1<ch.length;i1++){
					if(chr==ch[i1])
					{
						count++;
				}
					
			}
	
			System.out.println(chr+" "+count);
		}
		

	}

}
}
