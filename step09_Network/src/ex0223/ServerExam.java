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
				System.out.println("Ŭ���̾�Ʈ ���� ��� ��");
				Socket sk = server.accept();
				System.out.println(sk.getInetAddress() + " : ���� ����");
			
				InputStream is = sk.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);
				
				String clientMessage = br.readLine();
				System.out.println("Ŭ���̾�Ʈ�� ������ ���� : " + clientMessage);
			
				OutputStream os = sk.getOutputStream();
				PrintWriter pw = new PrintWriter(os, true);
				pw.println("java�Դϴ�.");
				
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
