
class ArrayValue{
	//정수형 10개 저장하는 배열선언(선언과 동시에 임의값 지정)
	int iArray[] = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


	/*printArrayValue 메소드작성
       => 메소드 안에서 위에 선언된 배열방의 값을 출력한다.
	*/
	public void printArrayValue() {
		for(int i = 0; i < iArray.length; i++)
			System.out.print(iArray[i] + " ");
	}
}

/////////////////////////////////////////////////
class ArrayValueExam{
	public static void main(String args []){
        // ArrayValue에 있는 printArrayValue메소드 호출
		ArrayValue arrayValue = new ArrayValue();
		arrayValue.printArrayValue();
	}
}