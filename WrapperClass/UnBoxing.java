package wrapper;

public class UnBoxing {
	public static void main(String args[])
	{
	Integer a=new Integer(10);
	Integer i=a.intValue();
	int j=i;
	System.out.print(a+" "+i+" "+j);
	}
}
