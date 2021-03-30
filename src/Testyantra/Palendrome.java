package Testyantra;

public class Palendrome {

	public static void main(String[] args) {
		
		String s1="Java";
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
		if(s1.equals(rev))
		{
			System.out.println("its a palendrome");
		}else{
			System.out.println("its not a palendrome");
		}
		
	}

}
