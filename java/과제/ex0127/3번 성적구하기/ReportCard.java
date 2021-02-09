class ReportCard {
	public static void main(String [] args) {

		String name = "김동헌";
		//1. koreanScore, 2. englishScore, 3. mathScore
		int [] scoreArray = new int [3];

		if(args.length == 3)
			for(int i = 0; i < 3; i++)
				scoreArray[i] = Integer.parseInt(args[i]);
		else
			for(int i = 0; i < 3; i++)
				scoreArray[i] = (int)(Math.random() * 56) + 45;

		Calculator calculator = new Calculator();
		calculator.yourInformation(name, scoreArray);
	}
}

class Calculator {

	//총점을 구하는 기능
	private int getTotal(int [] scoreArray) {
		int total = 0;
		for(int i = 0; i < scoreArray.length; i++)
			total += scoreArray[i];
		return total;
	}

	//평균을 구하는 기능
	private double getAverage(int total, int numberOfSubjects) {
		double average = total / (double)numberOfSubjects;
		average = (int)(average * 10) / 10.0;
		return average;
	}

	//등급을 찾는 기능
	private char getGrade(double average) {
		char grade = '\u0000';
		if(average >= 90) grade = 'A';
		else if(average >= 80 && average < 90) grade = 'B';
		else if(average >= 70 && average < 80) grade = 'C';
		else if(average >= 60 && average < 70) grade = 'D';
		else grade = 'F';
		return grade;
	}
	
	//정보를 출력하는 기능
	public void yourInformation(String name, int [] scoreArray) {
		int total = this.getTotal(scoreArray);
		double average = this.getAverage(total, scoreArray.length);
		char grade = this.getGrade(average);

		System.out.println();
		System.out.println(name + "님의 점수는");
		System.out.println("국어점수 : " + scoreArray[0]);
		System.out.println("영어점수 : " + scoreArray[1]);
		System.out.println("수학점수 : " + scoreArray[2]);
		System.out.println("총점 : " + total + ", 평균 : " + average + ", 학점 : " + grade + " 입니다.");
	}
}