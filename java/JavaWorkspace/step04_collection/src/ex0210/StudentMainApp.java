package ex0210;

import java.util.List;

public class StudentMainApp {
	public static void main(String[] args) {
		StudentService service = new StudentService();
		
		
		System.out.println("1. 전체 검색");
		List<Student> list = service.selectAll();
		StudentEndView.printSelectAll(list);
		
		
		System.out.println("2. 추가하기");
		if(service.insert(new Student(600, "장희정", 25, "강의실")))
			StudentEndView.printMessage("추가 성공");
		else
			StudentEndView.printMessage("추가 실패");
		
		if(service.insert(new Student(300, "장희정", 25, "강의실")))
			StudentEndView.printMessage("추가 성공");
		else
			StudentEndView.printMessage("추가 실패");
		
		
		System.out.println("3. 학번에 해당하는 정보 검색");
		StudentEndView.printSearchBySno(service.searchBySno(300));
		StudentEndView.printSearchBySno(service.searchBySno(700));
		
		
		System.out.println("4. 학번에 해당하는 정보 삭제");
		if(service.delete(300))
			StudentEndView.printMessage("삭제 성공");
		else
			StudentEndView.printMessage("삭제 실패");
		
		if(service.delete(700))
			StudentEndView.printMessage("삭제 성공");
		else
			StudentEndView.printMessage("삭제 실패");

		
		System.out.println("5. 학번에 해당하는 정보 수정");
		if(service.update(new Student(100, "몰라요", "광주")))
			StudentEndView.printMessage("수정 성공");
		else
			StudentEndView.printMessage("수정 실패");

		StudentEndView.printSelectAll(list);
		
	}
}
