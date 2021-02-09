import java.util.Scanner;

class Game {

	public static void main(String [] args) {

		Setting setting = new Setting();
		Block block = new Block();
		BlockDown blockDown = new BlockDown();

		MyKeyEvent myKeyEvent = new MyKeyEvent();
		myKeyEvent.setVisible(true);

		Thread settingThread = new Thread(setting);
		Thread blockThread = new Thread(block);
		Thread blockDownThread = new Thread(blockDown);
		settingThread.start();
		blockThread.start();
		blockDownThread.start();
		
	}
}