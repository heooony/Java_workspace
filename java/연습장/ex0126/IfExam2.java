class IfExam2 {
	public static void main(String [] args) {
		int randNum = (int)(Math.random() * 10) + 1;
		if(randNum == 1) System.out.println("일요일");
		else if(randNum == 2) System.out.println("월요일");
		else if(randNum == 3) System.out.println("화요일");
		else if(randNum == 4) System.out.println("수요일");
		else if(randNum == 5) System.out.println("목요일");
		else if(randNum == 6) System.out.println("금요일");
		else System.out.println("토요일");
	}
}