class Fox
{
	int w;
	int h;
	int d;
	
	void m(int a, int b,int c)
	{
		 w= a;
		 h= b;
		 d= c;
	}
	int m1()
	{
		int p;
		p=w*h*d;
		return p;
	}
	
	
}


public class ClassDataTYpeMethodDeemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fox b;
		b=new Fox();
		System.out.println("value of w is"+b.w);
		System.out.println("value of h is"+b.h);
		System.out.println("value of d is"+b.d);
	
		b.m(4,5,6);
		System.out.println("value of w is"+b.w);
		System.out.println("value of h is"+b.h);
		System.out.println("value of d is"+b.d);
		
		
		int x= b.m1();
		System.out.println("value of p is "+x);
		
		System.out.println("end of program");
		
	}

}
