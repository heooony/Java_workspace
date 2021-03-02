package map_project;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class EndView {
	public EndView() { }
	
	public static void printAll(Map<String, Person> map) {
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String key = it.next();
			Person value = map.get(key);
			System.out.println(key + " : " + value);
		}
	}
	
	public static void printSearch(Person person) {
		if(person instanceof Student) {
			Student student = (Student) person;
			System.out.println("이름 : " + student.getName() + ", 총점 : " + student.getSum());
		} else {
			System.out.println("이름 : " + person.getName());
		}
	}

	public static void printMessage(String message) {
		System.out.println(message);
	}
}
