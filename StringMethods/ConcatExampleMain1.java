package stringmethods;

public class ConcatExampleMain1
{
	public static void main(String argd[])
	{
		String str = "java string";
		String str1 = "is immutable";
		System.out.println(str);
		str=str.concat(" is immutable so assign it explicitly");// concate string value to str string variable
		System.out.println(str);// print the value of str string variable
	}
}