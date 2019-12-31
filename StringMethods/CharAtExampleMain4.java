package stringmethods;

public class CharAtExampleMain4 
{
	public static void main(String argd[])
	{
		String str = "Welcome to ABCD portal";
		int count = 0;
		for(int i = 0;i<str.length();i++)//Loop till the end of the string
		{
			if(str.charAt(i) == 't')//Compare the values with char 't'
			{
				count++;
			}
		}
		System.out.print("Frequency of t is: "+count);//print count
	}
}