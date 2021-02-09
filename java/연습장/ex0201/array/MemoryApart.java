class MultiArray{
	//정수형 2차원 배열 8*9
	private int arr [][] = new int [8][9];
	
	//메소드이름 :array99
	public void array99() {
		
		//for loop 를 사용하여 
		//배열에 곱한 (구구단)결과저장
		int colLength = arr.length;
		for(int i = 0; i < colLength; i++) {
			int rowLength = arr[i].length;
			for(int j = 0; j < rowLength; j++)
				arr[i][j] = (i + 2) * (j + 1);
		}

		//배열에 결과를 꺼내출력
		for(int[] i : arr) {
			for (int j : i)
				System.out.print(j + "\t");
			System.out.println();
		}
	}
}
public class MemoryApart{
	//main메소드에서 
	//MultiArray객체의 array99메소드호출
	public static void main(String[] args) {
		MultiArray m = new MultiArray();
		m.array99();
	}
}