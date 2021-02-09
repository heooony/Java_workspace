import java.util.Scanner;

class ScannerExam {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름은 : ");
		String name = scanner.nextLine();
		System.out.println("입력값 : " + name);
	}
}