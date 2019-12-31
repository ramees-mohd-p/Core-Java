package stringmethods;

public class ContainsExampleMain3
{
	public static void main(String argd[])
	{
		String str = "To learn java visit focusacademy.in";
		if(str.contains("focusacademy.in.com"))
		{
			System.out.println("This string contains focusacademy.in");
		}
		else
		{
			System.out.print("Result not found");
		}
	}
}