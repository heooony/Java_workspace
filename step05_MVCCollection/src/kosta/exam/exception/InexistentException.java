package kosta.exam.exception;
/*
 * �Խù��� �������� ���� ��� or
 * �Խù� ����, ����, ��Ͽ� ������ ���
 */
public class InexistentException extends RuntimeException {
	public InexistentException() {}
	public InexistentException(String message) {
		super(message);
	}
}