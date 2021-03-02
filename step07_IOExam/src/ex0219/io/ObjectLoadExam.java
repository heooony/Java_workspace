package ex0219.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ObjectLoadExam {
	public ObjectLoadExam() {
		try (ObjectInputStream ois = 
				new ObjectInputStream(new FileInputStream("src/ex0219/io/save.txt"))) 
		{
			Student s1 = (Student)ois.readObject();
			Student s2 = (Student)ois.readObject();
			List<Student> list = (List<Student>)ois.readObject();
			
			System.out.println(s1);
			System.out.println(s2);
			System.out.println(list);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new ObjectLoadExam();
	}
}