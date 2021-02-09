//MethodOverloadingExam.java
class OverloadedMethod{
	private int i;
	private char c;
	private String s;
       
	public void setOverload(int i){
		this.i = i;
	}
	
	public int getOverload(){
		return i;
	}

	//setOverload를 Overloading하세요. 리턴도 하세요.
	public char setOverload(char cName) {
		System.out.println("setOverload char형 실행");
		c = cName;
		return c;
	}

	//setOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	public String setOverload(String sName) {
		System.out.println("setOverload String형 실행");
		s = sName;
		return s;
	}
	//setOverload를 또 또Overloading 하세요. 리턴 안해요
	public void setOverload(int iNum1, int iNum2) {
		System.out.println("setOverload int형 실행");
		i = iNum1 + iNum2;
	}

	//getOverload를 Overloading하세요. 리턴도 하세요.
	public char getOverload(char cName) {
		System.out.println("getOverload char형 실행");
		return cName;
	}
	//getOverload를 또 Overloading 하세요. 또 다른 놈으로 리턴 하세요.
	public String getOverload(String sName) {
		System.out.println("getOverload String형 실행");
		return sName;
	}

	//getOverload를 또 또Overloading 하세요. 리턴 안해요
	public void getOverload(int iNum) {
		System.out.println("getOverload void형 실행");
	}
		
	
}

class  MethodOverloadingExam{
	public static void main(String [] agr){
		OverloadedMethod overloadedMethod = new OverloadedMethod();
		
		//setOverload
		overloadedMethod.setOverload(5);
		overloadedMethod.setOverload('A');
		overloadedMethod.setOverload("안녕");
		overloadedMethod.setOverload(10, 20);

		//getOverload
		int iNum = overloadedMethod.getOverload();
		char cName = overloadedMethod.getOverload('B');
		String sName = overloadedMethod.getOverload("두번째 안녕");
		overloadedMethod.getOverload(10);

		//return 값 출력
		System.out.println(iNum);
		System.out.println(cName);
		System.out.println(sName);
	}
}