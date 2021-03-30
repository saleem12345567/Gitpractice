package Testyantra;

public class swapwords {

	public static void main(String[] args) {
		
		String s="welcome to india mandya";
		String[] ch = s.split(" ");
		
		String s2="";
		for(int i=0;i<ch.length-1;i++)
		{
			if(i%2==0)
			{
			 String temp=ch[i];
			 ch[i]=ch[i+1];
			 ch[i+1]=temp;
			}
			//s2=s2+" ";
		}
		
for(int j=0;j<ch.length;j++)
{
	System.out.print(ch[j]+ " ");
}
	}

}
