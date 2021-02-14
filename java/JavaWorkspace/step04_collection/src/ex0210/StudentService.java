package ex0210;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
	private List<Student> list = new ArrayList<Student>();
	
	public StudentService() {
		list.add(new Student(100, "김동헌", 24, "경기도"));
		list.add(new Student(200, "김가람", 28, "성남시"));
		list.add(new Student(300, "김향순", 54, "수정구"));
		list.add(new Student(400, "김은수", 59, "성남대로"));
		list.add(new Student(500, "홍길동", 82, "1249번길"));
	}
	/**
	 * 등록하기
	 * return : true이면 등록 성공, false이면 등록 실패
	 */
	public boolean insert(Student student) {
		if(searchBySno(student.getSno()) != null) return false;
		list.add(student);
		return true;
	}
	
	/**
	 * 전체 검색
	 */
	public List<Student> selectAll() {
		return list;
	}
	
	/**
	 * 학번에 해당하는 정보 검색
	 */
	public Student searchBySno(int sno) {
		for(int i = 0; i < list.size(); i++)
			if(sno == list.get(i).getSno())
				return list.get(i);
		return null;
	}
	
	/**
	 * 학번에 해당하는 학생 삭제하기
	 * @return : true이면 삭제 성공, false이면 삭제 실패
	 */
	public boolean delete(int sno) {
		Student student = searchBySno(sno);
		if(student == null) return false;
		list.remove(student);
		return true;
	}
	
	/**
	 * 학번에 해당하는 학생의 정보 수정하기 (이름, 주소)
	 * @return : true이면 수정 성공, false이면 수정 실패
	 */
	public boolean update(Student st) {
		Student student = searchBySno(st.getSno());
		if(student == null) return false;
		student.setName(st.getName());
		student.setAddr(st.getAddr());
		return true;
	}
}
