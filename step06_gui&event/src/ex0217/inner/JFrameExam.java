package ex0217.inner;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.*;

public class JFrameExam extends JFrame implements ActionListener {
	JButton btn1 = new JButton("Ŭ��1");
	JButton btn2 = new JButton("Ŭ��2");
	JTextField text = new JTextField("����ֳ׿�", 30);

	public JFrameExam() {
		super("JFrame �Դϴ�.");
		super.setSize(400, 300);
		super.setLocationRelativeTo(null);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		super.setLayout(new FlowLayout());

		Container con = super.getContentPane();
		con.add(btn1);
		con.add(btn2);
		con.add(text);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		this.addMouseListener(new MEventExam());
		this.addMouseMotionListener(new MDragExam());
	}

	public static void main(String[] args) {
		new JFrameExam();
	}

	class MEventExam extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			text.setText(x + " : " + y);
		}
	}

	class MDragExam extends MouseMotionAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {
			int x = e.getX();
			int y = e.getY();
			btn1.setText(String.valueOf(x));
			btn2.setText(String.valueOf(y));
			
			//innerŬ���� �ȿ��� outer�� ��ü�� ������ �� this, super�� �ٷ� ���� �ʱ� ������
			//���� ������ ����ؾ� �Ѵ�.
			JFrameExam.this.setTitle("x : " + x + ", y : " + y);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
