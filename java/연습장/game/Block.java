class Block implements Runnable {

	public void run() {
		while(true) {
			try {
				Thread.sleep(Setting.speed);
				int row = Setting.blockRow / 2;
				int col = Setting.blockCol;
				System.out.print(Setting.blockCol);
				for(int i = 0; i < 4; i++) {
					Setting.backInt[col][row] = 1;
					Setting.backInt[col-4][row] = 0;
				}
			} catch(Exception e) {
			}
		}
	}

	public void column() {
		
		

	}
}

class BlockDown implements Runnable {

	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				Setting.blockCol++;
			} catch(Exception e) {

			}
		}
	}
}