package ex0209;

import java.io.IOException;

public class ThrowExam  {
	public void ageCheck(int age) {
		if(age < 0) {
//			try {
//				throw new IOException("음수는 안 됩니다.");
//			} catch(IOException e) {
//				System.out.println("오류 발생 : " + e.getMessage());
//			}
			
			throw new RuntimeException("음수는 안 됩니다.");
		} else {
			System.out.println("나이는 " + age + "살 입니다.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("--메인 시작--");
		ThrowExam te = new ThrowExam();
		te.ageCheck(-5);
		
		System.out.println("--메인 끝");
	}
}
