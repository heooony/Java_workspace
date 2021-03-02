package flash_chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame{
	JTextArea area = new JTextArea();
	JScrollPane jsp = new JScrollPane(area);
	JTextField text = new JTextField();
	
	Socket sk;
	BufferedReader br;
	PrintWriter pw;
	
	public Client() {
		super("Client Chat");
		Container con = super.getContentPane();
		con.add(jsp, BorderLayout.CENTER);
		con.add(text, BorderLayout.SOUTH);
		
		super.setSize(400, 300);
		super.setLocationRelativeTo(null);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		area.setFocusable(false);
		area.setBackground(Color.pink);
		text.requestFocus();
		
		this.connection();
		
		text.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pw.println(text.getText());
				text.setText("");
			}
		});
		
		new ReceiveThread().start();
	}
	
	class ReceiveThread extends Thread {
		@Override
		public void run() {
			try {
				String message = null;
				while((message = br.readLine()) != null) {
					area.append(message+"\n");
					area.setCaretPosition(area.getText().length());
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void connection() {
		try {
			sk = new Socket("127.0.0.1", 9000);
			pw = new PrintWriter(sk.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
			
			String name = JOptionPane.showInputDialog(this, "이름을 입력해주세요.");
			pw.println(name);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
