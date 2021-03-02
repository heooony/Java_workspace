package ex0218.exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LoadWeight {
	public LoadWeight() {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("이름 > ");
			String name = s.next();
			if(name.equals("exit")) break;
			try (BufferedReader br = new BufferedReader(new FileReader("src/ex0218/exercise/" + name + ".txt"))) {
				String [] info = br.readLine().split(":");
				System.out.println(name + "님 몸무게는 " + info[0] + "kg 이고, 비번은 " + info[1] + "입니다.");
			} catch (IOException e) {
				System.out.println("파일이 존재하지 않습니다. 다시 입력해주세요.");
			} finally {
				System.out.println("시스템을 종료합니다.");
			}
		}
	}
	public static void main(String[] args) {
		new LoadWeight();
	}
}
