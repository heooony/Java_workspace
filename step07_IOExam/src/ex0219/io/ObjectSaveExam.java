package ex0219.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectSaveExam {
	public ObjectSaveExam() {
		Student st1 = new Student("����", 24, "����");
		Student st2 = new Student("����", 28, "����");
	
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("���", 54, "�д�"));
		list.add(new Student("���", 59, "����"));
		list.add(new Student("����", 80, "���"));
		
		//��ü�� ���Ͽ� �����ϰ� �о���� ����� byte���������� �����ϴ�.
		try (ObjectOutputStream oos = 
				new ObjectOutputStream(new FileOutputStream("src/ex0219/io/save.txt"))) 
		{
			oos.writeObject(st1);
			oos.writeObject(st2);
			oos.writeObject(list);
			System.out.println("���� �Ϸ�. ������ Ȯ���ϼ���!");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ObjectSaveExam();
	}
}
