import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

class MyKeyEvent extends JFrame implements KeyListener{

	private JTextArea out;
    private JTextField in;
    public MyKeyEvent(){
        out = new JTextArea();
        in = new JTextField();
        this.add(out, BorderLayout.CENTER);
        this.add(in, BorderLayout.SOUTH);
        in.addKeyListener(this);
    }

	@Override
    public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_UP) Setting.direction = 1;
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) Setting.direction = 2;
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) Setting.blockRow--;
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) Setting.blockRow++;
    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }

    public void process(String s){

    }
}