class ReportCard {
	public static void main(String [] args) {
		//초기화
		String name = "";
		int koreanScore = 0, englishScore = 0, mathScore = 0;
		int total = 0;
		double average = 0.0;
		char grade = '\u0000';

		//값 대입
		name = "김동헌";
		koreanScore = (int)(Math.random() * 56) + 45;
		englishScore = (int)(Math.random() * 56) + 45;
		mathScore = (int)(Math.random() * 56) + 45;
		
		//난수로 생성된 것으로 총합, 평균 구하기
		total = koreanScore + englishScore + mathScore;
		average = total / 3.0;
		average = (int)(average * 10) / 10.0;

		//if구문 활용 grade 값 
		if(average >= 90) grade = 'A';
		else if(average >= 80 && average < 90) grade = 'B';
		else if(average >= 70 && average < 80) grade = 'C';
		else if(average >= 60 && average < 70) grade = 'D';
		else grade = 'F';

		//화면 출력
		System.out.println();
		System.out.println("<if>");
		System.out.println(name + "님의 점수는");
		System.out.println("국어점수 : " + koreanScore);
		System.out.println("영어점수 : " + englishScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("총점 : " + total + ", 평균 : " + average + ", 학점 : " + grade + " 입니다.");
		
		//switch구문 활용 grade 값
		switch((int)average/10) {
			case 9: grade = 'A'; break;
			case 8: grade = 'B'; break;
			case 7: grade = 'C'; break;
			case 6: grade = 'D'; break;
			default: grade = 'F';
		}
		
		//화면 출력
		System.out.println();
		System.out.println("<switch>");
		System.out.println(name + "님의 점수는");
		System.out.println("국어점수 : " + koreanScore);
		System.out.println("영어점수 : " + englishScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("총점 : " + total + ", 평균 : " + average + ", 학점 : " + grade + " 입니다.");
	}
}