package ex0223.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChatExam {
	Socket sk;
	public ServerChatExam() {
		try(ServerSocket server = new ServerSocket(8000)) {
			System.out.println("Wait Client...");
			sk = server.accept();
			System.out.println(sk.getInetAddress() + "님과 채팅을 시작합니다.");
			
			//읽기 스레드 시작
			SendThread st = new SendThread(sk, "Server");
			//쓰기 스레드 시작
			ReceiveThread rt = new ReceiveThread("Server");
			
			st.start();
			rt.start();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ServerChatExam();
	}
	
	class ReceiveThread extends Thread {
		public ReceiveThread(String name) {
			super(name);
		}

		@Override
		public void run() {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()))) {
				String message = null;
				while((message = br.readLine()) != null) {
					if(message.equals("exit")) break;
					System.out.println(message);
				}
				System.out.println("서버 받는 스레드 종료.");
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				System.exit(0);
			}
		}
	}
}
