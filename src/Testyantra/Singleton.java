package Testyantra;

 class Run{
	public static Run s=new Run();
	private Run()
	{
		System.out.println("its a constructor");
	}
	public static Run getinstance()
	{
		return s;
		
	}
}
public class Singleton
{
	public static void main(String[]args){
		System.out.println(Run.getinstance());
	}
}



