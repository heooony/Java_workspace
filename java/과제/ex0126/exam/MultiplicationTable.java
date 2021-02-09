class MultiplicationTable {
	public static void main(String [] args) {
		
		//1~100까지 10행 10열로 출력 (for문 안에 for문 이용)
		System.out.println();
		System.out.println("<1~100까지 10행 10열로 출력>");
		for(int i = 0; i < 10; i++) {
			for(int j = 1; j <= 10; j++)
				System.out.print((i*10 + j) + " ");
			System.out.println();
		}


		//구구단
		System.out.println();
		System.out.println("<구구단 출력>");
		for(int i = 1; i <= 9; i++) {
			for(int j = 2; j <= 9; j++)
				System.out.print(j + " * " + i + " = " + (i*j) + "\t");
			System.out.println();
		}
	}
}