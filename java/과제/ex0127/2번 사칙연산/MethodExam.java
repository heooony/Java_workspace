class MethodExam {
	public static void main(String [] args) {
		int iNum1 = 25;
		int iNum2 = 6;

		FourFundamentalArithmeticOperations f = new FourFundamentalArithmeticOperations();
		f.print(iNum1, iNum2);
	}
}

class FourFundamentalArithmeticOperations {
	public void print(int iNum1, int iNum2) {
		System.out.println();
		System.out.println(iNum1 + "과 " + iNum2 + "에 대한 사칙연산 입니다.");
		addition(iNum1, iNum2);
		subtraction(iNum1, iNum2);
		multiplication(iNum1, iNum2);
		division(iNum1, iNum2);
	}
	public void addition(int iNum1, int iNum2) {
		System.out.println("두 수의 덧셈은 " + (iNum1 + iNum2));
	}
	public void subtraction(int iNum1, int iNum2) {
		System.out.println("두 수의 뺄셈은 " + (iNum1 - iNum2));
	}
	public void multiplication(int iNum1, int iNum2) {
		System.out.println("두 수의 곱셈은 " + (iNum1 * iNum2));
	}
	public void division(int iNum1, int iNum2) {
		System.out.println("두 수의 나눗셈은 " + (iNum1 / iNum2) + "..." + (iNum1 % iNum2));
	}
}