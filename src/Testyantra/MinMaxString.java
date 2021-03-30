
package Testyantra;

public class MinMaxString {

	public static void main(String[] args) {
		String s="Welcome to India";
		String s1[]=s.split(" ");
		
		String var=s1[0];//assume least lengthin s1[0]length=7
	
		for(int i=1;i<s1.length;i++)
		{
			if(s1[i].length()<var.length())
			{
			var=s1[i];
		}
System.out.println(var);
	
for(int i2=1;i<s1.length;i++)
{
if(s1[i2].length()>var.length())	
{
	var=s1[i2];
}
System.out.println(var);
}




}
}
}
