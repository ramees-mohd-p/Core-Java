package stringmethods;

public class EqualsExampleMain1
{
	public static void main(String argd[])
	{
		String str1 = "facenow";
		String str2 = "facenow";
		String str3 = "faceprep";
		String str4 = "facenxt";
		System.out.println(str1.equals(str2));//true because content and case are same
		System.out.println(str1.equals(str3));//false because case is not same 
		System.out.println(str1.equals(str4));//false because content is not same
		}
	}