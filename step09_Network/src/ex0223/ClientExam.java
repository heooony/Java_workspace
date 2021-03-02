package ex0223;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam {
	public ClientExam() {
		try(Socket sk = new Socket("127.0.0.1", 8000)) {
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
			pw.println("������ �����ϰ� �;��");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			String serverMessage = br.readLine();
			System.out.println("������ ������ �޽��� : " + serverMessage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ClientExam();
	}
}
