class BreakContinueExam01 {
	public static void main(String [] args) {
		for(int i = 1; i <= 10; i ++) {
			//if(i==5) break;
			//if(i==5) continue;
			System.out.print(i + "\t");
		}

		System.out.println("\n======================");

		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
	}
}