class Abc {
	int w;

	public Abc(int a, int b, int c) {
		int vol = a * b * c;
		w = vol;
		System.out.println(w);
	}

}

public class ConstructorDemo {

	public static void main(String[] args) {
		Abc d = new Abc(1, 2, 7);
		System.out.println(d.w);
	}

}
