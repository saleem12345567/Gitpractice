package Testyantra;

import java.util.ArrayList;

public class sumofGroupedno {

	public static void main(String[] args) {
	
		String s="123ab10@y";
		int sum=0;
		int no=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
			{
				int n=s.charAt(i)-48;
				no=no*10+n;
			}
			else
			{
				sum=sum+no;
				no=0;
			}
		}
		sum=sum+no;
    System.out.println(sum);
	}
	

}
