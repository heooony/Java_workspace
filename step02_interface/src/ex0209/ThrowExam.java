package ex0209;

import java.io.IOException;

public class ThrowExam  {
	public void ageCheck(int age) {
		if(age < 0) {
//			try {
//				throw new IOException("������ �� �˴ϴ�.");
//			} catch(IOException e) {
//				System.out.println("���� �߻� : " + e.getMessage());
//			}
			
			throw new RuntimeException("������ �� �˴ϴ�.");
		} else {
			System.out.println("���̴� " + age + "�� �Դϴ�.");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("--���� ����--");
		ThrowExam te = new ThrowExam();
		te.ageCheck(-5);
		
		System.out.println("--���� ��");
	}
}
