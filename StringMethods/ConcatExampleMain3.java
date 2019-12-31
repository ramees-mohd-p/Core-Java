package stringmethods;

public class ConcatExampleMain3
{
	public static void main(String argd[])
	{
		String str = "Hello";
		String str1 = "Face@2.0";
		String str2 = "Reader";
		//Concatenating space among String
		String str3=str.concat(" ").concat(str1).concat(" ").concat(str2);
		System.out.println(str3);
		//Concatenating special char
		String str4=str.concat("!!!");
		System.out.println(str4);
		String str5=str.concat("@").concat(str1);
		System.out.println(str5);	
	}
}