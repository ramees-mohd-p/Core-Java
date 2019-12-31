package stringmethods;

public class ConcatExampleMain2
{
	public static void main(String argd[])
	{
		String str = "Hello";
		String str1 = "Face@2.0";
		String str2 = "Reader";
		//Concatenating one String
		String str3=str.concat(str1);
		System.out.println(str3);
		//Concatenating two String
		String str4=str.concat(str1).concat(str2);
		System.out.println(str4);
		
	}
}