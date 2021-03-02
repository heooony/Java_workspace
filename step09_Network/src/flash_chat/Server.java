package flash_chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
	ServerSocket server;
	Socket sk;
	List<ClientSocketThread> list = new ArrayList<Server.ClientSocketThread>();
	String ip;
	
	public Server() {
		try {
			server = new ServerSocket(9000);
			while(true) {
				System.out.println("Client ���� �����...");
				sk = server.accept();
				ip = sk.getInetAddress().toString();
				System.out.println(sk.getInetAddress() +"�� ���ӵǾ����ϴ�.");
				
				ClientSocketThread th = new ClientSocketThread();
				list.add(th);
				th.start();
			}
			
		} catch(Exception e) {
			
		}
	}
	
	class ClientSocketThread extends Thread {
		BufferedReader br;
		PrintWriter pw;
		String name;
		
		@Override
		public void run() {
			try {
				br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
				pw = new PrintWriter(sk.getOutputStream(), true);
				
				name = br.readLine();
				
				sendMessage("[" + name + "] �� �����ϼ̽��ϴ�.");
				
				String message = null;
				while((message = br.readLine()) != null) {
					sendMessage("[" + name + "]" + message);
				}
			} catch(Exception e) {
				list.remove(this);
				sendMessage("[" + name + "]���� �����ϼ̽��ϴ�.");
				System.out.println(ip + "�ּ��� [" + name + "]�� �����ϼ̽��ϴ�.");
			}
		}
		
		public void sendMessage(String message) {
			for(ClientSocketThread th : list) {
				th.pw.println(message);
			}
		}
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
