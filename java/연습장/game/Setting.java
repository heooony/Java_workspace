import java.util.Scanner;
import java.io.IOException;

class Setting implements Runnable{

	Scanner scanner = new Scanner(System.in);
	char background [][];
	static int backInt [][];
	static int direction;
	static int speed = 10;
	static int col;
	static int row;
	static int blockCol;
	static int blockRow = row / 2;

	Setting() {
		this(20, 10);
	}

	Setting(int col, int row) {

		this.col = col;
		this.row = row;

		background= new char[col][row];
		backInt= new int[col][row];

		for(int i = 0 ; i < col; i++)
			for(int j = 0; j < row; j++)
				backInt[i][j] = 0;
	}

	public void run() {
		while(true) {
			try {
				Thread.sleep(Setting.speed);
				clearScreen();
				getBackground();
			}
			catch (Exception e) {
				
			}
		}
	}

	public void getBackground() {
		
		for(int i = 0 ; i < col; i++) {
			for(int j = 0; j < row; j++) {
				if(backInt[i][j] == 0)
					background[i][j] = 'бр';
				else
					background[i][j] = 'бс';
				System.out.print(background[i][j]);
				
			}
			System.out.println();
		}
		
	}

	public void clearScreen() {

		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		else
			Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
	}
}