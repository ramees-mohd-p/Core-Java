package String;

public class split {
public static void main(String args[])
{
	String str="I, as, da, saf, safs, safs, asf";
	String[] str1=str.split(",");//split a string when the ',' occur
	for(String a:str1)
		System.out.print(a);
	
	
	//concating two string
	 String s1,s2;
	 s1="shreyas";
	 s2="shreyas";
	 System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s1==s2);
	 System.out.println(s1.hashCode());
	 System.out.println(s2.hashCode());
	 s2=s1+s2;
	 System.out.println(s1);
	 System.out.println(s2);
	 System.out.println(s1==s2);
	 System.out.println(s1.hashCode());
	 System.out.println(s2.hashCode());
	 
	 System.out.println("---------------------------------------------------------------------------------------");
	 
	 String a="well";
	 String b="well";
	 String ab="All is "+a;
	 System.out.println(ab);
	 String abc="All is well";
	 String abcd="All is well";
	 System.out.println(abc.hashCode());
	 System.out.println(ab.hashCode());
	 System.out.println(abc==abcd);
	 System.out.println(a==b);
	 System.out.println(abcd.hashCode());
      
	 System.out.println("---------------------------------------------------------------------------------------");
	 
	 StringBuilder st1=new StringBuilder("Hello");
	 StringBuilder st2=new StringBuilder("World");
	 System.out.println(st1);
	 System.out.println(st2);

	 System.out.println(st1.hashCode());
	 System.out.println(st2.hashCode());
	 
	 System.out.println(st1);
	 System.out.println(st2);
	 System.out.println(st1.append(st2));
	 System.out.println(st1);
	 System.out.println(st2);
	 System.out.println(st1.hashCode());
	 System.out.println(st2.hashCode());
}

}
