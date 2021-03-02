package map_project;

public class StartView {

	public static void main(String[] args) {
		//MVC구조형태 : startView -> controller -> service 
		//1. 전체검색
		MapStudentController.selectAll();
		
		System.out.println();
		
		System.out.println("2.검색하기(Person인경우) ******************");
		MapStudentController.searchById("jang"); //결과 : 이름
		System.out.println();

		System.out.println("2.검색하기(Student인경우) ******************");
		MapStudentController.searchById("king"); //결과 : 이름, 총점
		System.out.println();

		System.out.println("2.검색하기(없는경우) ******************");
		MapStudentController.searchById("test"); //결과 : 예외메시지
		
		System.out.println();
		
		System.out.println("3.등록하기(Person) ******************");
		MapStudentController.insert(new Person("bbb", "시스타", 20));
		System.out.println();

		System.out.println("3.등록하기(Student) ******************");
		MapStudentController.insert(new Student("ccc", "빅뱅", 25, 80, 80, 80));
		System.out.println();

		System.out.println("3.등록하기(id 중복= key 중복) ******************");
		MapStudentController.insert(new Person("jang", "이쁜이", 30));
		System.out.println();

		
		MapStudentController.selectAll();
        System.out.println();
		
		System.out.println("4.삭제하기(성공) ******************");
		MapStudentController.delete("kim");
		System.out.println();

		System.out.println("4.삭제하기(실패) ******************");
		MapStudentController.delete("qqq");
		System.out.println();

		MapStudentController.selectAll();
		System.out.println();
		
		System.out.println("4.수정하기(Person) ******************");
		MapStudentController.update(new Person("jang","이쁘이"));// id와 name만 전달- 생성자추가 
		System.out.println();

		MapStudentController.selectAll();
		System.out.println();

		System.out.println("4.수정하기(Student) ******************");
		MapStudentController.update(new Student("jang","얼짱" , 40, 50, 50)); //-생성자 추가
		//-> 실제 map에 저장된 jang은 Person타입 ,근데
		//   수정하려고 Student 넣으면 안된다..a--이부분에 대한 오류를 안했다
		System.out.println();

		MapStudentController.selectAll();
		System.out.println();

		MapStudentController.update(new Student("king","왕자" , 40,50,50)); //-생성자 추가
		MapStudentController.selectAll();
		System.out.println();
	}
}






