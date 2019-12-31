package stringmethods;

import java.util.ArrayList;

public class EqualsExampleMain2
{
	public static void main(String argd[])
	{
		String str="FACENXT";
		System.out.println(str);
		ArrayList<String> list=new ArrayList<>();
		list.add("FACE");
		list.add("FACEPREP");
		list.add("FACENXT");
		list.add("FACENOW");
		for(String str1 : list)
		{
			if(str1.equals(str))
			{
				System.out.println("FACENXT is present");	
			}
		}
	}
}