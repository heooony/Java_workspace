package test.exam;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.io.IOException;

class Game extends Thread{
	public static void main(String [] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("시작하려면 Enter키를 눌러주세요");
		scanner.nextLine();
		Input x = new Input();
        x.setVisible(true);

		Setting game = new Setting();
		game.reset();
		game.getBackground();

		while(true) {
			try {
				Thread.sleep(Setting.speed);
				game.clearScreen();
			}
			catch (Exception e) {
				System.out.println("게임 점수 : " + Setting.tailCount*100 + "점");
				System.exit(0);
			}
		}
	}
}

class Setting extends Thread{

	Scanner scanner = new Scanner(System.in);
	char background [][];
	int backInt [][];
	static int direction; // 1 up, 2 down, 3 left, 4 right
	static int speed = 70;
	int row;
	int col;
	static int tailCount;
	

	int rowStar = 0;
	int colStar = 0;

	public void run() {
		background [col][row] = '■';
	}

	public void reset() {
		Game g= new Game();
        g.start();

		background= new char[15][15];
		backInt= new int[15][15];
		direction = 4; // 1 up, 2 down, 3 left, 4 right
		row = 0;
		col = 1;
		tailCount = 1;

		for(int i = 0 ; i < 15; i++)
			for(int j = 0; j < 15; j++)
				background[i][j] = '□';

		star();
	}

	public void getBackground() {

		for(int i = 0 ; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				System.out.print(background[i][j]);	
			}
			System.out.println();
		}
		
		
	}

	public void clearScreen() {
		
		brain();
		
		if(rowStar == row && colStar == col) {
			star();
			tailCount++;
			speed -= 2;
		}

		tails();
		try {

		if (System.getProperty("os.name").contains("Windows"))
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else
			Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
		
		//System.out.println(backInt[col][row] + " " + tailCount);
		if(backInt[col][row] != tailCount) {
			System.out.println("게임 점수 : " + tailCount*100 + "점");

			System.exit(0);
		}

		for(int i = 0 ; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				if(backInt[i][j] == 0)
					background[i][j] = '□';
				else
					background[i][j] = '■';
				if(i == colStar && j == rowStar) {
					background[i][j] = '★';
				}
				if(backInt[i][j] > 0)
					backInt[i][j]--;
			}
		}


		this.getBackground();
	}

	public void star() {
		rowStar = (int)(Math.random() * 14);
		colStar = (int)(Math.random() * 14);
	}

	public void brain() {

		if(direction == 1) col--;
		else if(direction == 2) col++;
		else if(direction == 3) row --;
		else row ++;
	}

	public void tails() {
		backInt[col][row] += tailCount;
	}
}



class Input extends JFrame implements KeyListener{

	private JTextArea out;
    private JTextField in;
    public Input(){
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
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) Setting.direction = 3;
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT) Setting.direction = 4;
    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }

    public void process(String s){

    }
}