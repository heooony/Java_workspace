package ex0219.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectSaveExam {
	public ObjectSaveExam() {
		Student st1 = new Student("일일", 24, "성남");
		Student st2 = new Student("이이", 28, "광주");
	
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("삼삼", 54, "분당"));
		list.add(new Student("사사", 59, "여주"));
		list.add(new Student("오오", 80, "양양"));
		
		//객체를 파일에 저장하고 읽어오는 방법은 byte단위에서만 가능하다.
		try (ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/ex0219/io/save.txt"))) 
		{
			oos.writeObject(st1);
			oos.writeObject(st2);
			oos.writeObject(list);
			System.out.println("저장 완료. 파일을 확인하세요!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ObjectSaveExam();
	}
}
