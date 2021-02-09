class MySwitch {
	public static void main(String [] args) {
		int no = (int)(Math.random() * 10) + 1;
		char str = '토';
		switch(no) {
			case 1: str = '일'; break;
			case 2: str = '월'; break;
			case 3: str = '화'; break;
			case 4: str = '수'; break;
			case 5: str = '목'; break;
			case 6: str = '금'; break;
			default: break;
			
		}
		System.out.println(no);
		System.out.print(str);
	}
}