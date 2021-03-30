package Testyantra;

public class sumOfnois7{

	public static void main(String[] args) {
		int[]arr={1,3,4,5,2,6,9,7};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++){
				
				if(arr[i]+arr[j]==7)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
				
			}
		}
		
	
		
		
		
		
		
		
		
		
	}
}