package Testyantra;

public class Bubblesort {
	
	public static void main(String[]args)
	{
	int arr[]={20,30,40,10};
	
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
			//for(int i=0;i<arr.length;i++)
			{
			//	System.out.println(arr[i]);
			}
	
	//1st maximun
			
	//System.out.println("first max");
//	System.out.println(arr[0]);
	
//sum of 1st three min element		
	int sum=0;
	for(int i=0;i<2;i++)
	{
	
	sum=sum+arr[i];
	}
System.out.println(sum);





	}
}

