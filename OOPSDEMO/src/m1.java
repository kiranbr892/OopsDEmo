
public class m1 
{

	void fun (int a)
	{
		
		System.out.println("value of int  a is"+a);
	}
	void fun (int a,int b,int c)
	{
		int p= a+b;
		System.out.println("value of a is"+a+" "+b);
		System.out.println("addition of int a and int b is"+p);
	}
	void fun (double a)
	{
		
		System.out.println("value of double a is"+a);
	}
	void fun (int a, double b)
	{
		int q= (int)(a+b);
		System.out.println("value of a is"+a +b);
		System.out.println("value of int a and double b is"+q);
	}
	void fun (double a,int b)
	{
		int r= (int)(a+b);
		System.out.println("value of a is"+a);
		System.out.println("value of double a and int b is"+r);
	}
	

}
