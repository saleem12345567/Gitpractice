package Testyantra;

public class Sumof2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a={1,2,3};
		int[]b={4,5,6};
		
		int count=a.length;
		if(count<b.length)
		{
			count=b.length;
		}

		int c[]=new int[count];
		
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				c[i]=a[i]+b[i];
				System.out.println(c[i]);
			}
		}
	
		 if(a.length>b.length)
		{
			for(int i=0;i<b.length;i++)
			{
				c[i]=a[i]+b[i];
						System.out.println(c[i]);
			}
		
		for(int i=b.length;i<a.length;i++)
		{
			c[i]=a[i];
			System.out.println(c[i]);
		}
		
			for(int i=0;i<a.length;i++)
			{
				c[i]=a[i]+b[i];
				System.out.println(c[i]);
			}
		}
			for(int i=a.length;i<b.length;i++)
			{
				c[i]=b[i];
				System.out.println(c[i]);
			}
		}
	}


