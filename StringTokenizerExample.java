package String;

import java.util.StringTokenizer;

public class StringTokenizerExample 
{
	public static void main(String[] args) 
	{
     String str="I , am , going , to , split , this , String by, space";
     StringTokenizer st=new StringTokenizer(str);
     System.out.println("split by space");
     while(st.hasMoreElements())
     {
    	 System.out.print(st.nextElement().toString());
     }
     System.out.println();
     System.out.println("Split by ,");
     StringTokenizer st2=new StringTokenizer(str, ",");
     while(st2.hasMoreElements())
     {
    	Integer d=Integer.parseInt(st2.nextElement().toString());
    	 
    	 StringBuilder s=new StringBuilder();
    	 s.append(d);
    	 System.out.print(s);
     }
    }
}
