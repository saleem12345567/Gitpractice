package Practice;

public class maxandmin {

	public static void main(String[] args) {
		
	
/*int arr[]={4,3,5,2};
int max=arr[0];
for(int i=1;i<arr.length;i++){
	if (arr[i]>max)
	{
		max=arr[i];
	}
}
System.out.println("max element is" +max);
	}

}

*/
//second largest and smallest

int arr[]={10,5,20,30,4};
int temp;
for(int i=0;i<arr.length;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]>arr[j])
		{
			int temp1=arr[i];
			arr[i]=arr[j];
			arr[j]=temp1;
		}
	}

	//for(int k=0;k<arr.length;k++)
	System.out.println("third smallest element is"+ arr[2]);
}
	}
}
	