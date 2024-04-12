package methods2;

public class STATIC {
	static int a,b,c;
	
	 public static void add()
	 {
		 a=200;
		 b=300;
		 c=a+b;
		 System.out.println(c);
		 
	 }
	 public static void mul() {
		 a=200;
		 b=5000;
		 c=a*b;
		 System.out.println(c);
	 }
	 
	public static void main(String[] args) {
		add();
		STATIC.mul();
		
		

	}

}
