package ex0218.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoadWeight {
	public LoadWeight() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("�̸� > ");
			String name = s.next();
			if(name.equals("exit")) break;
			try (BufferedReader br = new BufferedReader(new FileReader("src/ex0218/exercise/" + name + ".txt"))) {
				String [] info = br.readLine().split(":");
				System.out.println(name + "�� �����Դ� " + info[0] + "kg �̰�, ����� " + info[1] + "�Դϴ�.");
			} catch (IOException e) {
				System.out.println("������ �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
			} finally {
				System.out.println("�ý����� �����մϴ�.");
			}
		}
	}
	public static void main(String[] args) {
		new LoadWeight();
	}
}
