package ex0218.io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyBoardInputExam {
	public KeyBoardInputExam() {
		try {
			Object o;
			String s;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("�Է� > ");
			String str = br.readLine();
			System.out.println("��� : " + str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new KeyBoardInputExam();
	}
}