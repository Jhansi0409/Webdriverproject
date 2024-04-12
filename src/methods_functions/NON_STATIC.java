package methods_functions;

public class NON_STATIC {
	int a,b,c;
	public void add() 
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	public void sub()
	{
		a=50;
		b=25;
		c=a-b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		NON_STATIC j=new NON_STATIC();
		j.add();
		j.sub();
		
		

	}

}
