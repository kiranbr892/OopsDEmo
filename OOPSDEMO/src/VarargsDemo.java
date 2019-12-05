class Demo
{
	
	void m1(double m,int...a)
	{
		for(int i:a)
			System.out.println(i);
		System.out.println(m);
	}
	
}

public class VarargsDemo {

	public static void main(String[] args) {
		
		System.out.println("begin of main" );
		/*int p =2;
		int q=4;
		int r=5;
		int s=6;
		double t=9;*/
		
		Demo b= new Demo();
		b.m1(1,2,3,4,5,6,7,8,9);
		System.out.println("end of main");

	}

}
