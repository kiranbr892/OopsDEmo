
public class Staticinitialiser {
	
	public static void main(String[] args) {
		 
		int x=65;
System.out.println("begin of main");
System.out.println(x);
System.out.println(q);
System.out.println(y);
	}
	
	static  int y= m2();
	static int m1()
	{
		int a=2;
		System.out.println(a);
		System.out.println("m1 method");
		return 10;
		
	}
	static  int q= m1();
	 static int m2()
	{
		int a=3;
		System.out.println(a);
		System.out.println("m2 method");
		return 5;
	}

}
