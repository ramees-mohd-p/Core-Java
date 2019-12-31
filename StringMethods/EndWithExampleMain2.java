package stringmethods;

public class EndWithExampleMain2
{
	public static void main(String argd[])
	{
		String str="welcome to ABC.in";
		System.out.println(str.endsWith("in"));
		if(str.contains(".com"))
		{
			System.out.println("This string end with .com");
		}
		else
		{
			System.out.print("it does not end with .com");
		}
	}
}