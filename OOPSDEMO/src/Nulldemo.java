class Demo {

	int a = 5;
	int b = 6;
}

public class Nulldemo {

	public static void main(String[] args) {

		Demo x =null;				// avoid initilisation error 
		System.out.println(x);
		System.out.println(x.a); // execution terminated becz no object created
		System.out.println("hello");
		System.out.println("welcome");
	}

}
