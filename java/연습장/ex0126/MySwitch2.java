class MySwitch2 {
	public static void main(String [] args) {
		int randNum = (int)(Math.random() * 12) + 1;
		String str = "";
		switch(randNum){
			case 2:
				str = "28일까지 있습니다.";
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				str = "30일까지 있습니다.";
				break;
			default:
				str = "31일까지 있습니다.";
		}
		System.out.print(randNum + "월은 ");
		System.out.println(str);

		
	}
}