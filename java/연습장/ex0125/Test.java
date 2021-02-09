/*
   1. 성적표기능을 만들 클래스를 선언하고 메인메소드 작성한다.
   2. 메인메소드안에서 하는 일
       - 본인 이름(String)을 저장할 변수를 선언한다.
       - 국어(int),영어(int),수학(int) 점수(를 저장할 변수를 선언한다.
       - 총점(int), 평균(double), 학점(char)을 저장할 변수를 선언한다.

       - 선언된 국어, 영어, 수학 변수에임의의 점수를 각각 저장한다.
       - 국어, 영어, 수학점수을 총점을 구하여 총점 변수에 저장한다.
       - 총점을 가지고 평균을 구하여 평균 변수에 저장한다.

       - 평균이 90이상이면 학점을 A , 아니며 F  
         //    grade =  평균>=90 ? 'A' : 'F';

       - 이름 , 국어점수, 영어점수, 수학점수, 총점,평균, 학점을 예쁘게 출력해본다.

*/

/**
  본인이름 : 김동헌
  날짜 : 2020. 01. 25
  주제 : 성적 구하기
*/
class Test{
	public static void main(String [] args) {
		String name;
		int koreanScore;
		int mathScore;
		int englishScore;
		int total;
		double average;
		char grade;

		koreanScore = 90;
		englishScore = 100;
		mathScore = 94;

		name = "김동헌";
		total = koreanScore + mathScore + englishScore;
		average = total / 3.0;

		grade = (average>=90) ? 'A' : 'F';

		System.out.println();
		System.out.println(name + "님의 과목 점수는");
		System.out.println("국어점수 : " + koreanScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("영어점수 : " + englishScore  + " 이며,");
		System.out.println("총점 : " + total + ", 평균 : " + average + ", 학점 : " + grade + " 입니다.");

	}	
}






