package Testyantra;

public class SumofnoinString {

	public static void main(String[] args) {
		String s="abc123";
		int sum=0;
		 char ch[]=s.toCharArray();
		 
		 for(int i=0;i<ch.length;i++)
		 {
			 if(ch[i]>='0'&&ch[i]<='9')
			 {
				 sum=sum+(ch[i]-48);
			 }
		 }
System.out.println(sum);
	}

}
