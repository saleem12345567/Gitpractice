package Testyantra;

public class Sumof2ArrayExce {

	public static void main(String[] args) {
		
		int a[]={1,2,3};
		int b[]={1,2};
		
		int count =a.length;
		if(b.length>count)
		{
			count=b.length;
		}
		int c[]=new int[count];
		
		for(int i=0;i<count;i++){
		try{
			c[i]=a[i]+b[i];
		}
		catch(Exception e)
		{
			try{
			c[i]=a[i];
		}

		catch(Exception a1)
		{
			c[i]=b[i];
		}
		}
		}
		for(int i=0;i<c.length;i++){
		System.out.print(c[i]+" ");
		}
	}

}
