

class TwoDmArray{

	private String [][] twoDmArray;
	
	public void make2DmArray() {
		twoDmArray = new String [10][];
		for(int i = 0; i < 10; i++) {
			twoDmArray[i] = new String [i + 1];
			for(int j = 0; j < i+1; j++) {
				twoDmArray[i][j] = (i + 1) + "µ¿" + (j + 1) + "È£";
			}
		}
	}
	
	public void print2DmArray() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++)
				System.out.print("\t");
			for(int j = i; j < 10; j++) 
				System.out.print(twoDmArray[j][i] + "\t");
			System.out.println();
		}
	}
}

public class TwoDmArrayExam{

	public static void main(String[] args) {
		TwoDmArray tda = new TwoDmArray();
		tda.make2DmArray();
		tda.print2DmArray();
	}
}
