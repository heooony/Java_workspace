package ex0209;

public class AgeCheckException extends Exception{
	static int count;
	AgeCheckException() {}
	AgeCheckException(String message) {
		super(message);
		count++;
	}
}
