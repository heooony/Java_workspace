package kosta.exam.exception;
/*
 * 게시물이 존재하지 않을 경우 or
 * 게시물 수정, 삭제, 등록에 실패한 경우
 */
public class InexistentException extends RuntimeException {
	public InexistentException() {}
	public InexistentException(String message) {
		super(message);
	}
}