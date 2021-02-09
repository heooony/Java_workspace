package cleaning;

import java.util.Scanner;

public class Clean {
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		Student student = new Student();
		FileService.fileOpen();
		
		System.out.print("û���� �л� �� > ");
		int pickNum = scanner.nextInt();
		
		if(Student.studentLength - Student.previousStudentLength < pickNum) 
		{
			System.out.println("���� û���� �л� �� ���� ���� �����ϼ̽��ϴ�.");
			return;
		}
		StudentService studentService = new StudentService(pickNum);
		
		studentService.getStudent();
		String pick[] = studentService.getPickedStudent();
		EndView.print(pick);
		FileService.fileClose(pick);
	}
}