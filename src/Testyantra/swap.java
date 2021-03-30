package Testyantra;

public class swap {

	public static void main(String[] args) {
		
		String s="Welcome to india mandya";
		String[] str = s.split(" ");
		 
		int n=str.length;
		if(str.length%2!=0)
		{
			n=str.length-1;
		}
for(int i=0;i<n;i++)
{
	if(i%2==0)
	{
		String temp=str[i];
		str[i]=str[i+1];
		str[i+1]=temp;
	}
	for(int j=0;j<str.length;j++)
	{
	System.out.print(str[i]+ " ");	
	}
}
	}

}
