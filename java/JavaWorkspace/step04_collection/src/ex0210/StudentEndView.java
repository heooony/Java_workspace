package ex0210;

import java.util.List;

public class StudentEndView {
	/**
	 * 전체 검색 출력
	 */
	public static void printSelectAll(List<Student> list) {
		System.out.println("----------학생 List " + list.size() + "명----------");
		for(Student st : list) {
			System.out.println(st);
		}
	}
	
	/**
	 * 학번에 해당하는 학생 정보 출력
	 */
	public static void printSearchBySno(Student student) {
		System.out.println(student);
	}
	
	/**
	 * 성공 여부 메시지 출력
	 */
	public static void printMessage(String message) {
		System.out.println(message);
	}
}
