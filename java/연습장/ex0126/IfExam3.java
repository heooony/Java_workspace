class IfExam3 {
	public static void main(String [] args) {
		int randNum = (int)(Math.random() * 12) + 1;
		String str = "";
		
		if(randNum == 2)
			str = "28일까지 있습니다.";
		else if(randNum == 4 || randNum == 6 || randNum == 9 || randNum == 11)
			str = "30일까지 있습니다.";
		else
			str = "31일까지 있습니다.";
		
		System.out.print(randNum + "월은 ");
		System.out.println(str);
		
		
	}
}