package step08_Thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MultiThreadExam extends JFrame implements ActionListener {
	JTextField text1 = new JTextField(5);
	JTextField text2 = new JTextField(5);
	JButton btn1 = new JButton("Click");
	
	public MultiThreadExam() {
		super("시계 출력");
		setVisible(true);
		setSize(500, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = super.getContentPane();
		con.setLayout(new FlowLayout());
		con.add(text1);
		con.add(text2);
		con.add(btn1);
		
		TimerThread tt = new TimerThread(this);
		DecimalThread dt = new DecimalThread();
		tt.start();
		dt.start();
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						for(char ch='A'; ch <= 'z'; ch++) {
							text2.setText(ch+"");
							try {
								Thread.sleep(10);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}.start();
			}
		});
	}
	
	class DecimalThread extends Thread {
		@Override
		public void run() {
			for(int i = 1; i <= 1000; i++ ) {
				text1.setText(i+"");
				try {
					Thread.sleep(10);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		new MultiThreadExam();
	}

	@Override
	public void actionPerformed(ActionEvent e) {}
}

class TimerThread extends Thread {
	MultiThreadExam mte;
	public TimerThread(MultiThreadExam mte) {
		this.mte = mte;
	}
	
	@Override
	public void run() {
		while(true) {
			Calendar ca = Calendar.getInstance();
			int h = ca.get(Calendar.HOUR_OF_DAY);
			int m = ca.get(Calendar.MINUTE);
			int s = ca.get(Calendar.SECOND);
			mte.setTitle(h +" : " + m + " : " + s);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

