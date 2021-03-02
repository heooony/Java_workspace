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
				System.out.print("입력 > ");
				String context = bs.readLine();
				if(context.equals("exit")) break;
				bw.write(context);
				bw.newLine();
				bw.flush();
				System.out.println("저장된 구문 > " + context);
			}
		} catch (Exception e) {
			System.out.println("파일을 찾을 수 없습니다.");
		} finally {
			System.out.println("종료");
		}
	}
	
	public static void main(String[] args) {
		new KeyboardSaveExam();
	}
}
