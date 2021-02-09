class ArrayExam{
	public static void main(String [] args) {

		//각int,double,char,boolean ,String type별로 총 5개씩 저장하는  배열을 생성하세요
		int iArray [] = new int [5];
		double dArray [] = new double [5];
		char cArray [] = new char [5];
		String sArray [] = new String [5];
		boolean bArray [] = new boolean [5];


		//메인메소드에서
		//ArrayExam의 메소드들을 순서대로 호출하세요.
	
		ArrayExam arrayExam = new ArrayExam();

		arrayExam.printArrayValue01(iArray);
		arrayExam.printArrayValue02(iArray);
		arrayExam.printArrayValue03(iArray);

		System.out.println();

		arrayExam.printArrayValue01(dArray);
		arrayExam.printArrayValue02(dArray);
		arrayExam.printArrayValue03(dArray);

		System.out.println();

		//char타입 초기화하면 출력이 안되어서 공백으로 초기화
		for(int i = 0; i < cArray.length; i++)
			cArray[i] = ' ';
		arrayExam.printArrayValue01(cArray);
		arrayExam.printArrayValue02(cArray);
		arrayExam.printArrayValue03(cArray);

		System.out.println();

		arrayExam.printArrayValue01(sArray);
		arrayExam.printArrayValue02(sArray);
		arrayExam.printArrayValue03(sArray);

		System.out.println();

		arrayExam.printArrayValue01(bArray);
		arrayExam.printArrayValue02(bArray);
		arrayExam.printArrayValue03(bArray);
	}

	//메소드 : printArrayValue01	
	//위의 배열들에 자동으로 초기화 된값을 출력하세요
	public void printArrayValue01(int [] iArray) {
		System.out.println("int형 printArrayValue01");
		for(int i = 0; i < iArray.length; i++)
			System.out.print(iArray[i] + ", ");
		System.out.println();
	}

	public void printArrayValue01(double [] dArray) {
		System.out.println("double형 printArrayValue01");
		for(int i = 0; i < dArray.length; i++)
			System.out.print(dArray[i] + ", ");
		System.out.println();
	}

	public void printArrayValue01(char [] cArray) {
		System.out.println("char형 printArrayValue01");
		for(int i = 0; i < cArray.length; i++) {
			System.out.print(cArray[i] + ", ");
		}
		System.out.println();
	}

	public void printArrayValue01(String [] sArray) {
		System.out.println("String형 printArrayValue01");
		for(int i = 0; i < sArray.length; i++)
			System.out.print(sArray[i] + ", ");
		System.out.println();
	}

	public void printArrayValue01(boolean [] bArray) {
		System.out.println("boolean형 printArrayValue01");
		for(int i = 0; i < bArray.length; i++)
			System.out.print(bArray[i] + ", ");
		System.out.println();
	}

	//메소드 : printArrayValue02	
	//위의 5개의 배열에서 각각 적당한 값으로 data를 할당하세요.
	public void printArrayValue02(int [] iArray) {
		for(int i = 0; i < iArray.length; i++)
			iArray[i] = (int)(Math.random() * 10) + 1;
	}

	public void printArrayValue02(double [] dArray) {
		for(int i = 0; i < dArray.length; i++)
			dArray[i] = (Math.random() * 10) + 1;
	}

	public void printArrayValue02(char [] cArray) {
		for(int i = 0; i < cArray.length; i++)
			cArray[i] = (char)(int)('A' + i);
	}

	public void printArrayValue02(String [] sArray) {
		for(int i = 0; i < sArray.length; i++)
			sArray[i] = "sArray" + i;
	}

	public void printArrayValue02(boolean [] bArray) {
		for(int i = 0; i < bArray.length; i++) {
			if((int)(Math.random() * 2) == 1)
				bArray[i] = true;
			else
				bArray[i] = false;

		}
	}

	//메소드 : printArrayValue03	
	//새롭게 할당된값을 출력하세요
	public void printArrayValue03(int [] iArray) {
		System.out.println("int형 printArrayValue03");
		this.printArrayValue01(iArray);
	}

	public void printArrayValue03(double [] dArray) {
		System.out.println("double형 printArrayValue03");
		this.printArrayValue01(dArray);
	}

	public void printArrayValue03(char [] cArray) {
		System.out.println("char형 printArrayValue03");
		this.printArrayValue01(cArray);
	}

	public void printArrayValue03(String [] sArray) {
		System.out.println("String형 printArrayValue03");
		this.printArrayValue01(sArray);
	}

	public void printArrayValue03(boolean [] bArray) {
		System.out.println("boolean형 printArrayValue03");
		this.printArrayValue01(bArray);
	}
}