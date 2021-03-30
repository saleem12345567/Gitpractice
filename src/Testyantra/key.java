package Testyantra;

public class key {
	public static void main(String[]args){
		
		int arr[]={10,20,30,40,50};
		
		int key=2;
		for(int i=0;i<key;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				
			}
		}
		

}

	}
