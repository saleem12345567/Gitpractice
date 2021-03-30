package Testyantra;

public class ReplaceI {

	public static void main(String[] args) {
		
		String s="india";
		
		//String s2 = s.replaceAll("i", "I");
		
		//System.out.println(s2);
		
		String res=" ";
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(j)=='i')
			{
				String  s1=s.charAt(j)+"";
				res=res+s1.toUpperCase();
			}else{
				res=res+s.charAt(j);
				
			}
		}
		
   System.out.println(res);
	}

}
