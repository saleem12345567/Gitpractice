package Practice;

public class ReverseSentence {

	public static void main(String[] args) {
		
	/*	String s="Sky is blue";
		char[] ch=s.toCharArray();
		String rev="";
		
		for(int i=0;i<ch.length;i++)	
		{
			rev=ch[i]+rev;
		
		}
		System.out.println(rev);
		if(s.equals(rev))
		{
			System.out.println("palendrome");
		}else{
			System.out.println("not a palendrome");
		}
*/
		String s1="Sky is blue";
	   String[] ch = s1.split(" ");
	  
	    for(int i=ch.length-1;i>=0;i--)
	    {
	    System.out.print(ch[i]+" ");
	    }
	   
	}

}
