class DoWhileExam01 {
	public static void main(String [] args) {
		int i = 1;
		int j = 1;
		int sum = 0;
		char c = 'A';

		//1. 1~100까지 한 줄로 출력
		System.out.println();
		System.out.println("1~100까지 한 줄로 출력");

		i = 1;
		do {
			System.out.print(i + " ");
			i++;
		} while(i <= 100);

		//2. 1~100까지 10행 10열로 출력 (while문 안에 if문)
		System.out.println();
		System.out.println();
		System.out.println("1~100까지 10행 10열로 출력 (while문 안에 if문)");

		i = 1;
		do {
			System.out.print(i + "\t");
			if(i % 10 == 0)
				System.out.println();
			i++;
		} while(i <= 100);

		//3. A~Z 한줄로 출력
		System.out.println();
		System.out.println("A~Z 한줄로 출력");

		do {
			System.out.print(c + " ");
			c++;
		} while(c <= 'Z');

		//4. 1~100까지의 합 출력
		System.out.println();
		System.out.println();
		System.out.println("1~100까지의 합 출력");
		
		i = 1;
		do {
			sum += i++;
		} while(i <= 100);
		System.out.println(sum);

		//5. 1~100까지 10행 10열로 출력 (while문 안에 while문)
		System.out.println();
		System.out.println("1~100까지 10행 10열로 출력 (while문 안에 while문)");

		j = 1;
		i = 0;
		do {
			do {
				System.out.print(i + j + "\t");
				j++;
			} while(j <= 10);
			j = 1;
			i += 10;
			System.out.println();
		} while(i < 100);

		//6. 구구단 출력
		System.out.println();
		System.out.println("구구단 출력");
		i = 1;
		j = 2;
		do {
			do {
				System.out.print(j + " x " + i + " = " + (j*i) + "\t");
				j++;
			} while(j <= 9);
			j = 2;
			i++;
			System.out.println();
		} while(i <= 9);
	}
}