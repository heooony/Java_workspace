package ex0223.chat;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {
	Socket sk;
	String name;
	
	public SendThread(Socket sk, String name) {
		super(name);
		this.sk = sk;
		this.name = name;
	}
	
	@Override
	public void run() {
		try(PrintWriter pw = new PrintWriter(sk.getOutputStream(), true);) {
			Scanner sc = new Scanner(System.in);
			String data = null;
			while((data = sc.nextLine()) != null) {
				if(data.equals("exit"))
					pw.println(data);
				else
					pw.println(name + " : " + data);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
