 package userdefinedmethods;

public class Void_AnyDataType {
	//to get void type method
	public static void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public static String verify_strings(String str1,String str2) {
		String res;
		if(str1.equalsIgnoreCase(str2)) {
			res="both the strings are equal";
		}
		else {
			res="both string are not equal";
		}
		return res;
	}
	public static boolean verify_values(int x,int y) {
		if(x==y) {
			return true;
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		Void_AnyDataType.add(500, 500);
		String j=Void_AnyDataType.verify_strings("jhansi","JHANSI");
		System.out.println(j);
		boolean p=Void_AnyDataType.verify_values(100,100);
		System.out.println(p);
		

	}

}
