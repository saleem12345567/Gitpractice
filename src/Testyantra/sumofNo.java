package Testyantra;

import java.util.HashSet;

public class sumofNo {

	public static void main(String[] args) {
		int arr[]={1,3,5,4,6,2,4,5};
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			set.add(arr[i]);
	}
		int ary[]=new int[set.size()]	;	
		int i=0;
		for(Integer value:set)
		{
			ary[i]=value;
			i++;
		}
		for(int j=0;j<ary.length;j++){
			for(int j2=0;j2<ary.length;j2++){
				if(arr[j]+arr[j2]==7)
				{
					System.out.println(arr[j]+","+arr[j2]);
				}
			}
			
		}

}
}
