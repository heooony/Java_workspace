package cleaning;

public class EndView {
	public static void print(String pickedName[]) {
		int count = pickedName.length;
		for(int i = 0; i < count; i++) {
			if(i == count - 1) {
				System.out.print(pickedName[i] + "�� �Դϴ�. ");
			} else {
				System.out.print(pickedName[i] + "��, ");
			}
		}
		System.out.println();
	}
}
