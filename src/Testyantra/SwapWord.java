package Testyantra;

public class SwapWord {
	public static void main(String[]args){
		
	String s="Welcome to TestYantra";
	String ch[]=s.split(" ");
	
	 String temp=ch[0];
	ch[0]=ch[ch.length-1];
	ch[ch.length-1]=temp;
	
	for(String x:ch){
		
		System.out.print(s+" ");
	}


}
}
