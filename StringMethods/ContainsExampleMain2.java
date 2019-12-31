package stringmethods;

public class ContainsExampleMain2
{
	public static void main(String argd[])
	{
		String str = "Hello F#A#C#E@2.0 reader";
		boolean isContain = str.contains("F#A#C#E");
		System.out.println(isContain);
		//Case sensitive
		System.out.println(str.contains("FACe"));
	}
}