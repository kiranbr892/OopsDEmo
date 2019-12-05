class BOX
{
	int w;
	int h;
	int d;
}
public class CallbyreferenceDemo 
{

	public static void main(String[] args) 
	{
		
		BOX b= new BOX ();
		System.out.println("value of b of w is "+b.w);
		System.out.println("value of b of h is "+b.h);
		System.out.println("value of b of d is "+b.d);
		b.w=1;
		b.h=2;
		b.d=3;
		System.out.println("value of b of w is "+b.w);
		System.out.println("value of b of h is "+b.h);
		System.out.println("value of b of d is "+b.d);
		
		BOX b1= new BOX ();
		b1.w=8;
		b1.h=9;
		b1.d=10;
		System.out.println("value of b1 of w is "+b1.w);
		System.out.println("value of b1 of h is "+b1.h);
		System.out.println("value of b1 of d is "+b1.d);
		BOX b2;
		b2=b1;
		System.out.println("value of b2 of w is "+b2.w);
		System.out.println("value of b2 of h is "+b2.h);
		System.out.println("value of b2 of d is "+b2.d);
		System.out.println("value of b1 of w is "+b1.w);
		System.out.println("value of b1 of h is "+b1.h);
		System.out.println("value of b1 of d is "+b1.d);
		m1(b);
	}

	static void m1(BOX z)
	{
		System.out.println("value of z of w is "+z.w);
		System.out.println("value of z of h is "+z.h);
		System.out.println("value of z of d is "+z.d);
	}
}
