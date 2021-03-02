package ex0217.inner;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;

public class JFrameAnonymousExam extends JFrame implements ActionListener {
	JButton btn1 = new JButton("클릭1");
	JButton btn2 = new JButton("클릭2");
	JTextField text = new JTextField("재미있네요", 30);

	public JFrameAnonymousExam() {
		super("JFrame 입니다.");
		super.setSize(400, 300);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setLayout(new FlowLayout());

		Container con = super.getContentPane();
		con.add(btn1);
		con.add(btn2);
		con.add(text);
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText(e.getActionCommand() + " 클릭");
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText(e.getActionCommand() + " 클릭");
			}
		});
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				text.setText(x + " : " + y);
			}
		});
		this.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				btn1.setText(String.valueOf(x));
				btn2.setText(String.valueOf(y));
				setTitle("x : " + x + ", y : " + y);
			}
		});
	}

	public static void main(String[] args) {
		new JFrameExam();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}