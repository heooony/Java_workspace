class forPractice {
	public static void main(String [] args) {

		int sum = 0;

		//1번문제
		for(int i = 1; i <= 100; i++)
			System.out.print(i + " ");
		System.out.println();
		System.out.println();

		//2번문제
		for(int i = 1; i <=100; i++)
			if(i % 5 == 0)
				System.out.print(i + " ");
		System.out.println();
		System.out.println();

		//3번문제
		for(int i = 1; i <=100; i++) {
			System.out.print(i + "\t");
			if( i % 10 == 0 )
				System.out.println();
		}
		System.out.println();

		//4번문제
		for(int i = 1; i <= 10; i++)
			sum += i;
		System.out.print(sum);
		System.out.println();
		System.out.println();
		sum = 0; //초기화

		//5번문제
		for(char c = 'A'; c <= 'Z'; c++)
			System.out.print(c);
		System.out.println();
		System.out.println();

		//6번문제
		for(int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println();

		//7번문제
		for(int i = 100; i >= 1; i--)
			System.out.print(i + " ");
		System.out.println();
	}
}