package methods;

public class Demo {
	static int c;
	static int k;

	public void abc() {
		int i = 10;
		int j = 20;
		k = i + j;
		// System.out.println(k);
	}

	public void xyz() {
		int a = 100;
		int b = 200;
		c = a + b;
		// System.out.println(c);
	}

	public static void main(String[] args) {
		System.out.println(c); //  print default value

		Demo d = new Demo();
		d.abc();
		d.xyz();
		System.out.println(c); //  print value of a function
	}

}
