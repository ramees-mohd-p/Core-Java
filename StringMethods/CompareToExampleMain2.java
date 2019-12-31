package stringmethods;

public class CompareToExampleMain2
{
	public static void main(String argd[])
	{
		String str = "hello";
		String str1 = "";
		String str2 = "me";
		System.out.println(str.compareTo(str1));//5 because str1 is null so it will return length of str string
		System.out.println(str1.compareTo(str2));//-2 because str1 is null so it will return string str2 length with - sign
	}
}