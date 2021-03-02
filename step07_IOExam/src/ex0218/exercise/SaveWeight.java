package ex0218.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveWeight {
	public SaveWeight() {
		String fileName = "";
		String weight = "";
		String password = "";
		BufferedWriter bw = null;
		try (
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		) {
			System.out.print("이름 > ");
			fileName = br.readLine();
			bw = new BufferedWriter(new FileWriter("src/ex0218/exercise/"+ fileName +".txt"));
			System.out.print("몸무게 > ");
			weight = br.readLine();
			System.out.print("비밀번호 > ");
			password = br.readLine();
			bw.write(weight + ":" + password);
			System.out.println("정상적으로 저장되었습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		new SaveWeight();
	}
}
