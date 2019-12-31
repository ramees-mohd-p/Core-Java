package stringmethods;

public class CharAtExampleMain3 
{
	public static void main(String argd[])
	{
		String str = "Welcome to ABCD portal";
		int strLength = str.length();
		//fetching first character
		System.out.println("Character at 1st index is: "+str.charAt(0));
		//The last character is present at the string length-1 index
		System.out.print("Character at Lasst index is: "+str.charAt(strLength-1));
	}
}
