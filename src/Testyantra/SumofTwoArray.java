package Testyantra;

public class SumofTwoArray {

	public static void main(String[] args) {
		int arr1[]={3,5,7};
		int arr2[]={4,6,8};
		
		int sum=0;
		int arr[]=new int[arr1.length];//to declare size 
		for(int i=0;i<arr1.length;i++)
		{
		
		sum=arr[i]+arr[i];
		arr[i]=sum;
	}
		for(int j=0;j<arr2.length;j++)	{
			System.out.println(arr2[j]);
		}

}
}
