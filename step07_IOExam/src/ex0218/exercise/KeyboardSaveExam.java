package ex0218.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class KeyboardSaveExam {
	public KeyboardSaveExam() {
		try (
				BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new FileWriter("src/ex0218/exercise/save.txt"))
		) {
			while(true) {
				System.out.print("�Է� > ");
				String context = bs.readLine();
				if(context.equals("exit")) break;
				bw.write(context);
				bw.newLine();
				bw.flush();
				System.out.println("����� ���� > " + context);
			}
		} catch (Exception e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} finally {
			System.out.println("����");
		}
	}
	
	public static void main(String[] args) {
		new KeyboardSaveExam();
	}
}
