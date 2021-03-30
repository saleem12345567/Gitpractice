package Testyantra;

public class Reversecharacters {

	public static void main(String[] args) {
		
		String s="Welcome to tyss";
		String[] str=s.split(" ");
		
	  for(int i=0;i<str.length;i++){
		  
		  String s1=str[i];//Welcome
		  String rev="";
		  for(int j=s1.length()-1;j>=0;j--)//s1=e/j++/m/j++/o/clew
		  {
			  rev=rev+s1.charAt(j);//emoclew
		
		  }
		  System.out.print(rev+" ");
	  }
	  
		
		

	}

}
