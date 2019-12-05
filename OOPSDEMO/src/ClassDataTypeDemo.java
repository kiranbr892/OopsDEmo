class Box
{
	int w=5;
	int h=6;
	int d=7;

}
public class ClassDataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b;
		b=new Box();
		System.out.println("value of b is "+b);
		System.out.println("value of w is "+b.w);		//hardcoding values used
		System.out.println("value of h is "+b.h);
		System.out.println("value of d is "+b.d);
		
		Box a;
		a=new Box();
		a.w =10;
		a.h=11;									//assigning values by dot operator
		a.d= 12;
		System.out.println("value of a is "+a);
		System.out.println("value of w is "+a.w);
		System.out.println("value of h is "+a.h);
		System.out.println("value of d is "+a.d);
		
			
		Box c;
		c=new Box();
		c.w =20;
		c.h=21;
		c.d= 22;
		System.out.println("value of c is "+c);
		System.out.println("value of w is "+c.w);
		System.out.println("value of h is "+c.h);
		System.out.println("value of d is "+c.d);
		
		Box d;
		d=new Box();
		d.w =40;			
		d.h=41;
		d.d= 42;
		System.out.println("value of d is "+d);
		System.out.println("value of w is "+d.w);
		System.out.println("value of h is "+d.h);
		System.out.println("value of d is "+d.d);
		

	}

}
