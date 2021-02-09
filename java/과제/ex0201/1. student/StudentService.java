import java.util.Scanner;

//학생의 정보를 등록, 수정, 조회 기능을 담당하는 객체
class StudentService {
	
	private Student [] stArr = new Student [10];
	public static int count;

	//초기 데이터 세팅
	public void init(String [][] data) {
		int cnt = 0;
		for(String [] s : data) {
			stArr[cnt++] = create(s);
			count++;
		}
	}
	
	private Student create(String [] data) {
		Student student = new Student();
		student.setSno(Integer.parseInt(data[0]));
		student.setName(data[1]);
		student.setAge(Integer.parseInt(data[2]));
		student.setAddr(data[3]);
		return student;
	}
	
	//등록
	public boolean insert(Student student) {

		if(this.searchBySno(student.getSno()) != null) {
			return false;
		}

		if(count == stArr.length) {
			return false;
		}

		stArr[count] = student;
		count++;
		return true;
	}

	
	//전체조회
	public Student [] selectAll() {
		return stArr;
	}
	
	
	//학번에 해당하는 정보 조회
	public Student searchBySno(int sno) {
		for(int i = 0; i < count; i++)
			if(stArr[i].getSno() == sno) 
				return stArr[i];
		return null;
	}
	
	//학번에 해당하는 정보를 변경(이름, 나이)
	//인수로 전달된 학번과 일치하는 것을 찾아 있으면 인수 전달된 이름, 나이로 변경하고 못 찾으면 false
	public boolean update(Student student) {
		Student st = new Student();
		st = searchBySno(student.getSno());
		if(student != null) {
			st.setName(student.getName());
			st.setAge(student.getAge());
			return true;
		} else
			return false;
	}
}