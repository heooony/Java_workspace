class Printer {

	Printer() {}

	public static void println(int i) {
		System.out.println(i);
	}

	public static void println(boolean b) {
		System.out.println(b);
	}

	public static void println(double d) {
		System.out.println(d);
	}

	public static void println(String s) {
		System.out.println(s);
	}
}

public class Exercise17{
	public static void main(String[] args) {
		Printer.println(10);
		Printer.println(true);
		Printer.println(5.7);
		Printer.println("ȫ�浿");
	}
}