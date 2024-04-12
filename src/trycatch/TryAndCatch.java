package trycatch;

public class TryAndCatch {

	public static void main(String[] args) {

		try
		{
			int a=10,b=0,c;
			c=b/a;
			System.out.println(c);
		}
		catch (Throwable j) 
		{
			j.getMessage();
		}
		int x=23,y=77,z;
		z=x+y;
		System.out.println(z);

	}

}
