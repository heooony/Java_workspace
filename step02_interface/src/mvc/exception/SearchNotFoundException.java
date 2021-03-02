package mvc.exception;

public class SearchNotFoundException extends Exception {
	public SearchNotFoundException() {}
	public SearchNotFoundException(String message) {
		super(message);
	}
}