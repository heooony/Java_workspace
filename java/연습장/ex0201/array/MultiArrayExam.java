class MultiArrayExam {

	int [][] arr = new int [][]{
		{1, 2, 3, 4, 5},
		{2, 3, 4, 5, 6},
		{3, 4, 5, 6}
	};
	
	public void print() {

		try {
			arr[5][1] = 100;
		} catch (Exception e) {
			System.out.println("해당 인덱스가 존재하지 않습니다.");
		}

		int colLength = arr.length;
		for(int i = 0; i < colLength; i++) {
			int rowLength = arr[i].length;
			for(int j = 0; j < rowLength; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		MultiArrayExam m = new MultiArrayExam();
		m.print();
	}
}