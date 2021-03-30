package Testyantra;

public class CharactersSeparate {

	public static void main(String[] args) {
		String s="123@abc456$xyz";
		char ch[]=s.toCharArray();
		
		String no="";
		String special="";
		String alpha="";
		
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='a' && ch[i]=='z'){
				alpha=alpha+ch[i];
			}
			else if(ch[i]>='0' && ch[i]<='9')
			{
				no=no+ch[i];
			}
			else
			{
				special=special+ch[i];
			}
		}
		System.out.println(alpha);
		System.out.println(no);
		System.out.println(special);
				
		
		

	} 

}
