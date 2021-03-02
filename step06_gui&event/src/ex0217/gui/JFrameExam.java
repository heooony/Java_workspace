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
	JButton btn1 = new JButton("Ŭ��1");
	JButton btn2 = new JButton("Ŭ��2");
	JTextField text= new JTextField("����ֳ׿�", 30);
	public JFrameExam() {
		super("JFrame �Դϴ�."); //Title
		super.setSize(400, 300); //������ â ������ ����
		super.setLocationRelativeTo(null); //ȭ���� ��µǴ� ��ġ�� ����� ����
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //X�� ������ ���α׷��� ���� ����
		super.setVisible(true); //â�� ����ڿ��� ������ �� �ֵ��� ����
		super.setLayout(new FlowLayout()); //layout�� Flow�� ����
		
		Container con = super.getContentPane();
		con.add(btn1);
		con.add(btn2);
		con.add(text);
		btn1.addActionListener(this); // �ڱ� �ڽ��� �ѱ�
		btn2.addActionListener(this);
		this.addMouseListener(new MEventExam(text));
		this.addMouseMotionListener(new MDragExam(this));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object objEvent = e.getSource();
		if(objEvent == btn1) {
			text.setText("���� ��ȭ");
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