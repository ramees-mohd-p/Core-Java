package stringmethods;

public class CompareToExampleMain1 
{
	public static void main(String argd[])
	{
		String str = "hello";
		String str1 = "hello";
		String str2 = "meklo";
		String str3 = "hemlo";
		String str4 = "flag";
		int strLength = str.length();
		//fetching first character
		System.out.println(str1.compareTo(str1));//0 because both are equal
		System.out.println(str1.compareTo(str2));//-5 because "h" is 5 time lower than "m"
		System.out.println(str1.compareTo(str3));//-1 because "l" is 1 time lower than "m"
		System.out.println(str1.compareTo(str4));//2 because "h" is 2 time greater than "f"
	}
}
