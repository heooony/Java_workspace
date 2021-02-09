/*
1. 조건문과 반복문의 종류를 괄호 속에 넣어 보세요.

답 : 

조건문 - if, switch

반복문 - for, while, do while

2. 조건문과 반복문을 설명한 것 중 틀린 것은 무엇입니까?

답 : 2번 / double은 switch문에서 사용할 수 없습니다.

3. for문을 이용하여 1부터 100까지의 정수 중에서 3의 배수 총합을 구하는 코드를 작성하세요.

답 :
		int sum = 0;
		for(int i = 1; i < 100; i++)
			if(i % 3 == 0)
			sum += i;
		System.out.print(sum);

4. while문과 Math.random() 메소드를 이용해서 ... 주사위 ... 코드를 작성해보세요

답 :
		int num1 = 0;
		int num2 = 0;

		for( ; ; ) {
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			System.out.println("(" + num1 + ", " + num2 + ")");
			if(num1 + num2 == 5)
				break;
		}

5. 중첩 for 문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y)형태로 출력해보세요.

답 :	for(int i = 1; i <= 10; i++)
			for(int j = 1; j <= 10; j++)
				if((4 * i) + (5 * j) == 60)
					System.out.println("(" + i + ", " + j + ")");


*/

class Ch04
{
	public static void main(String [] args) {
		
	
	}
}