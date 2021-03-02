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
			System.out.print("�̸� > ");
			fileName = br.readLine();
			bw = new BufferedWriter(new FileWriter("src/ex0218/exercise/"+ fileName +".txt"));
			System.out.print("������ > ");
			weight = br.readLine();
			System.out.print("��й�ȣ > ");
			password = br.readLine();
			bw.write(weight + ":" + password);
			System.out.println("���������� ����Ǿ����ϴ�.");
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
