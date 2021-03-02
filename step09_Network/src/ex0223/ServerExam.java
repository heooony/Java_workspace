package ex0223;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExam {
	public ServerExam() {
		try(ServerSocket server = new ServerSocket(8000)) {
			while(true) {
				System.out.println("클라이언트 접속 대기 중");
				Socket sk = server.accept();
				System.out.println(sk.getInetAddress() + " : 접속 성공");
			
				InputStream is = sk.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				String clientMessage = br.readLine();
				System.out.println("클라이언트가 보내준 내용 : " + clientMessage);
			
				OutputStream os = sk.getOutputStream();
				PrintWriter pw = new PrintWriter(os, true);
				pw.println("java입니다.");
				
				sk.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ServerExam();
	}
}
