package ex0223.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientChatExam {
	public ClientChatExam() {
		try {
			Socket sk = new Socket("127.0.0.1", 8000);
			System.out.println("������ ä���� �����մϴ�.");
			
			new SendThread(sk, "Client").start();
			new Thread() {
				public void run() {
					try(BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()))) {
						String message = null;
						while((message = br.readLine()) != null) {
							if(message.equals("exit")) break;
							System.out.println(message);
						}
						System.out.println("Client ä�� ����");
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
			}.start();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new ClientChatExam();
	}
}
