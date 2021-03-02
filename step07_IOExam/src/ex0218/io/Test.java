package ex0218.io;
import java.io.FileInputStream;
public class Test {
	public static void main(String[] args) {
		Object obj1 = new String();
		String obj2 = (String) obj1;
		if(obj2.equals(obj1))
			System.out.println("같다");
		else
			System.out.println("다르다");
	}
}