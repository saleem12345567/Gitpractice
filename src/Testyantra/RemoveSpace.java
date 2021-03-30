package Testyantra;

public class RemoveSpace {

	public static void main(String[] args) {
		
	String s="Today is Thursday";
    String[]  ch=s.split(" ");
	 
	String removespace="";
	for(int i=0;i<ch.length;i++){
		

		removespace=removespace+ch[i];
		
		
	}
	System.out.println(removespace);

	}

}
