

//요청 결과를 화면에 출력을 해줄 객체
class EndView {

	//전체 조회 출력
	public static void printSelectAll(Student [] stArr) {
		System.out.println("─── STUDENT INFORMATION(" + StudentService.count + " STUDENT)───");
		for(int i = 0; i < StudentService.count; i++) {
			Student st = stArr[i];
			System.out.println(st.getSno() + " | " + st.getName() + " | " + st.getAge() + " | " + st.getAddr());
		}
	}

	//학번에 해당하는 조회 출력
	public static void printSearch(Student student) {
		if(student != null)
			System.out.println(student.getSno() + " | " + student.getName() + " | " + student.getAge() + " | " + student.getAddr());
		else
			System.out.println("일치하는 학번이 없습니다.");
	}

	//등록 or 수정인 경우 성공, 실패 메시지 출력
	public static void printMessage(String message) {
		System.out.println(message);
	}
}