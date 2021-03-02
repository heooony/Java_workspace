package ex0223;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExam {
	public ClientExam() {
		try(Socket sk = new Socket("127.0.0.1", 8000)) {
			PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);
			pw.println("서버에 접속하고 싶어요");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			String serverMessage = br.readLine();
			System.out.println("서버가 보내온 메시지 : " + serverMessage);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ClientExam();
	}
}
