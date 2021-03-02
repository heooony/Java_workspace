package ex0217.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;

public class JFrameExam extends JFrame implements ActionListener{
	JButton btn1 = new JButton("클릭1");
	JButton btn2 = new JButton("클릭2");
	JTextField text= new JTextField("재미있네요", 30);
	public JFrameExam() {
		super("JFrame 입니다."); //Title
		super.setSize(400, 300); //윈도우 창 사이즈 조정
		super.setLocationRelativeTo(null); //화면이 출력되는 위치를 가운데로 조정
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X를 누르면 프로그램도 같이 종료
		super.setVisible(true); //창이 사용자에게 보여질 수 있도록 지정
		super.setLayout(new FlowLayout()); //layout을 Flow로 지정
		
		Container con = super.getContentPane();
		con.add(btn1);
		con.add(btn2);
		con.add(text);
		btn1.addActionListener(this); // 자기 자신을 넘김
		btn2.addActionListener(this);
		this.addMouseListener(new MEventExam(text));
		this.addMouseMotionListener(new MDragExam(this));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object objEvent = e.getSource();
		if(objEvent == btn1) {
			text.setText("내용 변화");
		} else {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		new JFrameExam();
	}
}

class MEventExam extends MouseAdapter {
	JTextField jTextField;
	
	public MEventExam(JTextField jTextField) {
		this.jTextField = jTextField;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		jTextField.setText(x + " : " + y);
	}
}

class MDragExam extends MouseMotionAdapter {
	JFrameExam jFrameExam;
	
	public MDragExam(JFrameExam jFrameExam) {
		this.jFrameExam = jFrameExam;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		jFrameExam.btn1.setText(String.valueOf(x));
		jFrameExam.btn2.setText(String.valueOf(y));
		
		jFrameExam.setTitle("x : " + x + ", y : " + y);
	}
}